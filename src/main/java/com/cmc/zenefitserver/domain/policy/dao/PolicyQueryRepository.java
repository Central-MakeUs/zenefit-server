package com.cmc.zenefitserver.domain.policy.dao;

import static com.cmc.zenefitserver.domain.policy.domain.QPolicy.policy;
import static com.cmc.zenefitserver.domain.userpolicy.domain.QUserPolicy.userPolicy;

import com.cmc.zenefitserver.domain.policy.domain.enums.PolicyCode;
import com.cmc.zenefitserver.domain.policy.domain.enums.SupportPolicyType;
import com.cmc.zenefitserver.domain.policy.dto.PolicyListResponseDto;
import com.cmc.zenefitserver.domain.user.domain.User;
import com.querydsl.core.types.*;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class PolicyQueryRepository {

    private final JPAQueryFactory jpaQueryFactory;
    private final EntityManager em;

    public Slice<PolicyListResponseDto> searchBySlice(User user, Long lastPolicyId, SupportPolicyType supportPolicyType, PolicyCode policyCode, Pageable pageable) {
        List<PolicyListResponseDto> results = jpaQueryFactory.select(
                        Projections.constructor(PolicyListResponseDto.class,
                                policy.id,
                                policy.policyName,
                                policy.policyApplyDenialReason,
                                policy.agency,
                                policy.agencyLogo,
                                policy.policyIntroduction,
                                policy.applyStatus,
                                policy.benefit,
                                ExpressionUtils.as(Expressions.constant(false), "applyFlag"),
                                ExpressionUtils.as(Expressions.constant(false), "interestFlag")
                        )
                )
                .from(policy)
                .leftJoin(userPolicy)
                .on(policy.id.eq(userPolicy.policy.id).and(userPolicy.user.userId.eq(user.getUserId())))
                .where(
                        ltPolicyId(lastPolicyId),
                        // 조건
//                        policy.supportPolicyType.eq(supportPolicyType),
                        policy.policyCode.eq(policyCode)
                )
                .orderBy(policySort(pageable))
                .limit(pageable.getPageSize() + 1)
                .fetch();

        return checkLastPage(pageable, results);
    }

    private OrderSpecifier<?> policySort(Pageable pageable) {
        Sort sort = pageable.getSort();
        if (sort != null) {
            for (Sort.Order order : sort) {
                Order direction = order.getDirection().isAscending() ? Order.ASC : Order.DESC;
                switch (order.getProperty()) {
                    case "benefit":
                        return new OrderSpecifier(direction, policy.benefit);
//                    case "endDate" :
//                        return new OrderSpecifier(direction,policy.getEndDate);
                }
            }
        }
        return new OrderSpecifier(Order.ASC, policy.id);
    }

    private BooleanExpression ltPolicyId(Long policyId) {
        if (policyId == null) {
            return null;
        }
        return policy.id.lt(policyId);
    }

    // 무한 스크롤 방식 처리하는 메서드
    private Slice<PolicyListResponseDto> checkLastPage(Pageable pageable, List<PolicyListResponseDto> results) {

        boolean hasNext = false;

        // 조회한 결과 개수가 요청한 페이지 사이즈보다 크면 뒤에 더 있음, next = true
        if (results.size() > pageable.getPageSize()) {
            hasNext = true;
            results.remove(pageable.getPageSize());
        }

        return new SliceImpl<>(results, pageable, hasNext);
    }
}

package com.cmc.zenefitserver.domain.policy.application;

import com.cmc.zenefitserver.domain.policy.dao.PolicyQueryRepository;
import com.cmc.zenefitserver.domain.policy.domain.Policy;
import com.cmc.zenefitserver.domain.policy.domain.enums.PolicyCode;
import com.cmc.zenefitserver.domain.policy.domain.enums.SupportPolicyType;
import com.cmc.zenefitserver.domain.policy.dto.PolicyListRequestDto;
import com.cmc.zenefitserver.domain.policy.dto.PolicyListResponseDto;
import com.cmc.zenefitserver.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PolicyService {

    private final PolicyQueryRepository policyQueryRepository;

    // 정책 리스트 조회 비즈니스 로직
    public Slice<PolicyListResponseDto> getPolicyList(User user, PolicyListRequestDto policyListRequestDto, Pageable pageable) {
        Slice<PolicyListResponseDto> policies = policyQueryRepository.searchBySlice(
                user,
                policyListRequestDto.getLastPolicyId(),
                SupportPolicyType.fromString(policyListRequestDto.getSupportPolicyType()),
                PolicyCode.fromString(policyListRequestDto.getPolicyType()),
                pageable);
        System.out.println("policies = " + policies);
        return policies;
    }
}
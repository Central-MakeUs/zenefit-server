package com.cmc.zenefitserver.domain.policy.dto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
@ApiModel(description = "정책 상세 정보 조회 API response")
public class PolicyInfoResponseDto {

    @ApiModelProperty(notes = "정책 ID",example = "12")
    private Long policyId;

    @ApiModelProperty(notes = "정책 이름",example = "청년도약계좌")
    private String policyName;

    @ApiModelProperty(notes = "정책 불가 사유",example = "신청 기간이 아니에요, ~조건이 맞지 않습니다.")
    private String policyApplyDenialReason;

    @ApiModelProperty(notes = "정책 소개",example = "월 70만원을 5년 납입하면 약 5,000만원을 적립할 수 있는 청년도약계좌")
    private String policyIntroduction;

    @ApiModelProperty(notes = "정책 서류",example = "주민등록등본, 신분증, 소득증빙서류 등")
    private String policyApplyDocument;

    @ApiModelProperty(notes = "신청 방법",example = "주소지 읍·면·동 행정복지센터 방문 또는 등기우편 신청")
    private String policyApplyMethod;

    @ApiModelProperty(notes = "신청 기간",example = "2023년 6월 15일 ~ 2023년 12월 31일")
    private String policyApplyDate;

    @ApiModelProperty(notes = "신청 url",example = "https://www.kinfa.or.kr/product/youthJump.do")
    private String applicationSite;

    @ApiModelProperty(notes = "참고 url",example = "https://www.kinfa.or.kr/product/youthJump.do")
    private String referenceSite;

    @Builder
    public PolicyInfoResponseDto(Long policyId, String policyName, String policyApplyDenialReason, String policyIntroduction, String policyApplyDocument, String policyApplyMethod, String policyApplyDate, String applicationSite, String referenceSite) {
        this.policyId = policyId;
        this.policyName = policyName;
        this.policyApplyDenialReason = policyApplyDenialReason;
        this.policyIntroduction = policyIntroduction;
        this.policyApplyDocument = policyApplyDocument;
        this.policyApplyMethod = policyApplyMethod;
        this.policyApplyDate = policyApplyDate;
        this.applicationSite = applicationSite;
        this.referenceSite = referenceSite;
    }
}

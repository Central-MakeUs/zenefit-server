package com.cmc.zenefitserver.global.common;

import com.cmc.zenefitserver.global.error.ErrorCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

/** API 응답 공통 형식입니다*/
@AllArgsConstructor
@Getter
@ApiModel(value = "기본 응답")
public class CommonResponse<T> {

    @JsonProperty("code")
    @Schema(description = "응답코드", required = true, example = "200")
    private String code;

    @JsonProperty("isSuccess")
    @Schema(description = "성공여부", required = true, example = "true")
    private boolean success;

    @JsonProperty("message")
    @Schema(description = "메시지", required = true, example = "요청에 성공하였습니다.")
    private String message;

    @JsonProperty("result")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Schema(description = "응답 결과", required = false, example = "(응답 결과가 나타납니다.)")
    private T data;

    public static <T> CommonResponse<T> success(T data) {
        return new CommonResponse<>("200", true, "요청에 성공하였습니다.", data);
    }

    public static <T> CommonResponse<T> failure(String code, String message, T data) {
        return new CommonResponse<>(code, false, message, data);
    }

    public static <T> CommonResponse<T> failure(ErrorCode errorCode) {
        return new CommonResponse<>(errorCode.getCode(), false, errorCode.getMessage());
    }

    public CommonResponse(String code, boolean success, String message) {
        this.code = code;
        this.success = success;
        this.message = message;
    }
}
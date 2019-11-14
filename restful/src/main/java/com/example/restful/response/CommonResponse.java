package com.example.restful.response;

/**
 * 公共响应体
 */
public class CommonResponse {
    /**
     * 响应码
     */
    private Integer ResultCode;

    /**
     * 响应信息
     */
    private String Message;

    public CommonResponse(){}

    public CommonResponse(Integer ResultCode,String Message){
        this.ResultCode = ResultCode;
        this.Message = Message;
    }

    public Integer getResultCode() {
        return ResultCode;
    }

    public void setResultCode(Integer resultCode) {
        ResultCode = resultCode;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}

package com.isoftstone.qmp.common;

import static com.isoftstone.qmp.common.constant.BaseConstant.SUCCESS_CODE;
import static com.isoftstone.qmp.common.constant.BaseConstant.SUCCESS_MSG;

public interface IBaseErrorCodeEnum {
    /**
     * 成功响应码
     * @return SUCCESS_CODE
     */
    default String getCode() {
        return SUCCESS_CODE;
    }

    /**
     * 成功响应信息
     * @return SUCCESS_MSG
     */
    default String getMsg() {
        return SUCCESS_MSG;
    }
}

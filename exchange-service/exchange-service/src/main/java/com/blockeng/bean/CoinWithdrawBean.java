package com.blockeng.bean;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CoinWithdrawBean {
    /**
     * 状态编码
     */
    public String statusCode;
    /**
     * 结果描述
     */
    public String resultDesc;
    /**
     * 提币对象
     */
    public CoinWithdrawModel result;

}

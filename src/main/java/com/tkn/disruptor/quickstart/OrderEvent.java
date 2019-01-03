package com.tkn.disruptor.quickstart;

import lombok.Data;

/**
 *  订单类
 */
@Data
public class OrderEvent {
    private Long value;// 订单价格
}

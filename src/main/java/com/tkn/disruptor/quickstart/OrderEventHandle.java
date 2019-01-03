package com.tkn.disruptor.quickstart;

import com.lmax.disruptor.EventHandler;

/**
 *  消费者（时间监听器）
 */
public class OrderEventHandle implements EventHandler<OrderEvent> {

    @Override
    public void onEvent(OrderEvent orderEvent, long l, boolean b) throws Exception {
        Thread.sleep(1000);
        System.err.println("消费者: " + orderEvent.getValue());
    }
}

package com.activemq.demo.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
/**
 * queue2，consumer
 * 如果queue2消费了消息队列中的一条消息，则queue1不能再消费
 */
@Component // required，否则无法接收消息
public class QueueConsumerListenerTwo {
    @JmsListener(destination="${queue.QUEUE}", containerFactory = "queueListener")
    public void readActiveQueue(String message) {
        System.out.println("queue two received：" + message);
    }
}

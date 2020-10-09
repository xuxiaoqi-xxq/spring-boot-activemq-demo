package com.activemq.demo.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * topic2，consumer
 * 能与topic1同时消费消息队列中的同一条消息
 */

@Component // required，否则无法接收消息
public class TopicConsumerListenerTwo {
    @JmsListener(destination="${topic.TOPIC}", containerFactory = "topicListener")
    public void readActiveQueue(String message) {
        System.out.println("topic two  received：" + message);
    }
}

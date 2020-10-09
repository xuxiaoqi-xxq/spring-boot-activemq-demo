package com.activemq.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
// 启用JMS
@EnableJms
public class ActiveMQDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActiveMQDemoApplication.class, args);
    }

}

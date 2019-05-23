package com.lifotech.vpp.microservices.messagetesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class MessagetestingApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(MessagetestingApplication.class, args);

        JmsTemplate jmsTemplate = ctx.getBean(JmsTemplate.class);

        jmsTemplate.convertAndSend("positionQueue", "Here's another string message2");

    }
}

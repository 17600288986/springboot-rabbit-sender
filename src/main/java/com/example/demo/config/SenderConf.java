package com.example.demo.config;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderConf {

    @Bean
    public Queue queue(){
        return new Queue("queue");
    }

    @Bean(name="message")
    public Queue queueMessages1(){
        return new Queue("topic.messages1");
    }

    @Bean(name="message")
    public Queue queueMessage2(){
        return new Queue("topic.messages2");
    }

    @Bean
    public TopicExchange exchange(){
        return new TopicExchange("exchange");
    }



}

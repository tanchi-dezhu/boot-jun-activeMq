package com.boot.jun.activeMq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

/**
 * @author jun
 * @date 2021年05月28日 19:34
 */
@Component
@EnableJms //开启Springboot的Jms
public class ConfigBean {

    @Value("${my.queue.name}")
    private String myQueueName;

    @Bean
    public ActiveMQQueue queue() {
        //创建一个ActiveMQQueue
        return new ActiveMQQueue(myQueueName);
    }
}


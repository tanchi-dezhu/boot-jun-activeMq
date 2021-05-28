package com.boot.jun.activeMq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author jun
 * @date 2021年05月28日 19:32
 */
@SpringBootApplication
@EnableScheduling//开启@Scheduled注解
public class ActiveMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActiveMqApplication.class,args);
    }

}

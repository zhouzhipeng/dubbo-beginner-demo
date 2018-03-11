package com.zhouzhipeng;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2018/3/11:15:31
 */
@SpringBootApplication
@EnableDubboConfiguration
public class Consumer {
    public static void main(String[] args) {
        SpringApplication.run(Consumer.class,args);
    }
}

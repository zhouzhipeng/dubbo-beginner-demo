package com.zhouzhipeng;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2018/3/11:14:57
 */

@SpringBootApplication
@EnableDubboConfiguration
public class Provider {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Provider.class, args);
        new CountDownLatch(1).await(); //hold住应用，防止provider退出
    }

}

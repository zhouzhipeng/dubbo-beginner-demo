package com.zhouzhipeng.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhouzhipeng.IHelloService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = IHelloService.class)
@Component
public class HelloServiceImpl implements IHelloService {

    public String sayHello(String name) {
        return "hello " + name;
    }

}
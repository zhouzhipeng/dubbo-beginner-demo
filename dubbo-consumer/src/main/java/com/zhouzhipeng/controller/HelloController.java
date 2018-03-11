package com.zhouzhipeng.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhouzhipeng.IHelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2018/3/11:15:27
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Reference
    IHelloService iHelloService;

    @RequestMapping
    public String test(@RequestParam String name){
        return iHelloService.sayHello(name);
    }
}

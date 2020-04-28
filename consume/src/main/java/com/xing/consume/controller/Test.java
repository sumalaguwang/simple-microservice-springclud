package com.xing.consume.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xing.consume.server.TestServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot03
 * @description: 消费者测试入口
 * @author: Mr.xing
 * @create: 2020-04-27 17:51
 **/
@RestController
public class Test {
    @Autowired
    private TestServer testServer;

    @HystrixCommand(fallbackMethod = "errorhai")
    @GetMapping("/say")
    public String test(String name){
        return testServer.test(name);
    }

    public String errorhai(String name){
        return "hai "+name+" procet is stop";
    }
}

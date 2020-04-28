package com.xing.product01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot03
 * @description: 测试服务入口
 * @author: Mr.xing
 * @create: 2020-04-27 17:30
 **/
@RestController
public class SayHai {

    @Value("${server.port}")
    String port;

    @GetMapping("/hai")
    public  String  say(String name){

        return "I  say   "+ name +"ni  hao, i from "+port;
    }
}

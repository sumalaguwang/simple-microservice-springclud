package com.xing.feignserver.controller;

import com.xing.feignserver.server.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot03
 * @description: Feign负载测试
 * @author: Mr.xing
 * @create: 2020-04-27 18:38
 **/
@RestController
public class TestFeignController {
    @Autowired
    private TestFeign testFeign;
    @GetMapping("/sai")
    public String sai(String name){
        return testFeign.saihai(name);
    }
}

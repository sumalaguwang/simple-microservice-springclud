package com.xing.consume.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springboot03
 * @description: 实现类
 * @author: Mr.xing
 * @create: 2020-04-27 17:53
 **/
@Service
public class TestServer {
    @Autowired
    private RestTemplate restTemplate;

    public String test(String name){
        return restTemplate.getForObject("http://product01/hai?name="+name,String.class);
    }
}

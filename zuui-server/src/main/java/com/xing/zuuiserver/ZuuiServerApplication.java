package com.xing.zuuiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuuiServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuuiServerApplication.class, args);
    }

}

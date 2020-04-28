package com.xing.product01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Product01Application {

    public static void main(String[] args) {
        SpringApplication.run(Product01Application.class, args);
    }

}

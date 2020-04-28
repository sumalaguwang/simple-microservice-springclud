package com.xing.feignserver.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: springboot03
 * @description: 测试Feign负载均衡效果
 * @author: Mr.xing
 * @create: 2020-04-27 18:32
 **/
@FeignClient(value = "product01")
public interface TestFeign {
    @GetMapping("/hai")
    String saihai(@RequestParam(value="name") String name);
}

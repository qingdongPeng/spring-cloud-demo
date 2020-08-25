package com.pqd.ribbon.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 会自动负载均衡, 调用不同服务
     */
    @GetMapping(value = "/call/data")
    public String getData() {
        return restTemplate.getForObject("http://eureka-client-user-service/user/hello", String.class);
    }
}

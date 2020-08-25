package com.pqd.hystrix.rest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pqd.hystrix.service.IUserRemoteClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRest {

    @Autowired
    private IUserRemoteClientService userRemoteClientService;

    @GetMapping(value = "/callHello")
    //@HystrixCommand(fallbackMethod = "callHelloFallBack")
    public String callHello() {
        return userRemoteClientService.hello();
    }

    public String callHelloFallBack() {
        return "系统异常, 调用失败0";
    }

}

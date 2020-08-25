package com.pqd.feign.rest;

import com.pqd.feign.service.IUserRemoteClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRest {

    @Autowired
    private IUserRemoteClientService userRemoteClientService;

    @GetMapping(value = "/callHello")
    public String callHello() {
        //return restTemplate.getForObject("http://localhost:8202/user/hello", String.class);
        //return restTemplate.getForObject("http://eureka-client-user-service/user/hello", String.class);
        String result = userRemoteClientService.hello();
        System.out.println(result);
        return result;
    }
}

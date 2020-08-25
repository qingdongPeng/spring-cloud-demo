package com.pqd.hystrix.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * FeignClient注解标识当前是一个Feign的客户端
 * value里指定服务名即可
 */
@FeignClient(value = "eureka-client-user-service", fallback = UserFallBackService.class)
public interface IUserRemoteClientService {

    @GetMapping(value = "/user/hello")
    String hello();

}

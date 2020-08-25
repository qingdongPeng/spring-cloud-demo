package com.pqd.hystrix.service;

import org.springframework.stereotype.Service;

@Service
public class UserFallBackService implements IUserRemoteClientService {

    @Override
    public String hello() {
        System.out.println("系统繁忙, 调用失败");
        return "系统繁忙, 调用失败";
    }

}

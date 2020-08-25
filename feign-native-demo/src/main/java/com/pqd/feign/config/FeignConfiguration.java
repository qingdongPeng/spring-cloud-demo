package com.pqd.feign.config;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 可用代码配置, 也可以用配置文件配置
 */
@Configuration
public class FeignConfiguration {

    /**
     * 日志级别
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        /**
         * NONE : 不输出日志
         * BASIC : 只输出请求方法的URL和响应的状态码以及接口执行的时间
         * HEADERS : 将BASIC信息和请求头信息输出
         * FULL : 输出完整的请求信息
         */
        return Logger.Level.BASIC;
    }


    /**
     * 超时时间配置
     */
    @Bean
    public Request.Options options() {
        //第一个值为连接超时时间(ms), 第二个值为取读超时时间(ms)
        return new Request.Options(5000, 10000);
    }
}

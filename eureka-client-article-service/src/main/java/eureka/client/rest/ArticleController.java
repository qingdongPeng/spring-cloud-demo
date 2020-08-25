package eureka.client.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ArticleController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/article/callHello")
    public String callHello() {
        /**
         * 可以直接写固定地址调用
         * 也可以写成服务名称调用, 即注册到Eureka中名称
         */
        //return restTemplate.getForObject("http://localhost:8202/user/hello", String.class);
        return restTemplate.getForObject("http://eureka-client-user-service/user/hello", String.class);
    }

}

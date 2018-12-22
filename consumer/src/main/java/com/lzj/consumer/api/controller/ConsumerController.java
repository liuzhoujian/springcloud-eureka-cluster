package com.lzj.consumer.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getOrder")
    public String getOrder() {
        //调用生产者的服务 PRC远程服务调用
        String serviceUrl = "http://app-producer/getMember";
        //在注册中心根据app-producer转换为对应的IP地址，底层调用httpClient发起调用
        String result = restTemplate.getForObject(serviceUrl, String.class);
        return result;
    }

}

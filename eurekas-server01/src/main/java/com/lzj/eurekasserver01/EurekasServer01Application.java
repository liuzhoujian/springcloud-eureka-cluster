package com.lzj.eurekasserver01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekasServer01Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekasServer01Application.class, args);
    }
}

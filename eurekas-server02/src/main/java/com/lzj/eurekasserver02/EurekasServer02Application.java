package com.lzj.eurekasserver02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekasServer02Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekasServer02Application.class, args);
    }
}

package com.joryun.micro.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author joryun
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MicroEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroEurekaServerApplication.class, args);
    }
}

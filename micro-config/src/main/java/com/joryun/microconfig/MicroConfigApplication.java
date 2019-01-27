package com.joryun.microconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author joryun
 */
@SpringBootApplication
@EnableConfigServer
public class MicroConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroConfigApplication.class, args);
    }

}


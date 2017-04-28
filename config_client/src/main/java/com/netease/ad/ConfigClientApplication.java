package com.netease.ad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigClientApplication {
    @Value("${foo}")
    private String foo;

    @GetMapping(value = "/hello")
    public String hello() {
        return foo;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}

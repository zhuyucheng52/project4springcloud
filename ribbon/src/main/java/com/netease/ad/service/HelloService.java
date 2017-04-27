package com.netease.ad.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by bjzhuyucheng on 2017/4/27.
 */
@Service
@Slf4j
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    public String hiService (String name) {
        log.info("hi service {}", name);
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }
}

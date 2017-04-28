package com.netease.ad.web;

import com.netease.ad.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bjzhuyucheng on 2017/4/27.
 */
@RestController
@Slf4j
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hello")
    public String hi(@RequestParam String name) {
        log.info("hello {}", name);
        return helloService.hiService(name);
    }

}

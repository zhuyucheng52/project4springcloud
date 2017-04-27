package com.netease.ad.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by bjzhuyucheng on 2017/4/27.
 */
@FeignClient(name = "service-hi", fallback = SchedualServiceHiHystric.class)
@Service
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi")
    public String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

package com.netease.ad.service;

import org.springframework.stereotype.Component;

/**
 * Created by bjzhuyucheng on 2017/4/27.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}

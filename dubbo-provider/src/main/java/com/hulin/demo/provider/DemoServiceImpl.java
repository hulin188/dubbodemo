package com.hulin.demo.provider;

import com.hulin.demo.DemoService;

/**
 * Created by hulin on 2017/10/30.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return name + ": say Hello!";
    }
}

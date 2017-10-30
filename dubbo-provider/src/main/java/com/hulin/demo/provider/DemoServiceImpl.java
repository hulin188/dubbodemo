package com.hulin.demo.provider;

import com.hulin.demo.DemoService;

/**
 * Created by hulin on 2017/10/30.
 */
public class DemoServiceImpl implements DemoService {
    public void sayHello(String name) {
        System.out.println(name + ": say Hello!");
    }
}

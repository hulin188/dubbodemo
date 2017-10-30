package com.hulin.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hulin on 2017/10/30.
 */
public class Consumer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"META-INF/spring/dubbo-demo-consumer.xml"}
        );
        context.start();
        DemoService service = (DemoService)context.getBean("demoService");
        service.sayHello("Zhang San");
        context.close();
    }
}

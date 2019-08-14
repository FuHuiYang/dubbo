package com.yang;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : yangfuhui
 * @Project: dubbo
 * @Package com.yang
 * @Description: TODO
 * @date Date : 2019年08月14日 10:32
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SayHello sayHello = (SayHello) ctx.getBean("sayHello");
        String s = sayHello.sayHello("张三");
        System.out.println(s);
    }
}

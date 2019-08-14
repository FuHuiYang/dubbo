package com.yangfuhui;

import com.yang.SayHello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

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
        ctx.start();
        try {
            int read = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

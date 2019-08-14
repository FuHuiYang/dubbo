package com.yangfuhui;

import com.yang.SayHello;

/**
 * @author : yangfuhui
 * @Project: dubbo
 * @Package com.yangfuhui
 * @Description: TODO
 * @date Date : 2019年08月14日 10:29
 */
public class SayHelloImpl implements SayHello {
    public String sayHello(String name) {
        return "Hello"+name;
    }
}

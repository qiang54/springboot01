package com.springboot.spring_boot_starter_hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created with IntelliJ IDEA.
 * User qiang
 * Date 2018/7/26 14:31
 * To change this template use File | Settings | File Templates.
 */

@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    private static final String MSG = "world";
    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

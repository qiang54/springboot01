package com.springboot.spring_boot_starter_hello;

/**
 * Created with IntelliJ IDEA.
 * User qiang
 * Date 2018/7/26 14:40
 * To change this template use File | Settings | File Templates.
 */
public class HelloService {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String sayHello(){
        return "Hello " + msg;
    }
}

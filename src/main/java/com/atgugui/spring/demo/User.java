package com.atgugui.spring.demo;

/**
 * @ClassName User
 * @Author guoxiaobing
 * @Date 2020/5/28 19:28
 * @Version 1.0
 * @Description TODO
 */
public class User {
   /*
    private String name;
    *//**
     *  No default constructor found; nested exception is java.lang.NoSuchMethodException: com.atgugui.spring.demo.User.<init>()
     *  加了有参数的构造函数后，就没有了五参的构造会报错
     * @param name
     *//*
    public User(String name) {
       this.name = name;
    }*/

    public void add(){
        System.out.println("add...");
    }
}

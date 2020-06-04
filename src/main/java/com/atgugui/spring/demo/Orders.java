package com.atgugui.spring.demo;

/**
 * @ClassName Orders
 * @Author guoxiaobing
 * @Date 2020/6/2 19:37
 * @Version 1.0
 * @Description TODO
 */
public class Orders {
    private String name;
    private String address;

    public Orders(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void testOrders(){
        System.out.println(this.address+"::"+this.name);
    }
}

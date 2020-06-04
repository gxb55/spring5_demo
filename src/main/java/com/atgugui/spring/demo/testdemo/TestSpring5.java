package com.atgugui.spring.demo.testdemo;

import com.atgugui.spring.demo.Book;
import com.atgugui.spring.demo.Orders;
import com.atgugui.spring.demo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @ClassName TestSpring5
 * @Author guoxiaobing
 * @Date 2020/5/28 19:43
 * @Version 1.0
 * @Description TODO
 */
public class TestSpring5 {
    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    /**
     * set注入 bean中加入<property
     */
    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testBook();
    }

    /**
     * 构造函数创建对象 bean中假如<constructor-arg
     */
    @Test
    public void testOrders(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.testOrders();
    }
}

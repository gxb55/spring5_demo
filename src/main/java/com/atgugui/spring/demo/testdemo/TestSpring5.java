package com.atgugui.spring.demo.testdemo;

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
}

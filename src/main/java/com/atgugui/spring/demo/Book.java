package com.atgugui.spring.demo;

/**
 * @ClassName Book
 * @Author guoxiaobing
 * @Date 2020/6/2 19:32
 * @Version 1.0
 * @Description TODO
 */
public class Book {
    private String name;
    private String author;
    private String desc;

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void testBook(){
        System.out.println(this.name+"::"+this.author+"::"+this.desc);
    }
}

package com.heat;

public class Book {

    /**
     * 创建属性
     */
    private String name;
    private String author;

    /**
     * set方法注入
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void testDemo(){
        System.out.println(name+"::"+author);
    }
}

package com.heat;

/**
 * 使用有参构造注入
 */
public class Order {
    private String name;
    private String address;

    public Order(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void orderTest() {
        System.out.println(name + "::" + address);
    }
}

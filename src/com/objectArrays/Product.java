package com.objectArrays;

public class Product {

    private int price;
    private int count;
    private String name;

    public Product(int price, int count, String name) {
        this.price = price;
        this.count = count;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

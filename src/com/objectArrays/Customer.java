package com.objectArrays;

import java.util.List;

public class Customer extends Person {

    private List<Product> productList;

    public Customer(String name, String surname, int age) {
        super(name, surname, age);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}

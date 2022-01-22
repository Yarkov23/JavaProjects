package com.objectArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Salesman extends Person {

    private List<Product> productList = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public Salesman(String name, String surname, int age) {
        super(name, surname, age);
    }



}

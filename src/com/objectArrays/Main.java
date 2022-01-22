package com.objectArrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        market.addSalesman(salesmanInit());
        market.getSalesmanList();
    }

    public static Salesman salesmanInit(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the name of salesman: ");
        String name = in.next();
        System.out.println("Enter the surname of salesman: ");
        String surname = in.next();
        System.out.println("Enter the age of salesman: ");
        int age = in.nextInt();

        Salesman salesman = new Salesman(name,surname,age);
        return salesman;
    }

}

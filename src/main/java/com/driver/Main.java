package com.driver;

public class Main {
    public static void main() {
        Product p = new Product();
        System.out.println(p.product(2, 3));
        System.out.println(p.product(5,6,7));
        System.out.println(p.product(4.5, 9.0));
    }
}


package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name = "Anoop"; // Error: Cannot access private member
//        System.out.println(obj.name); // Error: Cannot access private member

        obj.setName("Anoop");
        String name = obj.getName();
        System.out.println(name);


    }
}
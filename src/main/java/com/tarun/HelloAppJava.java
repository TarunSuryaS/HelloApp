package com.tarun;

public class HelloAppJava {
    public static void main(String[] args) {

        // Ternary operator to handle default value
        String name = (args.length > 0) ? args[0] : "World";

        System.out.println("Hello, " + name + "!");
    }
}
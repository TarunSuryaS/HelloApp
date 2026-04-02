package com.tarun;

public class HelloAppJava {
    public static void main(String[] args) {

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Arguments present
        StringBuilder names = new StringBuilder();

        for (String name : args) {
            if (names.length() > 0) {
                names.append(", ");
            }
            names.append(name);
        }

        System.out.println("Hello, " + names + "!");
    }
}
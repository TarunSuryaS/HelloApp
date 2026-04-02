package com.tarun;

public class HelloAppJava {
    public static void main(String[] args) {

        // Case 1: No arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Arguments present
        StringBuilder nameBuilder = new StringBuilder();

        // Enhanced for loop to append names
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", " using substring
        String names = nameBuilder.substring(0, nameBuilder.length() - 2);

        // Final output
        System.out.println("Hello, " + names + "!");
    }
}
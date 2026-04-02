package com.tarun;

public class HelloAppJava {
    public static void main(String[] args) {

        String message;

        // Check if arguments are provided
        if (args.length == 0) {
            message = "Hello, World!";
        } else {
            // Join names using String.join()
            String names = String.join(", ", args);
            message = "Hello, " + names + "!";
        }

        // Print output
        System.out.println(message);
    }
}
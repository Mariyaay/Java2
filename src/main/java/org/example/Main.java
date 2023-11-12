package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String text = "My name is <Test>";
        System.out.println("Please enter your new name:");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Your new name is: " + userName);
        String modified_text = text.replaceAll("<Test>", userName);

        // Display the strings for comparison.
        System.out.println("Original string: " + text);
        System.out.println("New String: " + modified_text);
    }
}
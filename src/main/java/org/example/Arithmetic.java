package org.example;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        System.out.println(c > a ? "c is greater" : "a is greater or equal");
        System.out.println(c > b ? "c is greater" : "b is greater or equal");

        int lenght = 5;
        int width = 2;
        int parameter = 2 * lenght + 2 * width;
        int area = lenght * width;
        System.out.println("Area of rectangle: " + area);
        System.out.println("Parameter of rectangle: " + parameter);

        int number = 10;
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");

        }
        System.out.println("Enter month number");
        Scanner scanner = new Scanner(System.in);
        int mon = scanner.nextInt();
        printMonthOfTheYear(mon);
    }

    public static void printMonthOfTheYear(int month) {
        switch (month) {
            case 1:
                System.out.printf("Entered %d. You have selected January\n", month);
                break;
            case 2:
                System.out.printf("Entered %d. You have selected February\n", month);
                break;
            case 3:
                System.out.printf("Entered %d. You have selected March\n", month);
                break;
            case 4:
                System.out.printf("Entered %d. You have selected April\n", month);
                break;
            case 5:
                System.out.printf("Entered %d. You have selected May\n", month);
                break;
            case 6:
                System.out.printf("Entered %d. You have selected June\n", month);
                break;
            case 7:
                System.out.printf("Entered %d. You have selected July\n", month);
                break;
            case 8:
                System.out.printf("Entered %d. You have selected August\n", month);
                break;
            case 9:
                System.out.printf("Entered %d. You have selected September\n", month);
                break;
            case 10:
                System.out.printf("Entered %d. You have selected October\n", month);
                break;
            case 11:
                System.out.printf("Entered %d. You have selected November\n", month);
                break;
            case 12:
                System.out.printf("Entered %d. You have selected December\n", month);
                break;
        }
 }
}






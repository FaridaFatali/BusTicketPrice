package org.example;

import java.util.Scanner;

/**
 * Exercise: https://www.youtube.com/watch?v=ejBkgCOW0pw&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=12
 * @author Farida Fatali
 */

/* Finding the ticket price according to the entered age, distance and trip type.
 * Apply discounts suitable for age and travel type to ticket prices.
 */

public class TicketPrice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance as km: ");
        double distance = scanner.nextDouble();

        double price = distance * 0.10;

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Select trip type: \n1. One way \n2. Round trip");
        int trip = scanner.nextInt();

        double amount = 0;
        String message = "The amount: ";

        if (trip == 1 && (age >= 0) && (distance >= 0)) {

            if (age < 12) {
                amount = price - (price * 0.5);
            } else if (age < 24) {
                amount = price - (price * 0.1);
            } else if (age < 65) {
                amount = price;
            } else if (age > 65) {
                amount = price - (price * 0.3);
            }
            System.out.println(message + amount);

        } else if (trip == 2 && (age >= 0) && (distance >= 0)) {
            amount = 2 * (price - (price * 0.2));
            System.out.println(message + amount);
        } else {
            System.out.println("Wrong!");
        }

    }

}



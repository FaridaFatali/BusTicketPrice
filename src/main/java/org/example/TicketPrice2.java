package org.example;

import java.util.Scanner;

// Code by the mentor

public class TicketPrice2 {
    public static void main(String[] args) {
        int km = 0;
        int age = 0;
        int tripType = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance as km: ");
        km = scanner.nextInt();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Enter the trip type: \n1. One way \n2. Round trip");
        tripType = scanner.nextInt();

        if(km > 0 && age > 0 && (tripType == 1 || tripType == 2)){
            double ticketPrice = km * 0.1;
            double ageDiscountRate = 0;
            
            if(age < 12){
                ageDiscountRate = 0.5;
            } else if (age >= 12 && age <= 24) {
                ageDiscountRate = 0.1;
            } else if (age > 65) {
                ageDiscountRate = 0.3;
            }
            ticketPrice -= ticketPrice * ageDiscountRate;

            if(tripType == 2){
                ticketPrice -= ticketPrice * 0.2;
                ticketPrice *= 2;
            }
            System.out.println("Total amount: " + ticketPrice);
        } else {
            System.out.println("You entered wrong data!");
        }
    }
}

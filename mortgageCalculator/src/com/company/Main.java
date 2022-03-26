package com.company;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//* Excercise based on Programming With Mosh, Java tutorial /*

        /*@TODO
            ELEVATING THE PROGRAM
            1.Simple mortgage calculations with input *(COMPLETED)
            2.GUI using JAVAFX
            3.API connection to search for houses
         */

        /* NUMBERS NEEDED - PRINCIPAL, ANNUAL INTEREST, PERIOD, MORTGAGE
         */

    getMortgage();

    }
    static void getMortgage() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal: ");
        int principal = scanner.nextInt();
        System.out.println("Annual Interest Rate: ");
        float interest = scanner.nextFloat();
        System.out.println("Period (Years): ");
        byte period = scanner.nextByte();
        int numberOfPayments = period * 12;

        float monthlyInterest = interest/100/12;

        double mortgage = principal * (monthlyInterest * Math.pow( 1 + monthlyInterest,numberOfPayments) / (Math.pow( 1 + monthlyInterest,numberOfPayments)- 1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}

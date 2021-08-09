package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final int Months_Per_Year = 12;
        final int Percent = 100;

        int principal;
        float annualInterestRate;
        float monthlyInterest;

        Scanner scanner = new Scanner(System.in);
while(true) {
    System.out.print("Principal :");
     principal = scanner.nextInt();
    if (principal >=1000 && principal <=1000000)
        break;
    System.out.println("Enter a value between 1000 and 1000000");
}

while (true) {
    System.out.print( "Annual Interest Rate :");
    annualInterestRate = scanner.nextFloat();
    if(annualInterestRate >= 0 && annualInterestRate <= 30) {
        monthlyInterest = annualInterestRate / Percent / Months_Per_Year;
        break;
    }
    System.out.println("Enter a value between 0.1 and 30");
}

        System.out.print("Period in years :");
        int periodInMonths = scanner.nextInt()*Months_Per_Year;

        double interestRateCalc = Math.pow(1 + monthlyInterest,periodInMonths);

        double mortgage = principal * monthlyInterest * interestRateCalc
                        /(interestRateCalc - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage :"+ mortgageFormatted);
    }
}

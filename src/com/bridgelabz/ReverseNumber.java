package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int rev=0,rem;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number :");
        int number=scanner.nextInt();
        while(number!=0) {
            rem = number % 10;
            rev = rev * 10 + rem;
            number=number/10;

        }
        System.out.println("Reverse Number :"+rev);
    }
}

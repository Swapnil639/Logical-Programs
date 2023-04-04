package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Fibonacci Series 0 1 1 2 3 5 8 13 21 34 55 89
        int a=0,b=1,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number :");
        int n=scanner.nextInt();
        System.out.print(a+" "+b);
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}

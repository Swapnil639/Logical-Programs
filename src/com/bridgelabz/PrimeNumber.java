package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int temp=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number :");
        int n=scanner.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                temp=temp+1;
            }
        }
        if(temp>0)
            System.out.println(n+" is not prime number");
        else
            System.out.println(n+" is prime number");
    }
}

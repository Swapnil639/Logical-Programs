package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter number : ");
        int n=scanner.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0)
            {
                sum = sum + i;
                System.out.println(" " + sum);
            }
        }
        if(n==sum)
            System.out.println(n+" is perfect Number");
        else
            System.out.println(n+" is not perfect Number");
    }
}

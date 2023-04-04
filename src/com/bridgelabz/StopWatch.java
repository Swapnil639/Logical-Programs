package com.bridgelabz;

public class StopWatch {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for(int i=0;i<10;i++)
        {
            System.out.println("test "+i);
        }
        long endTime = System.currentTimeMillis();
        long elapseTime = endTime - startTime;
        System.out.println(elapseTime);
    }
}

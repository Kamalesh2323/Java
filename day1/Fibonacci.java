package com.day1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int k=0;   //start from zero(0)
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        while (k<=10){
            k=a+b;  // 0+1  1+1  2+1  3+2  5+3  8+5
//            System.out.println(k + " ");
            System.out.println(k);

            a=b;
            b=k;
        }

    }
}

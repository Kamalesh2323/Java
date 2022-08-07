package com.day1;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("num 1");
        int num1 = input.nextInt();
        System.out.println("num 2");
        int num2 = input.nextInt();

        if(num1>num2){
            System.out.println("Num1 is Largest ");
        }
        else {
            System.out.println("Num 2 is Largest ");
        }
    }
}

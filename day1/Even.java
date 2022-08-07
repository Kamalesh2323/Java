package com.day1;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
//        System.out.println("Hello");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        if ((number % 2)==0){
            System.out.println("The Given Number " + number + " is Even");
        }
        else {
            System.out.println("The Given Number " + number + " is Odd");

        }
//        System.out.println(number);
    }
}

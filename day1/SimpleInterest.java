package com.day1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int N = input.nextInt();
        int R = input.nextInt();
        float Result = ((P*N*R)/100);
        System.out.println(Result);
    }
}


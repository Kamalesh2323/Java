package com.day1;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input currency in rupees");
        float rupees = input.nextFloat();
        double dollar = rupees/79.3;
        System.out.println("Output in USD " + dollar);
    }
}

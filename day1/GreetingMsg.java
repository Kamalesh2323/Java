package com.day1;

import java.util.Scanner;

public class GreetingMsg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Person 1 name");
        String a = input.nextLine();
        System.out.println("Enter Person 2 name");
        String b = input.nextLine();
//        System.out.println(a + b);
        System.out.println("Hi " + a);
        System.out.println("Hi " + b);

//        String name = input.nextLine();
//        if (name =="rashmi"){
//            System.out.println("Hi " +name);
//        } else if (name =="kamalesh" ) {
//            System.out.println("Hi " +name);
//        } else if (name == "madhu") {
//            System.out.println("Hi" + name);
//        }
//        else{
//            System.out.println("Hi" + name);
//        }


    }
}

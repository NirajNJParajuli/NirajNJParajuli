package com.quick;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     int n = input.nextInt();
     int a = 2;
     int b = 3;
     int count = 2;
     while (count <= n) {
         int temp = b;
         b = b + a ;
         a = temp;
         count ++;
     }
        System.out.println(b);


    }
}

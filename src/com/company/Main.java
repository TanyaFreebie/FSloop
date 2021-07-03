package com.company;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static int fib(int n) {
        if (n <= 1) return n;
        else return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Position of fibonacci sequence: ");
        int answer = 0;
        int position = sc.nextInt();

        for (int i = 0; i <= position; i++) {
            answer = fib(i);
        }


        System.out.println("The value of asked line of Fibonacci sequence is " + answer);



    }//end of main
}

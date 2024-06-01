package com.task1;
import java.util.Scanner;

public class Negpos {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int a = 1;//variable a and b initialized for infinite loop
        int b = 0;

/*do {
    System.out.println("please enter number:");
    int n = Scanner.nextInt();

    if (n > 0) {
        System.out.println("The number is positive number");
    } else if (n < 0) {
        System.out.println("the number is negative number");
    }
    else {
        System.out.println("The number is zero");
    }
    a++;

}
while(a>b);*/

        while (a > b) //loop is optional only here is used to  print the output continously to all three conditions
        {
            System.out.println("please enter number:");
            int n = Scanner.nextInt();

            if (n > 0) {
                System.out.println("The number is positive number");
            } else if (n < 0) {
                System.out.println("the number is negative number");
            } else {
                System.out.println("The number is zero");
            }
            a++;

        }

    }}



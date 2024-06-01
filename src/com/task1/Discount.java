package com.task1;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the purchased amount:");
        float n = Scanner.nextInt();
        float dis=0;
        if (n<=500) {
            System.out.println("your total amount is:");
            System.out.println(n);
        }
        else if (n>500 && n<=1000) {
            dis =n-n*10/100;
            System.out.println("your total amount after discount is:");
            System.out.println(dis);
        }
        else if (n>1000) {
            dis =n-n*20/100;
            System.out.println("your total amount after discount is:");
            System.out.println(dis);

        }}}


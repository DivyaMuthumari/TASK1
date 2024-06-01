package com.task1;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args)
    {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("enter number");
        int n=Scanner.nextInt();
        int re=0,rv=0; //the values are initialized to zero
        while(n>0)
        {re=n%10; //modulus of n by 10 is taken and  stored in re(remainder)
            rv=rv*10+re; //multiply rv with 10 and add with re
            n=n/10;//divide n by 10
        }System.out.println(rv);
    }}


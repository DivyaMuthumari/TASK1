package com.task1;
import java.util.Scanner;
public class Smallestt {
    public static void main(String[] args)
    {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("enter three numbers:");
        int a=Scanner.nextInt();
        int b=Scanner.nextInt();
        int c=Scanner.nextInt();
        if(a<b && a<c) //check if the condions are true and print the below statement
        {
            System.out.println(a + "is the smallest number");
        }if(b<a && b<c){
        System.out.println(b+"is the smallest number");}
        if(c<a && c<b){System.out.println(c+"is the smallest number");
        }
    }}

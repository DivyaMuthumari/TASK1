package com.task1;

public class Patterns {
    public static void main(String[] args)  {

        for (int i = 5, n = 5; i >= 1; i--) //5>=1=>true,4>=1=>true,3>=1=>true,2>=1=>true,1>=1=>true so the no of lines will be 5
        {
            for (int j = 5; j >= i; j--) //i)5>=5 condition is true so 5
            {
                System.out.print(j);
            }
            for (int j = 1; i != 1 && j < i; j++) {
                System.out.print(n);
            }

            System.out.println();
            n = n - 1;
        }
    }}

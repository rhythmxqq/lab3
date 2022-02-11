package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i <= 10; i ++)
        {
            for (int q = 1; q <= 10; q++)
            {
                System.out.print(q + " x " + i + " = " + (i * q) + "\t");
            }
            System.out.println();
        }
    }
}

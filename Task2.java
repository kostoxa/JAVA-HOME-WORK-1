package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int counter = 0;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    counter = counter + j;
                }
            }
            if (i == counter) {
                System.out.print(i + "\n");
            }
            counter = 0;
        }
    }
}

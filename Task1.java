package com.company;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int counter = 0;
        int store = num;

        while (store > 0) {
            store = store / 16;
            counter++;
        }
        char [] hexNum;
        if (num == 0) {
            hexNum = new char[1];
            hexNum[0] = 48;
        } else {
            hexNum = new char[counter];
            store = num;
            int i = counter - 1;
            int hexSymbol;
            while (store > 0) {
                hexSymbol = store % 16;
                if (hexSymbol >= 0 && hexSymbol <= 9)
                    hexNum[i] = (char) (hexSymbol + 48);
                else
                    hexNum[i] = (char) (hexSymbol + 87);
                store = store / 16;
                i--;
            }
        }
        System.out.print(hexNum);
    }
}
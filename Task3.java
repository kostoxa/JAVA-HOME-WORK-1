package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        char[][] matrix = new char[num][num * 2 - 1];
        int buf;

        for (int i = 0; i < num; i++) {
            buf = i + 1;
            for (int j = num - 1; j < num * 2 - 1; j++) {
                if (buf > 0) {
                    matrix[i][j] = (char) (buf + 48);
                }
                buf = buf - 1;
            }
            buf = i + 1;
            for (int k = num - 1; k >= 0; k--) {
                if (buf > 0) {
                    matrix[i][k] = (char) (buf + 48);
                }
                buf = buf - 1;
            }
            System.out.print(Arrays.toString(matrix[i]) + "\n");
        }

    }
}

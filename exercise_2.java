package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int [] my_numbers = {1, 2, 3, 8, 100};

        for (int i = 0; i < my_numbers.length; i++) {
            System.out.print(my_numbers[i] + " ");
        }

        System.out.println();
        System.out.println("Please enter 5 elements of array");

        int [] user_numbers = {s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()};
        for (int i = 0; i < user_numbers.length; i++) {
            System.out.print(user_numbers[i] + " ");
        }

    }
}

package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();


        int [] my_numbers = {6, -100, 30 , 40, 500};
        System.out.println(my_numbers[0] +" "+ my_numbers[4]);
        System.out.println(my_numbers[2]);
        float [] my_numbers_f = {0.2f, -4.57f, 10.11f};
        System.out.println(my_numbers_f[0] +" "+ my_numbers_f[2]);
        System.out.println(my_numbers_f[1]);
        boolean [] my_bool_arr = {true, true, false, false, true};
        System.out.println(my_bool_arr[0] +" "+ my_bool_arr[4]);
        System.out.println(my_bool_arr[2]);
        int [] random_arr = {r.nextInt(50), r.nextInt(50), r.nextInt(50), r.nextInt(50)};
        System.out.println(random_arr[0] +" "+ random_arr[3]);
        System.out.println(random_arr[2]);
    }
}

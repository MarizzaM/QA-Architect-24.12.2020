package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        // create array of 5 numbers : 60, -10, 30, 45, 12
        int [] my_numbers = {60, -10, 30, 45, 12};
        // print all of the array elements
        // using for loop (like above)
        for (int i = 0; i <= my_numbers.length-1; i++) {
            System.out.print(my_numbers[i] + " ");
        }
        // create array of 5 float : -5.12, 4.8, 12, 4.33, 9.51
        float [] my_numbers_f = {-5.12f, 4.8f, 12f, 4.33f, 9.51f, -12.7f};
        // print the first half of the array
        System.out.println();
        for (int i = 0; i < my_numbers_f.length/2; i++) {
            System.out.print(my_numbers_f[i] + " ");
        }
        // print the second half of the array (in separate loop)
        for (int i = my_numbers_f.length/2; i < my_numbers_f.length; i++) {
            System.out.print(my_numbers_f[i] + " ");
        }
        System.out.println();
        // print all the array elemnts from last to first
        for (int i = my_numbers_f.length-1; i >= 0; i--) {
            System.out.print(my_numbers_f[i] + " ");
        }
        System.out.println();
        // *etgar: create array of 1,2,3,4,5
        //           print powers 2 of the array.
        //           result: 1,4,9,16,25
        int [] etgar_first = {1, 2, 3, 4, 5};
        for (int i = 0; i <= etgar_first.length-1; i++) {
            System.out.print(etgar_first[i]*etgar_first[i] + " ");
        }
        System.out.println();
        // **etgar: create array of 6 random numbers (between 1-10)
        //          input number from user
        //          check if user input number is inside of the array
        //              if so - print "bingo"
        int [] etgar_second = {r.nextInt(10)+1, r.nextInt(10)+1, r.nextInt(10)+1,
                r.nextInt(10)+1, r.nextInt(10)+1, r.nextInt(10)+1};

        System.out.println("Please, enter number");
        int number = s.nextInt();

        for(int i = 0; i < my_numbers.length; i++){
            if (number == etgar_second[i]){
                System.out.println("Bingo!");
            }
        }
    }
}

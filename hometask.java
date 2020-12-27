package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

//        -- targilim:
//        -- 1. create an array of double numbers with these numbers: 0.9, -6.5555, 3.24, 10.11, 20.35
        double [] my_arr = {0.9d, -6.5555d, 3.24d, 10.11d, 20.35d};
//                -- 1.1. print the first element
        System.out.println("The first element: " + my_arr[0]);
//                -- 1.2. print the last element
        System.out.println("The last element: " + my_arr[4]);
//                -- 1.3. print the middle element
        System.out.println("The middle element" + my_arr[2]);
//                -- 1.4. write a for loop which prints all the element in the array
        System.out.println("\n" + "All the element in the array");
        for (int i = 0; i <= my_arr.length-1; i++){
            System.out.print(my_arr[i] + " ");
        }
//                -- 1.5. write a for loop which prints all the element in the array in reverse
        System.out.println("\n");
        System.out.println("All the element in the array in reverse");
        for (int i = my_arr.length-1; i >= 0; i--){
            System.out.print(my_arr[i] + " ");
        }
//                -- 1.6. use scanner to read a double number from the user. print all the elements in the array which
//                are bigger than the user-number
        System.out.println("\n");
        System.out.print("Please enter number: ");
        double num_d = s.nextDouble();
        System.out.print("All the elements in the array which are bigger than the user-number: ");
        for (int i = 0; i <= my_arr.length-1; i++){
            if (my_arr[i] > num_d){
                System.out.print(my_arr[i] + " ");
            }
        }
        System.out.println("\n");
//                -- 2. create an array A of integer numbers with these numbers: 4, 10, 20, 40, 1000
        int [] array_A  = {4, 10, 20, 40, 1000};
//                -- 2.1. create a second array B with these numbers: 0, 0, 0, 0, 0
        int [] array_B = {0, 0, 0, 0, 0};
//                -- 2.2. copy all elements from A to B
        for (int i = 0; i <= 4; i++){
            array_B[i] = array_A[i];
            System.out.print(array_B[i] + " ");
        }
//        -- ***crazy etgar:
//        -- create an array of numbers: 1, 3, 5, 8, 8, 5, 3, 1
        System.out.println("\n");
        int [] array = {1, 3, 5, 8, 8, 5, 3, 1};
//                -- check if the array is a polindrom (which in this case it is)
        int check = 0;
        for (int i = 0; i <= array.length-1; i++){
            if (array[i] != array[array.length-1-i]){
                check++;
            }
        }
        System.out.print("The array: ' ");
        for (int i = 0; i <= array.length-1; i++){
            System.out.print(array[i] + " ");
        }
        if (check == 0){
            System.out.println(String.format("' is a polindrom"));
        } else {
            System.out.println(String.format("' is NOT a polindrom"));
        }
    }
}

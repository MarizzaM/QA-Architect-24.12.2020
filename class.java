package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        // class with 10 students
        // input all the student grades

//        int [] my_class = {s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(),
//                s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()};
        int [] my_class = {10, 20, 30, 40, 50, 60, 70, 80, 90, 99};
        for (int i = 0; i < my_class.length; i++) {
            System.out.print(my_class[i] + " ");
        }
        System.out.println();
// find max value
        int max = my_class[0];
        for (int i = 0; i < my_class.length; i++){
            if (my_class[i] > max){
                max = my_class[i];
            }
        }
        System.out.println("max value: " + max);
// calculate sum of students
        int sum = 0;
        for (int i = 0; i < my_class.length; i++){
            sum += my_class[i];
        }
        System.out.println("sum: " + sum);

// calculate average of students
        int average = sum/my_class.length;

        System.out.println("average: " + average);
    }
}

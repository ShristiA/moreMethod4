package com.company;
import java.util.*;
import java.util.Scanner;
public class Main {
/* get number from the user
  save the numbers in total
  calculate average
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 numbers");
        int num1 = sc.nextInt();
        System.out.println("Enter 2 numbers");
        int num2 = sc.nextInt();
        System.out.println("Enter 3 numbers");
        int num3 = sc.nextInt();

        int avg = methodAverage(num1,num2,num3);
        System.out.print("Average "+avg);

        }
        public static int methodAverage(int num1,int num2,int num3){
        int total = num1+num2+num3;
        int average = total/3;
        return average;

    }
}

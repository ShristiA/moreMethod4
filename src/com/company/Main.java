package com.company;
import java.util.*;
import java.util.Scanner;
public class Main {
/* get number from the user
  save the numbers in total
  calculate average
 */
    public static void main(String[] args) {
        Integer userInput;
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> al = new ArrayList<>();
        System.out.println("Enter numbers");
        for(int i =0; i<3; i++){
            userInput = sc.nextInt();
            al.add(userInput);
        }
        int average = methodAverag(al);
                System.out.println(average);



    }
    public static int methodAverag(ArrayList<Integer> al){
        int total = 0;
        for(Integer number : al) {
            total = number +total;
            }
        int avg = total / al.size();
        return avg;
    }
}

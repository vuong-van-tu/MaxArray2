package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        int array[][]={{1,5,3},{2,6,8},{4,1,3}};
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]+" ");
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]>max){
                    max=array[i][j];
                }
            }
        }
        System.out.println("");
        System.out.print("Max = ");
        System.out.print(max);
    }
}

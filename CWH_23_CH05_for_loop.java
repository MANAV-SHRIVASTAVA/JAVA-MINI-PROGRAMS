package com.company;
import java.util.Scanner;
public class CWH_23_CH05_for_loop {
    public static void main(String[] args) {
       /*
        for (int i=0;i<=10;i++){
            System.out.println(i);
       }
        */

/*
        // Quick Quiz:
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=0;i<n;i++){
            System.out.println(2*i+1);
        }
 */
    // Decrementing for loop:
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=0;i--){
            System.out.println(i);
        }
    }
}

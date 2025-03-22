package com.company;

public class CWH_24_Break_and_Continue {
    public static void main(String[] args) {
        // Break and Continue by Using Loops:
        /*
        int i=50;
        for (i=0;i<=50;i++) {
            System.out.println(i);
            System.out.println("Java is great:");
            if(i==2){
                System.out.println("Ends the Loop:");
                break;
            }
        }
        System.out.println("Java ends here:");
         */

        // By using while loop:
        /*
        int i=0;
        while(i<10){
            System.out.println(i);
            System.out.println("Java is good:");
            if(i==3){
                System.out.println("break ends the loop:");
                break;
            }
            i++;
        }
        System.out.println("java Ends here:");
         */
        // by using Do-while loops:
        /*
        int i=0;
        do{
            System.out.println(i);
            System.out.println("java is must:");
            if(i==2) {
                System.out.println("Break ends the loop:");
                break;
            }
            i++;
        }
        while (i<=5);

         */

         // Continue by using loops:
        // For loop:
        /*
        int i;
        for(i=0;i<=10;i++){
            if(i==3){
                System.out.println("Skip this loop:");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is a Good Language:");
         */

        // by using while loop:

        int i=0;
        while(i<6){
            i++;

            if(i==3){
                System.out.println("Skip this line:");
                continue;
            }
            System.out.println(i);
            System.out.println("I love java:");
        }

        // by using do-while loops:
/*
        int i=0;
        do{
            i++;
            if(i==2){
                System.out.println("Skip this line:");
                continue;
            }
            System.out.println(i);
            System.out.println("I want to learn java:");
            }
        while(i<5);
        System.out.println("Ends the loop");

 */


    }
}


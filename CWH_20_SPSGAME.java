package com.company;
import java.util.Scanner;
import java.util.Random;

public class CWH_20_SPSGAME {
    public static void main(String[] args) {
        System.out.println("Input 0 for Stone:");
        System.out.println("Input 1 for Paper:");
        System.out.println("Input 2 for Scissors");
        System.out.println("GET SET GO:");
        Scanner sc = new Scanner(System.in);
        int humanInput = sc.nextInt();

        Random number = new Random();

        int compInput = number.nextInt();

        if (humanInput <= 2) {
            System.out.println("Your turn:");

        } else {
            System.out.println("Invalid Input:");
        }

         if (compInput == humanInput) {
            System.out.println("Game Draw");
        } else if (humanInput == 0 || compInput == 2 ) {
            System.out.println("You Win the game:");
        } else if (humanInput == 1 || compInput == 0) {
             System.out.println("You win the game:");

         }
         else if(  humanInput == 2 || compInput == 1){
             System.out.println("You win the game:");
         }

         else {
            System.out.println("You Lose the game:");
        }


    }

    }



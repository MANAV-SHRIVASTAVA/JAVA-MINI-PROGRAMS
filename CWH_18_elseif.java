package com.company;
import java.util.Scanner;
public class CWH_18_elseif {
    public static void main(String[] args) {
    /*
        int age;
        System.out.println("Enter the age");
        Scanner sc= new Scanner(System.in);
        age=sc.nextInt();



        if(age>56){
            System.out.println("You are experieced");
        }
        else if(age>46){
            System.out.println("you are semi experienced");
        }
        else if(age>36){
            System.out.println("you are semi semi experienced");
        }
        else{
            System.out.println("You have no experienced");
        }
           */
        String var;
        System.out.println("Enter the character");
        Scanner sc=new Scanner(System.in);
        var= sc.next();

        switch(var){
            case "sun":
                System.out.println("Today is a sunday");
                break;
            case "mon":
                System.out.println("Today is a monday");
                break;
            case "tue":
                System.out.println("Today is a Tuesday");
                break;
            case "wed":
                System.out.println("Today is Wednesday");
                break;
            case " thur":
                System.out.println("Today is a Thursday");
                break;
            case "fri":
                System.out.println("Today is a Friday");
                break;
            case "sat":
                System.out.println("Today is a saturday");

            default:
                System.out.println("Invalid Input");

        }
        System.out.println("Thanks for Using!");
    }
}

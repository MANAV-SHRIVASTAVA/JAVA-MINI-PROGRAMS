package com.company;
import java.util.Scanner;
public class CWH_19_PS4 {
    public static <string> void main(String[] args) {

       /*
      QUESTION 1
        int a =10;
        if(a==11){
            System.out.println("I am 11!");
        }
        else {
            System.out.println("I am not 11!");
        }

        */
   // Question 2:
       /*
        System.out.println("Enter the marks of your three subjects:");
        byte maths, physics, chemistry;
        Scanner sc=new Scanner(System.in);
        maths=sc.nextByte();
        physics=sc.nextByte();
        chemistry=sc.nextByte();

        float finalpercent;
        finalpercent=(maths+physics+chemistry)/3.0f;
        System.out.println("Your overall percentage is:"+ finalpercent);

        if(finalpercent>40 && maths>33 && physics>33 && chemistry>33){
            System.out.println("Congratulations , You are promoted to next class:"+ finalpercent);
        }
        else {
            System.out.println("Sorry, You have not been promoted to next class please work hard next time:"+ finalpercent);
        }

        */
 // Question 3:
/*
        System.out.print("Please Enter your salary:");
        float salary,tax=0,totalsalary;
        Scanner sc = new Scanner(System.in);
        salary= sc.nextFloat();

        if(salary<=250000){
            tax=0;
            totalsalary=salary-tax;
            System.out.println("Your salary is:"+totalsalary);
            System.out.println("Your tax is:" + tax);
        }
        else if (salary>250000 && salary<=500000){
            tax=tax+(salary-250000)*0.05f;
            totalsalary=salary-tax;
            System.out.println("Your salary is:"+totalsalary);
            System.out.println("Your tax is:" + tax);
        }
         else if(salary>500000 && salary<=1000000) {
            tax = tax+(500000-250000)*0.05f;
            tax= tax+(1000000-500000)*0.2f;
            totalsalary = salary - tax;
            System.out.println("Your salary is:" + totalsalary);
            System.out.println("Your tax is:" + tax);
        }
         else {
            tax = tax+(500000-250000)*0.05f;
            tax= tax+(1000000-500000)*0.2f;
            tax=tax+(salary-1000000)*0.3f;
             totalsalary=salary-tax;
            System.out.println("Your total salary is:"+totalsalary);
            System.out.println("Your tax is:" + tax);
           }
           */
        // Question 4:
        /*
        System.out.println("Enter the number 1-7");

         Scanner sc = new Scanner(System.in);
        int day=sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Today is a Monday:");
                break;
            case 2:
                System.out.println("Today is a Tuesday:");
                break;
            case 3:
                System.out.println("Today is a Wednesday:");
                break;
            case 4:
                System.out.println("Today is a Thursday:");
                break;
            case 5:
                System.out.println("Today is a Friday:");
                break;
            case 6:
                System.out.println("Today is a Saturday:");
                break;
            case 7:
                System.out.println("Today is a Sunday:");
                break;
        }
         */
     // Question 5:
     /*
        System.out.println("Enter the year:");
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0||year%400==0){
            System.out.println("This year is a leap year:");
        }
        else{
            System.out.println("This year is not a leap year:");
        }
      */

      // Question 6:
        /*
        System.out.println("Please Enter your website:");
        Scanner sc= new Scanner(System.in);
        String site= sc.next();
         if(site.endsWith(".com")) {
             System.out.println("This is an commercial website:");
         }
         else if (site.endsWith(".org")) {
             System.out.println("This is an organisational website:");
         }
         else if (site.endsWith(".in")) {
             System.out.println("This is an Indian website:");
         }
         else {
             System.out.println("This is not a website:");
    }
         */
        // ATM program:


         }
       }

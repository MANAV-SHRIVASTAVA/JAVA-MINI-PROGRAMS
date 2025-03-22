package com.company;

import java.util.Scanner;

public class CWH_PQ {
    public static void main(String[] args) {
        System.out.println("Enter the marks of a student of a five sunjects:");
        Scanner sc =new Scanner(System.in);
        System.out.print("maths: ");
        float maths= sc.nextFloat();
        System.out.print("physics: ");
        float phy= sc.nextFloat();
        System.out.print("chemistry: ");
        float chem= sc.nextFloat();
        System.out.print("English: ");
        float eng= sc.nextFloat();
        System.out.print("computer: ");
        float comp=sc.nextFloat();
        System.out.print("Total marks: ");
        float totalMarks=sc.nextFloat();
        System.out.print("Final result is: ");
        float percentage=(maths+phy+chem+eng+comp)*100/totalMarks;
        System.out.print(percentage);
        System.out.print("%");
    }

}


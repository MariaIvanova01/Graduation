package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double grade = scan.nextDouble();
        int numberOfDispell = 0;
        int count = 1;
        double sumOfGrades = 0;
        while(count <= 12) {
            if(count == 12) {
                sumOfGrades = sumOfGrades + grade;
                break;
            }
            if(grade < 4) {
                numberOfDispell += 1;
                if(numberOfDispell <= 2) {
                    System.out.printf("%s has been excluded at %d grade",name, count);
                    break;
                }
            }
            sumOfGrades = sumOfGrades + grade;
            count++;
            grade = scan.nextDouble();
        }
        if(count >= 12) {
            double result = sumOfGrades / count;
            System.out.printf("%s graduated. Average grade: %.2f", name, result);
        }
    }
}

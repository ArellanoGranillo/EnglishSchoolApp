/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioenglishschool;

import java.util.Scanner;

/**
 *
 * @author xoy_p
 */
public class EnglishSchoolApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String studentsName;
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the English School");
        System.out.println("Enter the student's name");
        studentsName = scanner.nextLine();
                System.out.println("Enter the student's age");
        age = scanner.nextInt();
        

        if (age >= 4 && age <= 6) {
            System.out.println("The schedule for the student " + studentsName + " is:");
            System.out.println("The Kinder group schedule which is Monday and Wednesday from 4:00 PM to 5:00 PM.\"");
        } else {

            if (age >= 7 && age <= 8) {
                System.out.println("The schedule for the student " +studentsName + " is:");
                System.out.println("The 1st year group schedule which is Tuesday and Thursday from 4:30 PM to 5:30 PM.");
            } else {
                if (age <= 9 && age >= 10) {
                    System.out.println("The schedule for the student " + studentsName + " is:");
                    System.out.println("The 2nd year group schedule which is Tuesday and Thursday from 5:30 PM to 7:00 PM.");

                } else {
                    if (age <= 11 && age >= 13) {
                        System.out.println("The schedule for the student " +studentsName + " is:");
                        System.out.println("The 3rd year group schedule which is from 5:00 PM to 6:30 PM");
                    } else {
                        System.out.println("Invalid age");
                    }
                }
            }

        }
    }

}

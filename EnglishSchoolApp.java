package ejercicioenglishschool;

import java.util.Scanner;

/**
 *
 * @author xoy_p
 */


public class EnglishSchoolApp {
package ejercicioenglishschool;

import java.util.Scanner;

/**
 *
 * @author xoy_p
 */


public class EnglishSchoolApp {

    public static void main(String[] args) {

        String studentsName;
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the English School");

        System.out.println("Enter the student's name:");
        studentsName = scanner.nextLine();

        System.out.println("Enter the student's age:");
        age = scanner.nextInt();

        if (age >= 4 && age <= 6) {
            System.out.println("The schedule for the student " + studentsName + " is:");
            System.out.println("Kinder group: Monday and Wednesday from 4:00 PM to 5:00 PM.");

        } else if (age >= 7 && age <= 8) {
            System.out.println("The schedule for the student " + studentsName + " is:");
            System.out.println("1st year: Tuesday and Thursday from 4:30 PM to 5:30 PM.");

        } else if (age >= 9 && age <= 10) {
            System.out.println("The schedule for the student " + studentsName + " is:");
            System.out.println("2nd year: Tuesday and Thursday from 5:30 PM to 7:00 PM.");

        } else if (age >= 11 && age <= 13) {
            System.out.println("The schedule for the student " + studentsName + " is:");
            System.out.println("3rd year: from 5:00 PM to 6:30 PM.");

        } else {
            System.out.println("Invalid age");
        }
    }
}

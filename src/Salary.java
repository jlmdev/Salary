/*
Salary
Josh Mann
6-23-22
 */

import java.util.Scanner;

public class Salary {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        int hourlyWage;
        int workHoursPerWeek;
        int workWeeksPerYear;
        final int MONTHS_PER_YEAR = 12;
        int annualSalary;
        int monthlySalary;

        System.out.println("Enter hourly wage: ");
        hourlyWage = scnr.nextInt();

        System.out.println("Enter hours per week: ");
        workHoursPerWeek = scnr.nextInt();

        System.out.println("Enter weeks per year: ");
        workWeeksPerYear = scnr.nextInt();

        annualSalary = hourlyWage * workHoursPerWeek * workWeeksPerYear;
        monthlySalary = annualSalary / MONTHS_PER_YEAR;

        System.out.print("Annual salary is: ");
        System.out.println(annualSalary);

        System.out.print("Monthly salary is: ");
        System.out.println(monthlySalary);
    }
}

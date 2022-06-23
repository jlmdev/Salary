/*
Salary
Josh Mann
6-23-22
 */

public class Salary {
    public static void main(String [] args) {
        int hourlyWage;
        int workHoursPerWeek;
        int annualSalary;
        int workWeeksPerYear;
        int monthlySalary;

        hourlyWage = 20;
        workHoursPerWeek = 35;
        annualSalary = hourlyWage * workHoursPerWeek * 50;
        monthlySalary = annualSalary / 12;

        System.out.print("Annual salary is: ");
        System.out.println(annualSalary);

        System.out.print("Monthly salary is: ");
        System.out.println(monthlySalary);
    }
}

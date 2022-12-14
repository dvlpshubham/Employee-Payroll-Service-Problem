package com.employeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    /**
     * Creating arrayList of EmployeePayrollData type: employeePayrollList
     */
    private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();;

    /**
     * Constructor
     */
    public EmployeePayrollService() {
        employeePayrollList = new ArrayList<>();
    }

    /**
     * Main method: Creating instance of EmployeePayrollService:
     * employeePayrollService. Calling readEmployeePayrollData to take user input
     * for employee from console Calling writeEmployeePayrollData to print employee
     * payroll.
     *
     */
    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();

    }

    /**
     * Method to read employee payroll from user in console Asking user for employee
     * id, name and salary. Adding these values to employeePayrollList using add
     * method.
     *
     * @param consoleInputReader
     */
    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary: ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    /**
     * Method to print employee payroll from emploeePayrollList
     */
    private void writeEmployeePayrollData() {
        System.out.println("\nEmployee Payroll is\n" + employeePayrollList);
    }

}

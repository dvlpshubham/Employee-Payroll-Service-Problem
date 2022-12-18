package com.employeepayroll;

public class EmployeePayRoll {
    public static void main(String[] args) {
        EmployeePayRollService employeePayrollService = new EmployeePayRollService();
        //EmployeePayRoll employeePayrollService = new EmployeePayRoll();
        System.out.println("Welcolme to employee payRoll");
        employeePayrollService.readEmployeeDataFromConsole();
        employeePayrollService.writeEmployeeDataInConsole();
    }

    private void writeEmployeeDataInConsole() {

    }

    private void readEmployeeDataFromConsole() {

    }
}
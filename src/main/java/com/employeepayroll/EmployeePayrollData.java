package com.employeepayroll;

public class EmployeePayrollData {
    /**
     * employeeId: ID of Employee. employeeName: Name of Employee. employeeSalary:
     * Salary of Employee.
     */
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    /**
     * Constructor
     *
     * @param employeeId:     ID of Employee.
     * @param employeeName:   Name of Employee.
     * @param employeeSalary: Salary of Employee.
     */
    public EmployeePayrollData(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    /**
     * This method is Collecting the data From Employee
     */

    @Override
    public String toString() {
        return "EmployeePayrollData [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
                + employeeSalary + "]";
    }

}

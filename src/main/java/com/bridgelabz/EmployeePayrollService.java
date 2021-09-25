package com.bridgelabz;

/**
 * @purpose: To Implement java IO Concept in Employee Payroll Service Problem.
 *
 * @author: VAISHNAVI R. VISHWAKRMA.
 * @date: 24-September-2021.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    private List<EmployeePayrollData> employeePayRollList;

    public EmployeePayrollService(List<EmployeePayrollData>employeePayRollList) {
        this.employeePayRollList = employeePayRollList;
    }

    // main method
    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }

    /**
     * @purpose: to read employee payroll data from user input.
     * @param consoleInputReader
     */
    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID:  ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee name :  ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary : ");
        double salary = consoleInputReader.nextDouble();
        employeePayRollList.add(new EmployeePayrollData(id, name, salary));
    }

    /**
     * @purpose: Method to write EmployeePayroll data to Console.
     */
    private void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeePayRollList);
    }
}
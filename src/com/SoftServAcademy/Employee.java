package com.SoftServAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {
    private String name;
    private int department;
    private int salary;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    public static void findEmployeeDepatment(Employee... employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter department number: ");
        int d = scanner.nextInt();
        for (Employee employee : employees) {
            if (employee.getDepartment() == d) {
                System.out.println(employee.toString());
            }
        }
        scanner.close();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void sortSalary(Employee... employees) {
        Employee temp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getSalary() < employees[j].getSalary()) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

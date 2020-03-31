package com.SoftServAcademy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // #1
        Random random = new Random();
	    int arr [] = new int[10];
	    for (int i = 0; i<arr.length; i++) {
	        arr[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(arr));

	    int max = Integer.MIN_VALUE;
	    for (int i = 0; i< arr.length; i++) {
	        if (arr[i] > max) {
	            max = arr [i];
            }
        }
        System.out.println("Max number in array is " + max);

	    long sum = 0;
	    for (int i = 0; i< arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr [i];
            }
	    }
	    System.out.println("Sum of positive numbers is " + sum);

        int count = 0;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        System.out.println("Number of negative values is " + count);

        if (count > arr.length/2) {
            System.out.println("More negative values");
        } else if (count < arr.length/2) {
            System.out.println("More positive values");
        } else {
            System.out.println("positive and negative are equal");
        }
        // #2
        Employee employee1 = new Employee("tom", 1, 100);
        Employee employee2 = new Employee("kor", 3, 999);
        Employee employee3 = new Employee("gor", 1, 444);
        Employee employee4 = new Employee("lop", 3, 600);
        Employee employee5 = new Employee("sot", 1, 20);
        Employee.findEmployeeDepatment(employee1,employee2,employee3,employee4,employee5);

        Employee.sortSalary(employee1,employee2,employee3,employee4,employee5);

    }
}

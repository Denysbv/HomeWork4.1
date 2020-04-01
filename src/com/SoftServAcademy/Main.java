package com.SoftServAcademy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // #1
        int arr [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number 1-12: ");
        int n = scanner.nextInt();
        System.out.println("Month number " + n + " has " + arr[n-1] + " days.");

        // #2
        int arr2 [] = {10, 12, -3, 5, 10, 1, -3, 6, 11, -10};

        System.out.println(Arrays.toString(arr2));
        int sum = 0;
        int i =0;

        while ((arr2[i] > 0) && (i < 5)) {
            sum += arr2[i];
            System.out.println("Calculating the sum of first 5 elements ");
            i++;
            if (arr2 [i] <=0) {
                sum = 0;
                for (int b = arr2.length/2; b < 10; b++) {
                    sum += arr2[b];
                }
            }
        } System.out.println(sum);

        //#3
        int arr3[] = {10, -3, 2, 50, 12};
        int count = 0;
        for (int s =0 ; s< arr3.length; s++) {
            if (arr3[s] > 0) {
                count++;
            } if (count>1) {
                System.out.println("second positive number position is " + (count+1));
                break;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int p = 0; p <arr3.length; p++) {
            if (arr3[p] < min) {
                min = arr3[p];
            }
        } System.out.println("Min number is " + min);
        for (int p = 0; p<arr3.length; p++) {
            if (arr3[p] == min) {
                System.out.println("Position of min number is " + (p+1));
            }
        }

        int numbers = 0;
        while (true) {
            System.out.println("Enter number:");
            int number;
            number = scanner.nextInt();
            if (number < 0) {
                break;
            } else if (number % 2 == 0) {
                numbers += number;
            }
        }
        System.out.println("The product of all entered even numbers is " + numbers);

        // #4
        Car car1 = new Car(CarType.Hatchback, 2000, 2);
        Car car2 = new Car(CarType.Coupe, 2010, 3);
        Car car3 = new Car(CarType.SEDAN, 2017, 1);
        Car car4 = new Car(CarType.Coupe, 1999, 2);
        Car.findYear(car1, car2, car3, car4);
        Car.orderByYear(car1, car2, car3, car4);



    }

}
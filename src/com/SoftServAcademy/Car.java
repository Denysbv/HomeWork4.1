package com.SoftServAcademy;

import java.util.Scanner;

public class Car {
    private CarType type;
    private int yearOfProduction;
    private int enginecapasity;

    public Car(CarType type, int yearOfProduction, int enginecapasity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.enginecapasity = enginecapasity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getEnginecapasity() {
        return enginecapasity;
    }

    public void setEnginecapasity(int enginecapasity) {
        this.enginecapasity = enginecapasity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", yearOfProduction=" + yearOfProduction +
                ", enginecapasity=" + enginecapasity +
                '}';
    }

    public static void orderByYear (Car... cars) {
        Car temp;
        for (int i = 0; i<cars.length-1; i++) {
            for (int j = i+1; j<cars.length; j++) {
                if (cars[i].getYearOfProduction()<cars[j].getYearOfProduction()){
                    temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        for (Car car : cars) {
            System.out.println(car.toString());
        }

    }


    public static void findYear (Car... cars) {
        System.out.println("Enter year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int count = 0;
        for (Car car : cars) {
            if (car.getYearOfProduction()==year) {
                System.out.println(car.type);
                count++;
            }
        }
        if (count==0) {
            System.out.println("Car not found");
        }
        scanner.close();
    }

}
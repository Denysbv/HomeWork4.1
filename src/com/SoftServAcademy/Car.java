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

//    public static void orderByYear (Car... cars) {
//        int year = 0;
//        for
//
//    }


    public static void findYear (Car... cars) {
        System.out.println("Enter year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        for (Car car : cars) {
            if (car.getYearOfProduction()==year) {
                System.out.println(car.type);
            } else {
                System.out.println("Car not found");
            }
        } scanner.close();
    }
}

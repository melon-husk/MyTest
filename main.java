package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MotorVehicle mv = new MotorVehicle();
        Car car = new Car();
        int s;
        System.out.println("What is the price of the Car ?");
        s = sc.nextInt();
        car.price = s;
        System.out.println("What is the model number of the Car ?");
        s = sc.nextInt();
        car.modelNumber = s;
        System.out.println("What is the discount rate?");
        s = sc.nextInt();
        car.display();
        car.setDiscountRate(s, car.price);

    }
}

class MotorVehicle {
    int modelNumber, price;

    void display() {
        System.out.println("Model Number is " + modelNumber + " and price is " + price);
    }

}

class Car extends MotorVehicle {
    void setDiscountRate(int discountRate1, int price) {
        float discountedPrice = price - price * discountRate1 / 100;
        System.out.println("At discount rate "+discountRate1+"%, discounted Price is " + discountedPrice+"$");
    }
}

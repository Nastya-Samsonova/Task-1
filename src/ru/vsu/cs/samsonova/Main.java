package ru.vsu.cs.samsonova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double side = enterSide();
        double area = calculateArea(side);
        showResultArea(area);
    }

    public static double enterSide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("the length of a side ");
        return scanner.nextDouble();
    }

    public static void showResultArea(double area) {
        System.out.printf("the sought area: %f", area);
    }

    public static double calculateArea(double side) {
        return calculateSquareArea(side) - calculateCornersArea(side) / 2;
    }

    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateRadius(double side) {
        return side / 2;
    }

    public static double calculateCircleArea(double side) {
        return Math.PI * calculateRadius(side) * calculateRadius(side);
    }

    public static double calculateCornersArea(double side) {
        return calculateSquareArea(side) - calculateCircleArea(side);
    }
}
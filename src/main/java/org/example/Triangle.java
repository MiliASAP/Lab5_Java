package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "triangles")
public class Triangle extends Shape {
    private double width;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;
    private String name;

    public Triangle() {}

    public Triangle(double sideA, double sideB, double sideC, String name, Color color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return 0.5 * sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getA() {
        return sideA;
    }

    public void setA(double sideA) {
        this.sideA = sideA;
    }

    public double getB() {
        return sideB;
    }

    public void setB(double sideB) {
        this.sideB = sideB;
    }

    public double getC() {
        return sideC;
    }

    public void setC(double sideC) {
        this.sideC = sideC;
    }
}

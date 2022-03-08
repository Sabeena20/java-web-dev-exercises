package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Double area;
        Double radius;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter radius");
//        radius = input.nextDouble();
//        area = radius * radius * Math.PI;
        area = Circle.getArea(2.5);
        System.out.println("Area of circle: " + area);




    }
}

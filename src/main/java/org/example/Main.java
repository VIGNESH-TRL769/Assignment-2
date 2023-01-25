package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

interface Shape
{
    double perimeter();
    double area();
}
class Triangle implements Shape
{
    private final double side1;
    private final double side2;
    private final double base;
    Triangle(double side1,double side2,double base)
    {
        this.side1=side1;
        this.side2=side2;
        this.base=base;
    }
    public double perimeter()
    {
        return side1+side2+base;

    }

    public double area()
    {
        double s=(side1+side2+base)/2;
        double v=(s-side1)*(s-side2)*(s-base);
        double k= Math.sqrt(s*v);
        double h=(2*k)/base;
        return  (base*h)/2;
    }
}
class ReactAngle implements Shape
{
    private final double length;
    private final double breadth;
    ReactAngle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public double perimeter()
    {
        return 2 * (length + breadth);
    }

    public double area()
    {
        return length * breadth;
    }


}
class Circle implements Shape
{
    private final double radius;
    double pi=3.14159;
    Circle(double radius)
    {
        this.radius=radius;
    }
    public double perimeter()
    {
        return 2*(pi *radius);
    }

    public double area()
    {
        return pi*(radius*radius);
    }


}
public class Main
{
    private static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        while(true) {
            int key=0;
            LOGGER.log(Level.INFO,"\n1.Triangle\n2.Reactangle\n3.Circle\n5.Exit\nEnter the Choice:");
            int value = input.nextInt();
            switch (value) {
                case 1 -> {
                    LOGGER.log(Level.INFO,"Enter the side1 value:");
                    double side1 = input.nextInt();
                    LOGGER.log(Level.INFO,"Enter the side2 value:");
                    double side2 = input.nextInt();
                    LOGGER.log(Level.INFO,"Enter the base value:");
                    double base = input.nextInt();
                    Triangle triangle = new Triangle(side1, side2, base);
                    if ((side1 == side2)&&(base<=side1) && (base<=side2)) {
                        LOGGER.log(Level.INFO,Double.toString(triangle.area()),"Area of the Area:" + triangle.area());
                        LOGGER.log(Level.INFO,Double.toString(triangle.perimeter()),"\nPerimeter of the Triangle:" + triangle.perimeter());
                    } else {
                        LOGGER.log(Level.INFO,"please enter valid values");
                    }
                }
                case 2 -> {
                    LOGGER.log(Level.INFO,"Enter the Length:");
                    double length = input.nextDouble();
                    LOGGER.log(Level.INFO,"Enter the breadth:");
                    double breadth = input.nextDouble();
                    ReactAngle reactAngle = new ReactAngle(length, breadth);
                    LOGGER.log(Level.INFO,Double.toString(reactAngle.area()),"Area of the ReactAngle:" + reactAngle.area());
                    LOGGER.log(Level.INFO,Double.toString(reactAngle.perimeter()),"\nPerimeter of the Reactangle:" + reactAngle.perimeter());
                }
                case 3 -> {
                    LOGGER.log(Level.INFO,"Enter the radius:");
                    double radius = input.nextDouble();
                    Circle circle = new Circle(radius);
                    LOGGER.log(Level.INFO,Double.toString(circle.area()),"Area of the Circle:" + circle.area() );
                    LOGGER.log(Level.INFO,Double.toString(circle.perimeter()),"\nPerimeter of the Circle:" + circle.perimeter());
                }
                default -> {
                    LOGGER.log(Level.INFO,"----Thank You----");
                    key = 1;
                }
            }
            if(key==1)
            {
                break;
            }

        }

    }
}

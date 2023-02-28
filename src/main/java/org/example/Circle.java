package org.example;

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

package org.example;

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

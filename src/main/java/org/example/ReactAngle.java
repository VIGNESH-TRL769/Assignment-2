package org.example;

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
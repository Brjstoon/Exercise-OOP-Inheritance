package org.example;

public class Square extends Rectangle{



    public Square(){

    }
    public Square(double side){
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(side , side , color, filled);
        setLength(side);
        setWidth(side);
    }
    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    public double getSide() {
        return getLength();
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() + "which is a subclass of " + super.toString();
    }
}

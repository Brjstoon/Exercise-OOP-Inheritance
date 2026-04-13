package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        // --- Shape ---
        Shape shape = new Shape("Red", true);
        System.out.println(shape);

        // --- Circle ---
        Circle circle1 = new Circle(5);
        System.out.println(circle1);

        Circle circle2 = new Circle(7, "Blue", true);
        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());

        // --- Rectangle ---
        Rectangle rect1 = new Rectangle(4, 6);
        System.out.println(rect1);

        Rectangle rect2 = new Rectangle(3, 9, "Green", false);
        System.out.println(rect2);
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());

        // --- Square ---
        Square sq1 = new Square(5);
        System.out.println(sq1);

        Square sq2 = new Square(8, "Yellow", true);
        System.out.println(sq2);
        System.out.println("Area: " + sq2.getArea());
        System.out.println("Perimeter: " + sq2.getPerimeter());

        // --- Setters test ---
        sq1.setSide(10);
        System.out.println("Updated side: " + sq1.getSide());
    }
}
package ru.stqa.pft.sandbox;

public class HelloWorld {
    public static void main(String[] args) {
        hello("World");
        hello("user");
        hello("Elena");

        Point p1 = new Point(1.0, 2.3);
        Point p2 = new Point(7.0, 20.3);
        System.out.println("Расстояние между точками через метод класса DistanceCalculationMethods: " + DistanceCalculationMethods.distance(p1, p2));

        p1 = new Point(100.0, 200.3);
        p2 = new Point(700.0, 200.3);
        System.out.println("Расстояние между точками через метод класса Point: " + Point.distance(p1,p2));

    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody);
    }


}

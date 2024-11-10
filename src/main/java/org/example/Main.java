package org.example;

import org.example.book.Book;
import org.example.car.Car;
import org.example.point.Point;
import org.example.primitiveClock.Clock;
import org.example.student.Student;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("The culture map");
        book.setAuthor("Erin Meyer");
        book.setPublicationYear(2015);
        book.display();


        Student student = new Student();
        student.setName("Tom");
        student.setId(987);
        student.setAverageScore(78.4);
        student.print();


        Point point = new Point();
        point.setX(10);
        point.setY(4);
        point.moveLeft(7);
        point.moveUp(6);
        System.out.printf("x = %d, y = %d %n=====%n%n", point.getX(), point.getY());


        Clock clock = new Clock();
        clock.setHour(14);
        clock.setMinute(35);
        clock.setSecond(16);
        for (int i = 1; i <= 2; i++) {
            clock.tick();
        }
        clock.readTime();


        Car bmw = new Car();
        bmw.setBrand("BMW");
        bmw.setModel("GT3");
        bmw.setYear(2017);
        bmw.start();
        bmw.drive(5);
        bmw.drive(45);

    }
}

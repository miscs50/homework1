package org.example.student;

public class Student implements Printable {
    private String name;
    private int id;
    private double averageScore;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAverageScore() {
        return this.averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void print() {
        System.out.printf(
                "Student info: %s, %d, %f %n=====%n%n", name, id, averageScore
        );
    }
}

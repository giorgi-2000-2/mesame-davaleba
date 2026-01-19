package org.example;

import net.datafaker.Faker;

 class TestStudent {

    private String name;
    private int age;
    private double grade;

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}

public class Main {
    public static void main(String[] args) {

        Faker faker = new Faker();

        TestStudent student = new TestStudent();
        student.setName(faker.name().fullName());
        student.setAge(faker.number().numberBetween(18, 30));
        student.setGrade(faker.number().randomDouble(2, 60, 100));

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());
    }
}

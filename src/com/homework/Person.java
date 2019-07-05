package com.homework;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int weight; //in kg
    private double height; //in cm

    public Person(String firstName, String lastName, int age, int weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "имя = '" + firstName + '\'' +
                ", фамилия = '" + lastName + '\'' +
                ", возраст = " + age +
                ", вес = " + weight +
                ", рост = " + height +
                '}';
    }
}

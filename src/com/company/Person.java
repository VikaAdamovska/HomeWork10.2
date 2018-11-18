package com.company;

public class Person {
   private String name, surname;
   private int age, height;
   private double weight;

   public Person(String name, String surname){
        this.name = name;
        this.surname = surname;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if (age < 110 && age >= 0){
            this.age = age;
        }
    }

    public void setHeight(int height) {
       if (height < 200 && height >= 45) {
           this.height = height;
       }
    }

    public void setWeight(double weight) {
       if (weight < 250 && weight >= 2.5) {
           this.weight = weight;
       }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}

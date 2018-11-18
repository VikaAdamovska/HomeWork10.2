package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*2. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
              Создать один или несколько конструкторов который гарантирует что у каждого есть имя, фамилия.
              Создать массив из 100 обьектов типа Person заполненных случайными данными (создать массив на 6 имен и выбирать из него случайным образом).
        2.1*. Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
        не было человека весом 3 кг и ростом 180 итд.*/

        String [] name = {"Sveta", "Lida", "Roman", "Dima", "Bika", "Nazar"};
        String [] surname = {"Ivanov", "Petrov", "Sidorov", "Bagriy", "Loburenko", "Nazarenko"};
        Random random = new Random();


        Person [] personArray = new Person[100];
        for (int i = 0; i < personArray.length; i++) {
            int a = random.nextInt(6);
            int b = random.nextInt(6);
            personArray[i] = new Person(name[a], surname[b]);

            System.out.println(personArray[i].getName() + " " +  personArray[i].getSurname());
        }



    }
}

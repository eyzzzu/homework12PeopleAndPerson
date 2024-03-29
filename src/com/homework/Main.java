package com.homework;

import java.io.FileNotFoundException;

public class Main {
    /*
    Домашнее задание 12

1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
   Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
   Создать массив из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько имен и выбирать из него случайным образом).

1.1*. Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
      чтоб не было человека весом 3 кг и ростом 180 итд.
     */

    public static void main(String[] args) throws FileNotFoundException {

        PeopleList.readFile();          // считываем имена и фамилии из подготовленного тхт файла
        // и создаем два списка(список имен и фамилий)

        PeopleList.createPeopleArray(); // создаем массив объектов People,
        // каждый объект через конструктор из класса Person,
        // с проверкой через индекс массы тела

        PeopleList.printPeopleArray();        // печатаем массив объектов People

        PeopleList.printElementOfPeopleArrayByTheIndex(0); // печатаем элемент массива PeopleArray по индексу

    }
}

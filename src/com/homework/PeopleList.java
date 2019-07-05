package com.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PeopleList {
    private static Random rnd = new Random();
    private static Person[] peopleArray = new Person[100];
    private static List<String> firstNameList = new ArrayList<>(51);
    private static List<String> lastNameList = new ArrayList<>(51);

    public static void readFile() throws FileNotFoundException {
        FileInputStream fileIn = new FileInputStream("firstAndLastNameList.txt");
        Scanner scan = new Scanner(fileIn);
        String line = null;
        while (scan.hasNextLine()) {
            line = scan.nextLine();
            if (line.contains(" ")) {
                firstNameList.add(line.substring(0, line.indexOf(" ")));
                lastNameList.add(line.substring(line.indexOf(" ") + 1));
            }
        }
    }

    public static void createPeopleArray() {
        double height = 0.0;
        int weight = 0;
        double indexBody = 0.0;
        int count = 0;
        for (int j = 0; j < 1000; j++) {
            height = rnd.nextDouble() * 215;
            weight = rnd.nextInt(100) + 30;
            indexBody = weight / ((height / 100) * (height / 100));

            if (indexBody > 12 && indexBody < 50) {
                peopleArray[count] = new Person(
                        firstNameList.get(rnd.nextInt(51)),  // имя
                        lastNameList.get(rnd.nextInt(51)),   // фамилия
                        rnd.nextInt(80) + 16,           // возраст
                        weight,                                     // вес
                        Math.round(height));                        // рост
                count++;
            }
            if (count == peopleArray.length) {
                break;
            }
        }
    }

    public static void printPeopleArray() {
        for (int i = 0; i < peopleArray.length; i++) {
            System.out.println((i + 1) + " " + peopleArray[i]);
        }
    }

    public static void printElementOfPeopleArrayByTheIndex(int index) {
        if (index <= peopleArray.length && index >= 0) {
            System.out.printf("\n\rЭлемент с индексом: %s => %s", index, peopleArray[index]);
        } else {
            System.out.println("\n\rНе допустимый индекс массива!!!");
        }
    }

    public static void printFirstNameArray() {
        for (int i = 0; i < firstNameList.size(); i++) {
            if ((firstNameList.size() - 1) == i) {
                System.out.print(firstNameList.get(i) + "\n\r");
            } else {
                System.out.print(firstNameList.get(i) + ", ");
            }
        }
    }

    public static void printLastNameArray() {
        for (int i = 0; i < lastNameList.size(); i++) {
            if ((lastNameList.size() - 1) == i) {
                System.out.print(lastNameList.get(i) + "\n\r");
            } else {
                System.out.print(lastNameList.get(i) + ", ");
            }
        }
    }
}

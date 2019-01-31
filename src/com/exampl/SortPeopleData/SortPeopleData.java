// Написать класс для хранения информации о людях. В конструктор передается
// один параметр String, в котором через ; перечисляется имя, возраст, вес,
// рост – пример: ("Alex; 45; 90; 185"). В конструкторе по этому параметру
// заполняются соответственно 4 поля (имя, возраст, вес, рост).  Метод, в
// который передается аналогичная строка ("Serg; 25; 80; 180")  и делается
// сравнение всех полей для данного объекта с данными из строки. Метод,
// выводящий всю информацию об объекте. Методы для изменения каждого из полей.
package com.exampl.SortPeopleData;

import java.util.Scanner;

public class SortPeopleData {

    String name = null;
    String age = null;
    String weight = null;
    String height = null;
    String[] peopleData;

    public SortPeopleData() {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }

    private void initArray() {
        int num = 4;
        peopleData = new String[num];
        peopleData[0] = " Олег ; 23 ; 75 ; 172";
        peopleData[1] = " Alex ; 34 ; 81 ; 164 ";
        peopleData[2] = " Serg ; 28 ; 72 ; 178 ";
        peopleData[3] = " Nik ; 18 ; 63 ; 165 ";
    }

    private void serchName() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Кто Вас интересует? Введите имя.");
        if (sc.hasNextLine()) {
            name = sc.nextLine();
            for (int i = 0; i < peopleData.length; i++) {
                if (peopleData[i].indexOf(name)==1) {
                    String[] str = peopleData[i].split(" ");
                    //System.out.println(str[i]);
                    System.out.println("Имя " + str[1] + " возраст " + str[3] + " вес " + str[5] + " рост " + str[7]);
                }
            }
        }

    }

    private void fieldComparison() {
        SortPeopleData Piple = new SortPeopleData();
        for (int i = 0; i < peopleData.length; i++) {
            System.out.println(peopleData[i]);
        }
    }

    private void edit() {
        Scanner sc = new Scanner(System.in);
        int numStr = 0;
        int n = 0;

        for (int i = 0; i < peopleData.length; i++) {
            System.out.println(peopleData[i]);
        }

        System.out.println("Введите номер редактируемой записи");
        if (sc.hasNextInt()) {
            numStr = sc.nextInt();
        }
        n = numStr;
        String[] str = peopleData[n].split(" ");
        System.out.println("Введите номер редактируемого поля, 1-имя,2-возраст,3-вес,4-рост");


        System.out.println();
        if (sc.hasNextInt()) {
            numStr = sc.nextInt();
        }
        if (numStr == 1) {
            System.out.println("Введите имя");
            if (sc.hasNextLine()) {
                name = sc.nextLine();
            }
            if (sc.hasNextLine()) {
                name = sc.nextLine();
            }
            peopleData[n] = peopleData[n].replaceFirst(str[0], name);
            System.out.println(peopleData[n]);
        }
        if (numStr == 2) {
            System.out.println("Введите возраст");
            if (sc.hasNextLine()) {
                age = sc.nextLine();
            }
            if (sc.hasNextLine()) {
                age = sc.nextLine();
            }
            System.out.println(peopleData[n].replaceFirst(str[2], age));
        }
        if (numStr == 3) {
            System.out.println("Введите вес");
            if (sc.hasNextLine()) {
                weight = sc.nextLine();
            }
            if (sc.hasNextLine()) {
                weight = sc.nextLine();
            }
            System.out.println(peopleData[n].replaceFirst(str[4], weight));
        }
        if (numStr == 4) {
            System.out.println("Введите рост");
            if (sc.hasNextLine()) {
                height = sc.nextLine();
            }
            if (sc.hasNextLine()) {
                height = sc.nextLine();
            }

            System.out.println(peopleData[n].replaceFirst(str[6], height));
        }
        System.out.println("Будем еще что то менят? 0-да, 1-нет");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        if (n == 0) {
            edit();
        }
    }

    private void inputNumber() {
        String numStr = null;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        if (sc.hasNextLine()) {
            numStr = sc.nextLine();
        }

    }

    public static void main(String arg[]) {
        SortPeopleData piple = new SortPeopleData();
        piple.initArray();
        piple.serchName();
        // piple.fieldComparison();
        // piple.edit();
    }
}

package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Задача 1
        University universityOne = new University("МФТИ", 50000, 780, 285);
        University universityTwo = new University("МГУ", 100000, 1500, 270);
        University universityThree = new University("РУТ", 30000, 400, 230);
        University universityFour = new University("СПбГУ", 34000, 500, 240);
        University universityFive = new University("ВШЭ", 75000, 900, 265);
        University universitySix = new University("МГИМО", 27500, 350, 210);

        Set<University> humanitiesUniversities = new HashSet<>();
        Set<University> technicalUniversities = new HashSet<>();

        Collections.addAll(humanitiesUniversities,
                universityTwo, universityFour, universityFive, universitySix);
        Collections.addAll(technicalUniversities,
                universityOne, universityTwo, universityThree, universityFour);

        Set<University> allUniversities = new HashSet<>();
        allUniversities.addAll(humanitiesUniversities);
        allUniversities.addAll(technicalUniversities);

        Set<University> bothUniversities = new HashSet<>(technicalUniversities);
        bothUniversities.retainAll(humanitiesUniversities);

        Set<University> specialUniversities = new HashSet<>(allUniversities);
        specialUniversities.removeAll(bothUniversities);

        System.out.println("Все университеты:");
        UniversityPrint(allUniversities);
        System.out.println("Университеты с 2мя направлениями:");
        UniversityPrint(bothUniversities);
        System.out.println("Специализированные университеты:");
        UniversityPrint(specialUniversities);
        //Задача 2
        City cityOne = new City("Москва",13000000);
        City cityTwo = new City("Санкт-Петербург",5600000);
        City cityThree = new City("Долгопрудный",120000);

        Map<University,City> universityCityMap = new HashMap<>();
        universityCityMap.put(universityOne,cityThree);
        universityCityMap.put(universityTwo,cityOne);
        universityCityMap.put(universityThree,cityOne);
        universityCityMap.put(universityFour,cityTwo);
        universityCityMap.put(universityFive,cityOne);
        universityCityMap.put(universitySix,cityOne);

        System.out.println("Кол-во людей в городе на 1 студента:");
        for (University key: universityCityMap.keySet()) {
            System.out.print(key.getName() + ": ");
            System.out.println((double)universityCityMap.get(key).getNumberOfPeople() / key.getNumberOfStudents());
        }
    }
    public static void UniversityPrint(Set<University> Universities){
        int k = 0;
        int studentSum = 0;
        int averageScore = 0;
        int averageNumberOfTeachers = 0;
        for (University a: Universities) {
            System.out.println(a);
            ++k;
            studentSum = studentSum + a.getNumberOfStudents();
            averageNumberOfTeachers = averageNumberOfTeachers + a.getNumberOfTeachers();
            averageScore = averageScore + a.getExamAverage();
        }
        System.out.println("Кол-во студентов: " + studentSum);
        System.out.println("Среднее кол-во преподавателей: " + (averageNumberOfTeachers / k));
        System.out.println("Средний балл: " + (averageScore/k));
    }

}
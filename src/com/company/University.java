package com.company;

import java.util.Objects;

public class University {
    private final String name;
    private final int numberOfStudents;
    private final int numberOfTeachers;
    private final int examAverage;

    public String getName() {
        return name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getNumberOfTeachers() {
        return numberOfTeachers;
    }

    public int getExamAverage() {
        return examAverage;
    }

    public University(String name, int numberOfStudents, int numberOfTeachers, int examAverage) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.numberOfTeachers = numberOfTeachers;
        this.examAverage = examAverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return numberOfStudents == that.numberOfStudents && numberOfTeachers == that.numberOfTeachers && examAverage == that.examAverage && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfStudents, numberOfTeachers, examAverage);
    }

    @Override
    public String toString() {
        return name + ", кол-во студентов: "
                + numberOfStudents + ", кол-во преподавателей: "
                + numberOfTeachers + ", среднее кол-во баллов: "
                + examAverage;
    }
}

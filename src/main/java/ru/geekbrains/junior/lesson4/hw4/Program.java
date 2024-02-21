package ru.geekbrains.junior.lesson4.hw4;

import java.sql.*;

import static ru.geekbrains.junior.lesson4.hw4.Course.findCourse;

public class Program {

//    Создайте базу данных (например, SchoolDB).
//    В этой базе данных создайте таблицу Courses с полями id (ключ), title, и duration.
//    Настройте Hibernate для работы с вашей базой данных.
//    Создайте Java-класс Course, соответствующий таблице Courses, с необходимыми аннотациями Hibernate.
//    Используя Hibernate, напишите код для вставки, чтения, обновления и удаления данных в таблице Courses.
//    Убедитесь, что каждая операция выполняется в отдельной транзакции.


    public static void main(String[] args) throws SQLException {

        Course biology = new Course("Biology", 26);
        Course math = new Course("Math", 4);
        Course javaJunior = new Course("Java Junior", 2);
        Course vue = new Course("Vue.js", 11);

        biology.saveCourse();
        math.saveCourse();
        javaJunior.saveCourse();
        vue.saveCourse();

        javaJunior.deleteCourse();

        Course unknownCourse = findCourse(5);
        unknownCourse.setDuration(156);

        unknownCourse.updateCourse();

        System.out.println();



    }
}

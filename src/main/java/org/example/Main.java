package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alejandro", -5);
        Student student2 = new Student("Irina", 70);
        Student student3 = new Student("Jaume", 45);
        Student student4 = new Student("Miguel", 80);

        Map<String, Student> studentMap = new HashMap<>();
        studentMap.putAll(Map.of( student1.getName(), student1, student2.getName(), student2, student3.getName(), student3, student4.getName(), student4));

        for(Student s : studentMap.values()){
            System.out.println(s.getName() + " " + s.getGrade());
        }

        Student.increaseGrade(studentMap);

        System.out.println("===================");

        for(Student s : studentMap.values()){
            System.out.println(s.getName() + " " + s.getGrade());
        }

    }
}
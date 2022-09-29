package org.example;

import java.util.Map;

public class Student {

    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {

        if(grade > 100) {
            this.grade = 100;
        }
         else if(grade < 0){
            this.grade = 0;
        } else{
            this.grade = grade;
        }
    }

    public static Map<String, Student> increaseGrade(Map<String, Student> studentMap){
        for(Student s : studentMap.values()){
            s.setGrade((int) (s.getGrade() * 1.1));
        }
        return studentMap;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //making list of student class objects
        Student st1 = new Student(1, "Bina      ");
        Student st2 = new Student(2, "Sajid");

        List<Student> studentList= new ArrayList<Student>();

        studentList.add(st1);
        studentList.add(st2);

        for(Student st : studentList)
            System.out.println("Hello " + st.getName().trim() + "!" + "\nYour roll number is "  + st.getRoll());

    }
}

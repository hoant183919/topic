package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;
    @Column(name = "Name")
    private String name;
    @Column(name = "Class")
    private String className;
    @Column(name = "Math")
    private int math;
    @Column(name = "Literature")
    private int literature;
    @Column(name = "English")
    private int english;

    public Student() {
    }

    public Student(String name, String className, int math, int literature, int english) {
        this.name = name;
        this.className = className;
        this.math = math;
        this.literature = literature;
        this.english = english;
    }
    public Student(int id,String name, String className, int math, int literature, int english) {
        this.ID = id;
        this.name = name;
        this.className = className;
        this.math = math;
        this.literature = literature;
        this.english = english;
    }


    public long getId() {
        return ID;
    }

    public void setId(long id) {
        this.ID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getLiterature() {
        return literature;
    }

    public void setLiterature(int literature) {
        this.literature = literature;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
    @Override
    public String toString() {
        return "Tutorial [id=" + ID + ", name=" + name + ", class=" + className + ", math=" + math + ", literature=" + literature + ", english=" + english +"]";
    }
}
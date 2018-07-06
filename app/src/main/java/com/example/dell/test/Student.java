package com.example.dell.test;

public class Student {
    String name;
    String collegeName;
    int fees;
    long phoneNumber;

    int id;

    public Student(int anInt, String string, String cursorString, long aLong, int cursorInt) {
        this.id = id;
        this.name = name;
        this.collegeName = collegeName;
        this.phoneNumber = phoneNumber;
        this.fees = fees;
    }



    public Student(String name, String collegeName, long phoneNumber, int fees) {
        this.id = id;
        this.name = name;
        this.collegeName = collegeName;
        this.phoneNumber = phoneNumber;
        this.fees = fees;

    }
    public Student() {

    }

    public String getName() {
        return name;
    }
    public String getCollegeName() {
        return collegeName;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public int getFees(){ return fees; }
    public int getId() {
        return id;
    }


    public void setFees(int fees) {
        this.fees = fees;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }
}



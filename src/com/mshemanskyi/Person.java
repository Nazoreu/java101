package com.mshemanskyi;

public class Person {
    private String firstName;
    private String lastName;
    private String pozition;
    private String sex;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getpozition() { return pozition; }

    public void setpozition(String pozition) { this.pozition = pozition; }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override public String toString() {
        return "Person{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", pozition='" + pozition + '\'' +
            ", sex='" + sex + '\'' +
            ", age=" + age +
            '}';
    }
}

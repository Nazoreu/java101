package com.mshemanskyi;

public class PlayerForvard {
    private String firstName;
    private String lastName;
    private String klikuha;
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


    public String getklikuha() {
        return klikuha;
    }

    public void setklikuha(String klikuha) {
        this.klikuha = klikuha;
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
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", klikuha='" + klikuha + '\'' +
                ", pozition='" + pozition + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}

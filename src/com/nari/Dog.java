package com.nari;

public class Dog {
    private int age;

    public Dog() {
    }

    public Dog(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(String food) {
        System.out.println("狗在吃" + food);
    }
}

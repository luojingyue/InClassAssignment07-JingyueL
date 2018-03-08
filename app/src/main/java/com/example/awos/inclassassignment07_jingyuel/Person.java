package com.example.awos.inclassassignment07_jingyuel;

import java.io.Serializable;

/**
 * Created by awos on 2018/3/7.
 */

public class Person implements Serializable{
    private String name;
    private int age;
    private boolean canSwim;
    public Person (String name, int age, boolean canSwim){
        this.age=age;
        this.name=name;
        this.canSwim=canSwim;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCanSwim(boolean canSwim){
        this.canSwim=canSwim;
    }

    public boolean isCanSwim() {
        return canSwim;
    }
}

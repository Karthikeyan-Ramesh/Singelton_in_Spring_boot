package com.singelton.java.springBoot;

public class Singelton {

    public static Singelton instance;

    public static Singelton getInstance(){
        if(instance == null){
            instance = new Singelton();
        }
        return instance;
    }

    public int value;

    public void intialize(int value){
        value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

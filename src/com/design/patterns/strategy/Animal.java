package com.design.patterns.strategy;

/**
 * Created by Prasad Shetye on 12/21/2016.
 */
public class Animal {

    private String name;
    private int weight;
    private double height;
    private int speed;
    private String sound;
    private Flyable flyablity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight < 0){
            System.out.print("Weight should be greater than zero");
        }else{
            this.weight = weight;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFlyablity() {
        return flyablity.fly();
    }
    public void setFlyable(Flyable flyablity) {
        this.flyablity = flyablity;
    }

}

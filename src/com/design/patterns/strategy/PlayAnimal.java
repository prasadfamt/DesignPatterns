package com.design.patterns.strategy;

/**
 * Created by Prasad.Shetye on 12/21/2016.
 */
public class PlayAnimal {

    public static void main(String[] args) {
        Animal rocky = new Dog();
        rocky.setName("Rocky");

        Animal tweety = new Bird();
        tweety.setName("Tweety");

        System.out.println(rocky.getName() + " Says:" + rocky.getSound());
        System.out.println(tweety.getName() + " Says:" + tweety.getSound());

        Animal duck = new Bird();
        duck.setName("Donald");
        duck.setFlyable(new canFly());
        System.out.println(duck.getName() + ":" + duck.getFlyablity());

        rocky.setFlyable(new cannotFly());
        System.out.println(rocky.getName() +":"+ rocky.getFlyablity());
    }
}

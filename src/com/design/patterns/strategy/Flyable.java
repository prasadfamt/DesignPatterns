package com.design.patterns.strategy;

/**
 * Created by Prasad Shetye on 12/21/2016.
 */
public interface Flyable {
    public String fly();
}

class canFly implements Flyable{

    @Override
    public String fly() {
        return "can fly";
    }
}

class cannotFly implements Flyable{
    @Override
    public String fly() {
        return "cannot fly";
    }
}

package com.otus.homeprojekt.animal.birds;

import com.otus.homeprojekt.animal.Animal;

public class Flying extends Animal implements IFlying {
    public void fly() {
        System.out.println("Я лечу!");
    }
}

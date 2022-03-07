package com.otus.homeprojekt;

import com.otus.homeprojekt.animal.Animal;
import com.otus.homeprojekt.animal.birds.Duck;
import com.otus.homeprojekt.animal.birds.Flying;
import com.otus.homeprojekt.animal.pets.Cat;

public class Main {

    public static void main(String[] args){
        Animal kisa = new Cat();

        kisa.setName("Куська");
        kisa.setAge(1);
        kisa.setWeight(8);
        kisa.setColor("рыжий");

        System.out.println(kisa);
        kisa.Say();

        Flying donald = new Duck();

        donald.setName("Дональд");
        donald.setAge(5);
        donald.setColor("белый");
        donald.setWeight(5);

        System.out.println(donald);
        donald.Say();
        donald.fly();

    }

}

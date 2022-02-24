package com.otus.homeprojekt;

public class Main {

    public static void main(String[] args){
       Cat Kisa =new Cat();
        Kisa.setName("Куська");
        Kisa.setAge(5);
        Kisa.setWeight(8);
        Kisa.setColor("рыжий");
       System.out.println(Kisa.toString());
        Kisa.Say();

       Dog Bob=new Dog();
       Bob.toString();
       Bob.Say();


        Duck Donald=new Duck();
        Donald.setName("Дональд");
        Donald.setAge(2);
        Donald.setColor("белый");
        Donald.setWeight(5);
        System.out.println(Donald.toString());
        Donald.Say();
        Donald.Fly();

    }

}

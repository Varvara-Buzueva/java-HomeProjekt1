package com.otus.homeprojekt;

public class Animal {

    private String name ;
    private int age;
    private int weight;
    private String color;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //Методы
    // Getter and Setter Say(Вывод на экран: "Я говорю"),
    //Go(Вывод на экран: "Я иду"),
    //Drink(Вывод на экран: "Я пью"),
    //Eat(Вывод на экран: "Я ем")

    public  void Say () {

        System.out.println("Я говорю");
    }
    public  void Go () {

        System.out.println("Я иду");
    }

    public  void Drink () {

        System.out.println("Я пью");
    }
    public void Eat(){

        System.out.println("Я ем");
    }
    @Override
    public String toString() {
        String year;
        // year = age == 1 ? " год" : age > 4 ? " лет" : " года";
        switch(age){
            case 1: year = " год";
                break;
            case 2:
            case 3:
            case 4: year = " года";
                break;
            default: year = " лет";
        }

        return "Привет! " +
               "Меня зовут " + name +
               ", мне " + age +year+
               ", я вешу - " + weight +" кг"+
               ", мой цвет – " + color+"." ;
    }
}

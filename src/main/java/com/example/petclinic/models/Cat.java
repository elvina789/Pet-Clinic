package com.example.petclinic.models;

public class Cat extends Pet {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age, "Cat");
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public String eat() {
        return "Cats eat cat food";
    }
}

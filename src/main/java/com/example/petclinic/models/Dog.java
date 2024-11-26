package com.example.petclinic.models;

public class Dog extends Pet {

    private String breed;


    public Dog(String name, int age, String breed) {
        super(name, age, "Dog");
        this.breed = breed;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Bark";
    }

    @Override
    public String eat() {
        return "Dogs eat dog food";
    }
}

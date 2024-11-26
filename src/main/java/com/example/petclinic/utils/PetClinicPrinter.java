package com.example.petclinic.utils;

import com.example.petclinic.models.Cat;
import com.example.petclinic.models.Dog;
import com.example.petclinic.services.GeneralVeterinarian;
import com.example.petclinic.services.SpecialistVeterinarian;

public class PetClinicPrinter {

    // Overloaded method for printing Dog details
    public void printDetails(Dog dog) {
        System.out.println(
                "Dog Details: \n" +
                        "Name: " + dog.getName() + "\n" +
                        "Age: " + dog.getAge() + "\n" +
                        "Species: " + dog.getSpecies() + "\n" +
                        "Breed: " + dog.getBreed() + "\n" +
                        "Sound: " + dog.makeSound() + "\n" +
                        "Food: " + dog.eat()
        );
    }

    // Overloaded method for printing Cat details
    public void printDetails(Cat cat) {
        System.out.println(
                "Cat Details: \n" +
                        "Name: " + cat.getName() + "\n" +
                        "Age: " + cat.getAge() + "\n" +
                        "Species: " + cat.getSpecies() + "\n" +
                        "Color: " + cat.getColor() + "\n" +
                        "Sound: " + cat.makeSound() + "\n" +
                        "Food: " + cat.eat()
        );
    }

    // Overloaded method for printing SpecialistVeterinarian details
    public void printDetails(SpecialistVeterinarian specialistVet) {
        System.out.println(
                "Specialist Veterinarian Details: \n" +
                        "Name: " + specialistVet.getName() + "\n" +
                        "Specialty: " + specialistVet.getSpecialty()
        );
    }

    // Overloaded method for printing GeneralVeterinarian details
    public void printDetails(GeneralVeterinarian generalVet) {
        System.out.println(
                "General Veterinarian Details: \n" +
                        "Name: " + generalVet.getName()
        );
    }
}

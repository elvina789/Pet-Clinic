package com.example.petclinic;

import com.example.petclinic.models.Cat;
import com.example.petclinic.models.Dog;
import com.example.petclinic.models.Pet;
import com.example.petclinic.services.GeneralVeterinarian;
import com.example.petclinic.services.SpecialistVeterinarian;
import com.example.petclinic.utils.PetClinicPrinter;

import java.util.ArrayList;
import java.util.List;

public class PetClinic {
    public static void main(String[] args) {
        // creating Animal (any animal)

        Pet pet = new Pet("Animal", 10, "dog") {
            @Override
            public String makeSound() {
                return "I am making sound...";
            }

            @Override
            public String eat() {
                return "I am eating...";
            }
        };
        // creating Dog
        Dog dog = new Dog("Momo", 5, "chihuachua");

        // creating Cat
        Cat cat = new Cat("Lulu", 8, "black");

        // creating GeneralVeterinarian
        GeneralVeterinarian generalVeterinarian = new GeneralVeterinarian("Alexa");

        // creating SpecialVeterinarian
        SpecialistVeterinarian specialistVeterinarian = new SpecialistVeterinarian("surgery", "Lora");

        // creating list of pets
        List<Pet> pets =new ArrayList<>();
        pets.add(dog);
        pets.add(cat);

        PetClinicPrinter printer = new PetClinicPrinter();

        //  verify that the examinePet method works for both veterinarians

        for (Pet currentPet : pets) {
            System.out.println(generalVeterinarian.examinePet(currentPet));
            System.out.println(specialistVeterinarian.examinePet(currentPet));
        }



        // Print details for each object verify if the pet and veterinarians methods work correctly

        printer.printDetails(dog);               // Print dog details
        printer.printDetails(cat);               // Print cat details
        printer.printDetails(specialistVeterinarian);     // Print specialist Veterinarian details
        printer.printDetails(generalVeterinarian);        // Print general Veterinarian details

        // calling examinePet method for specialistVeterinarian
        System.out.println(specialistVeterinarian.examinePet(dog));  // Should return Specialist surgery examining Momo.

        // calling examinePet method for generalVeterinarian
        System.out.println(generalVeterinarian.examinePet(dog));  // Should return General examining Momo, a Dog.

    }
}

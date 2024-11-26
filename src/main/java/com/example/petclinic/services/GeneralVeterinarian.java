package com.example.petclinic.services;

import com.example.petclinic.models.Pet;
import com.example.petclinic.services.Veterinarian;

public class GeneralVeterinarian implements Veterinarian {

    private String name;

    public GeneralVeterinarian(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String examinePet(Pet pet) {
        return "Examining " + pet.getName() + ", a " + pet.getSpecies() + ".";
    }
}

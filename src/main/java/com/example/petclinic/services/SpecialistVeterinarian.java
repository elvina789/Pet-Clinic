package com.example.petclinic.services;

import com.example.petclinic.models.Pet;

public class SpecialistVeterinarian implements Veterinarian {

    private String specialty;
    // adding name for method getName - each instance will have its one name
    private String name;

    public SpecialistVeterinarian(String speciality, String name) {
        this.specialty = speciality;
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String examinePet(Pet pet) {
        return "Specialist " + specialty + " examining " + pet.getName() + ".";
    }
}

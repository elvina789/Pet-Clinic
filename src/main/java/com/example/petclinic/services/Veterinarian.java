package com.example.petclinic.services;

import com.example.petclinic.models.Pet;

public interface Veterinarian {

    String getName();

    String examinePet(Pet pet);

}

package de.phl.programmingproject.petadoption;

import java.util.Date;

public class Adoption {
    private Pet pet;
    private Adopter adopter;
    private Date date;

    public Adoption(Pet pet, Adopter adopter, Date date) {
        this.pet = pet;
        this.adopter = adopter;
        this.date = date;
    }

    public String getInfo() {
        return pet.getInfo() + " adopted by " + adopter.getName() + " on " + date.toString();
    }
}

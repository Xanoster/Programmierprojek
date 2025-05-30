package de.phl.programmingproject.petadoption;

public class Pet {
    private String name;
    private int age;
    private String breed;
    private boolean adopted;

    public Pet(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.adopted = false;
    }

    public String getInfo() {
        return name + ", " + age + " years old, " + breed;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public Adoption adopt(Adopter adopter, java.util.Date date) {
        this.adopted = true;
        return new Adoption(this, adopter, date);
    }
}

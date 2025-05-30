package de.phl.programmingproject.petadoption;

public class Adopter {
    private String name;
    private String phone;
    private String email;

    public Adopter(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getInfo() {
        return name + ", Phone: " + phone + ", Email: " + email;
    }

    public String getName() {
        return name;
    }
}

package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {

    private String name;
    private String species;
    private List<String>vaccinations = new ArrayList<>();

    public Pet(String name, String species){
        this.name = name;
        this.species = species;
    }

    public String getName(){
        return name;
    }

    public String getSpecies(){
        return species;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setVaccinations(List<String> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public String listVaccinations(){
        String output = "";
        for (String vaccination : vaccinations){
            output = output + vaccination + ", ";
        }
        return output.substring(0,output.length() - 2);
    }

}

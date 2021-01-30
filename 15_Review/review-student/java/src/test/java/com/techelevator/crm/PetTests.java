package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTests {


    @Test
    public void list_vaccinations_returns_list_of_vaccinations(){
        //arrange
        Pet sut = new Pet("Jack","Dog");

        List<String> vaccinations = new ArrayList<>();
        vaccinations.add("Rabies");
        vaccinations.add("Distemper");
        vaccinations.add("Parvo");

        sut.setVaccinations(vaccinations);



        Assert.assertEquals("Rabies, Distemper, Parvo", sut.listVaccinations());
    }

    @Test
    public void getName_returns_name(){
        //arrange
        Pet sut = new Pet("Martha","Lizard");



        Assert.assertEquals("Martha",sut.getName());
    }


    @Test
    public void getSpecies_returns_species(){
        Pet sut = new Pet("Noodles","Cat");

        Assert.assertEquals("Cat",sut.getSpecies());
    }

    @Test
    public void getvaccinations_returns_vaccinations(){
        Pet sut = new Pet("Larry", "Llama");

        List<String> vaccinations = new ArrayList<>();
        vaccinations.add("Rabies");
        vaccinations.add("Distemper");
        vaccinations.add("Parvo");

        sut.setVaccinations(vaccinations);

        Assert.assertEquals(vaccinations,sut.getVaccinations());


    }

    @Test
    public void setName_returns_name_set(){
        Pet sut = new Pet("Miguel", "Beetle");

        sut.setName("Miguel");

        Assert.assertEquals("Miguel",sut.getName());
    }

    @Test
    public void setSpecies_returns_species_set(){
        Pet sut = new Pet("Bob","Bunny");

        sut.setSpecies("Bunny");

        Assert.assertEquals("Bunny",sut.getSpecies());
    }





}

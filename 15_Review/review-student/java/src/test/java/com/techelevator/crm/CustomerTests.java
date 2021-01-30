package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerTests {

    @Test
    public void getBalanceDue_returns_total_balance(){
        Customer sut = new Customer("Bill", "Billiamson","7777777");

        Map<String, Double>servicesRendered = new HashMap<>();
        servicesRendered.put("Walking", 20.00);
        servicesRendered.put("Grooming", 9.99);
        servicesRendered.put("Spay", 100.00);

        sut.getBalanceDue(servicesRendered);

        Assert.assertEquals(129.99,sut.getBalanceDue(servicesRendered),001);

    }

    @Test
    public void getPhoneNumber_returns_phoneNumber(){
        Customer sut = new Customer("Larry", "Larryson");

        sut.setPhoneNumber("5555551");

        Assert.assertEquals("5555551",sut.getPhoneNumber());
    }

    @Test
    public void setPets_and_GetPets_returns_pets(){
        Customer sut = new Customer ("Karen","Karenson");
        Pet sut2 = new Pet("Foxy","Fox");

        List<Pet>pets = new ArrayList<>();
        pets.add(sut2);

        sut.setPets(pets);

        Assert.assertEquals(pets,sut.getPets());

    }
}

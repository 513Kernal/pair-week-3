package com.techelevator.hr;

import com.techelevator.crm.Customer;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EmployeeTests {

    @Test
    public void getFullNameReturnsCorrectFormat() {
        Employee sut = new Employee("Test", "Testerson");

        String fullName = sut.getFullName();

        assertEquals("The employee full name is not in the correct format.", "Testerson, Test", fullName);
    }

    @Test
    public void raiseSalaryTest_Positive() {
        Employee sut = new Employee("Test", "Testerson");
        sut.setSalary(100);

        sut.raiseSalary(5);

        assertEquals("The employee raise of 5% was not computed correctly.", 105, sut.getSalary(), 0.0);
    }

    @Test
    public void raiseSalaryTest_Negative() {
        Employee sut = new Employee("Test", "Testerson");
        sut.setSalary(100);
        sut.raiseSalary(-10); //"raise" by negative 10%

        assertEquals("Salary should remain the same when raise percentage is negative.", 100, sut.getSalary(), 0.0);
    }

    @Test
    public void getBalanceDue_returns_total_balance_with_discount() {
        Employee sut = new Employee("Graham", "Gramcrackerson");

        Map<String, Double> servicesRendered = new HashMap<>();
        servicesRendered.put("Walking", 20.00);
        servicesRendered.put("Grooming", 9.99);
        servicesRendered.put("Spay", 100.00);

        sut.getBalanceDue(servicesRendered);

        Assert.assertEquals(119.99, sut.getBalanceDue(servicesRendered), 001);
    }
}

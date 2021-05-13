package com.company;


import java.util.Objects;

public class Person  {

private String firstName;
private String lastName;
private Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }




    @Override
    public String toString() {
        return "Person{" +
                "Name:'" + firstName  +
                " " + lastName + '\'' +
                ", Address:" + address +
                '}' + "\n";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }





}



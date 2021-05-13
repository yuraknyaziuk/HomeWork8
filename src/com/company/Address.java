package com.company;


public class Address {
    private String city;
    private String street;
    private Integer number;


    public Address(String city, String street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }


    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumber() {
        return number;
    }


}



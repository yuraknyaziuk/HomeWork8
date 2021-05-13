package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // Создайте новый проект, залинкуйте его с удаленным репозиторием на GitHub, добавьте файл .gitignore и сделайте коммит (без .gitignore домашка не принимается)
        //Создайте класс Address с тремя полями: город, улица и номер дома (числом). Все поля должны быть с модификатором private. Инициализация полей только в конструкторе. Создайте геттеры для каждого поля
        //Создайте класс Person с тремя полями: имя, фамилия и адрес. Поле адрес должно быть типа Address, которое создали в пункте 2. Инициализация полей только в конструкторе. Создайте геттеры для каждого поля. Переопределите метод toString()
        //Для демонстрации работы приложения создайте:
        // 3 полностью заполненных экземпляра класса Person
        //1 экземпляр класса Person с именем = null
        //1 экземпляр класса Person с фамилией = null
        //1 экземпляр класса Person с адресом = null
        //Сложите полученных 6 экземпляров в коллекцию List
        //Коллекцию из пункта 5 с помощью Stream API:
        //отфильтруйте на предмет того, что ни одно из полей класса Person не равно null
        //отсортируйте коллекцию экземпляров класса Person по возрастанию по полю “номер дома”
        //преобразуйте каждый объект в строку (с помощью метода toString())
        //сформируйте результирующую коллекцию
        //Залить код в репозиторий и отправить ссылку на репозиторий преподавателю
        Address address = new Address("Minsk", "Slobodskaya street", 91);
        Address address2 = new Address("Moskow", "Lenina street", 301);
        Address address3 = new Address("Moskow", "Lenina street", 12);
        Address address4 = new Address("Moskow", "Lenina street", 10);


        Person person = new Person(null, "Return", address4);
        Person person2 = new Person("Nill", null, address2);
        Person person3 = new Person("Jane", "Return", null);
        Person person4 = new Person("Violetta", "Fagerman", address3);
        Person person5 = new Person("Svetvana", "Rakitich", address2);
        Person person6 = new Person("Pavel", "Reut", address);
//

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);

        persons
                .stream()
                .filter(x -> x.getFirstName() != null && x.getLastName() != null && x.getAddress() != null)
                .sorted((x1, x2) -> x1.getAddress().getNumber().compareTo(x2.getAddress().getNumber()))
                .collect(Collectors.toList());



    }
}

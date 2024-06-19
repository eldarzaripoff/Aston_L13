package ru.netology.seconTask;

import javax.lang.model.type.IntersectionType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    Map<String, List<String>> phoneBook = new HashMap<>();
    public Phonebook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (phoneBook.containsKey(lastName)) {
            phoneBook.get(lastName).add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(lastName, phoneNumbers);
        }
    }

    public List<String> get(String lastName) {
        if (phoneBook.containsKey(lastName)) {
            return phoneBook.get(lastName);
        } else {
            return new ArrayList<>();
        }
    }
}

package ru.netology;

import ru.netology.seconTask.Phonebook;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        First Task
        */
        String[] array = {"Michael", "Fred", "Frank", "Fred", "Phil", "Alex", "Alex",
                "Sara", "Joshua", "Phil", "Mack", "Gregory", "Bruis"};
        System.out.println("Список уникальных имён:");
        for (Map.Entry<String, Integer> entry : countNamesFrequency(array).entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " раз(а)");
        }
        System.out.println();

        /*
        Second Task
        */

        Phonebook phoneBook = new Phonebook();

        // Добавляем записи
        phoneBook.add("Иванов", "123-45-67");
        phoneBook.add("Петров", "987-65-43");
        phoneBook.add("Сидоров", "456-78-90");
        phoneBook.add("Иванов", "098-76-54");

        // Ищем номера по фамилии
        List<String> ivanovNumbers = phoneBook.get("Иванов");
        System.out.println("Номера телефонов Иванова(-ых): " + ivanovNumbers);

        List<String> petrovNumbers = phoneBook.get("Петров");
        System.out.println("Номер телефона Петрова(-ых): " + petrovNumbers);

        List<String> sidorovNumbers = phoneBook.get("Сидоров");
        System.out.println("Номер телефона Сидорова(-ых): " + sidorovNumbers);

    }
    public static Map<String, Integer> countNamesFrequency(String[] words) {

        Map<String, Integer> namesFrequencyCounter = new HashMap<>();
        for (String word: words) {
            namesFrequencyCounter.put(word, namesFrequencyCounter.getOrDefault(word, 0) + 1);
        }
        return namesFrequencyCounter;

    }
}
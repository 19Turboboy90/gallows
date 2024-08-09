package main.java.ru.zharinov;

import main.java.ru.zharinov.words.WordStorage;

public class Main {
    public static void main(String[] args) {
        WordStorage wordStorage = new WordStorage();
        System.out.println(wordStorage.getRandomWord());
    }
}

package main.java.ru.zharinov.words;

import java.util.*;

public class WordStorage {
    private final static WordStorage wordStorage = new WordStorage();

    private WordStorage() {
    }

    public static WordStorage getInstance() {
        return wordStorage;
    }

    private final List<String> words = List.of("�����", "�����", "�����", "�����", "�����",
            "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����", "����", "�����", "�����", "�����",
            "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����",
            "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����",
            "�����", "�����", "�����", "�����", "����", "�����", "�����", "�����", "�����", "�����", "�����", "�����",
            "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����",
            "�����", "����", "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����",
            "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����", "�����");


    public String getRandomWord() {
        Random random = new Random();
        int number = random.nextInt(words.size()) + 1;
        return words.get(number);
    }
}

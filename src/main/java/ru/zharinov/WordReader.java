package main.java.ru.zharinov;

import main.java.ru.zharinov.exception.FileNotFoundException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordReader {
    private final static WordReader WORD_READER = new WordReader();
    private final List<String> words = new ArrayList<>();

    private WordReader() {
    }

    {
        readFileOfWord();
    }

    public static WordReader getInstance() {
        return WORD_READER;
    }

    public void readFileOfWord() {
        try {
            String s = Files.readString(
                    Path.of("src/main/java/ru/zharinov/files/words/words.txt"), StandardCharsets.UTF_8);
            words.addAll(List.of(s.split(",")));
        } catch (IOException e) {
            throw new FileNotFoundException("File is not found");
        }
    }

    public String getRandomWord() {
        Random random = new Random();
        int number = random.nextInt(words.size());
        return words.get(number);
    }
}
package main.java.ru.zharinov;

import main.java.ru.zharinov.exception.FileNotFoundException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Game {
    private final Scanner console = new Scanner(System.in);
    private final WordReader wordReader = WordReader.getInstance();
    private boolean isStop = true;
    private final int NUMBER_OF_ATTEMPTS = 6;
    private int count = NUMBER_OF_ATTEMPTS;

    public void start() {
        while (isStop) {
            String randomWord = wordReader.getRandomWord().toLowerCase(Locale.ROOT);
            char[] chars = randomWord.toCharArray();
            Arrays.fill(chars, '_');
            System.out.print("Начать новую игру? 'да' или 'выход'-> ");
            String start = console.nextLine();
            if (start.equals("да")) {
                System.out.println("У Вас " + count + " попыток, чтобы отгадать слово.");
                while (count > 0) {
                    System.out.print("Введите букву: ");
                    String letter = console.nextLine();
                    if (!randomWord.contains(letter) || letter.length() > 1) {
                        drawImage();
                        count--;
                    }
                    for (int i = 0; i < randomWord.length(); i++) {
                        String currentLetter = String.valueOf(randomWord.charAt(i));
                        if (letter.equals(currentLetter)) {
                            chars[i] = randomWord.charAt(i);
                        }
                    }
                    if (Arrays.equals(chars, randomWord.toCharArray())) {
                        System.out.println("Вы выиграли!!!");
                        count = NUMBER_OF_ATTEMPTS;
                        break;
                    }
                    System.out.println(chars);
                    System.out.println("осталось " + count + " попыток");
                }
            }
            if (start.equals("выход") || count == 0) {
                isStop = false;
                System.out.println("Игра окончена!");
            }
        }
    }

    private void drawImage() {
        String s;
        try {
            s = Files.readString(Path.of("src/main/java/ru/zharinov/files/image/" + count + ".txt"));
        } catch (IOException e) {
            throw new FileNotFoundException("File is not found");
        }
        System.out.println(s);
    }
}
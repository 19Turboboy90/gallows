package main.java.ru.zharinov;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Game {
    private final Scanner console = new Scanner(System.in);
    private final WordStorage wordStorage = WordStorage.getInstance();

    private static final Visualization visualization = Visualization.getVisualization();
    private boolean isStop = true;
    //    private static final int NUMBER_OF_ATTEMPTS = visualization.image.size();
//    private int count = NUMBER_OF_ATTEMPTS;
    private int count = visualization.image.size();

    public void start() {
        while (isStop) {
            String randomWord = wordStorage.getRandomWord().toLowerCase(Locale.ROOT);
            char[] chars = randomWord.toCharArray();
            Arrays.fill(chars, '_');
            System.out.println(randomWord); // Проверка слова
            System.out.print("Начать новую игру? 'да' или 'выход'-> ");
            String start = console.nextLine();
            if (start.equals("да")) {
                System.out.println("У Вас " + count + " попыток, чтобы отгадать слово.");
                while (count > 0) {
                    System.out.print("Введите букву: ");
                    String letter = console.nextLine();
                    if (!randomWord.contains(letter) || letter.length() > 1) {
                        System.out.println(visualization.image.get(visualization.image.size() - count));
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
                        count = visualization.image.size();
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
}

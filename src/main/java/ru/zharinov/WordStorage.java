package main.java.ru.zharinov;

import java.util.*;

public class WordStorage {
    private final static WordStorage wordStorage = new WordStorage();

    private WordStorage() {
    }

    public static WordStorage getInstance() {
        return wordStorage;
    }

    private final List<String> words = List.of("Абаза", "Абака", "Абаси", "Бабай", "Бабах",
            "Баббл", "Вабик", "Вагон", "Вадья", "Гавар", "Гавот", "Газон", "Дабке", "Давёж", "Давка", "Евнух", "Еврей",
            "Жажда", "Жакан", "Жакет", "Забег", "Забив", "Забой", "Иблис", "Иваси", "Ивент", "Йезид", "Йенец", "Йиппи",
            "Кааба", "Кабак", "Кабан", "Лабаз", "Лабет", "Лабух", "Магик", "Магия", "Набат", "Набег", "Набла", "Оазис",
            "Обвал", "Обвес", "Пагон", "Падеж", "Падёж", "Рабат", "Радар", "Сабан", "Сабей", "Сабза", "Табак", "Табес",
            "Табло", "Уазик", "Уброд", "Убрус", "Фабра", "Фавор", "Фавус", "Хабар", "Хаджи", "Хадис", "Цадик", "Цанга",
            "Чабан", "Чабёр", "Шабат", "Шабаш", "Щебет", "Щегол", "Эвенк", "Эгида", "Эгрет", "Эдикт", "Эйдос", "Югрич",
            "Югурт", "Юдоль", "Юзист", "Юкола", "Ябеда", "Ягель", "Ягода", "Ягуар", "Яичко");


    public String getRandomWord() {
        Random random = new Random();
        int number = random.nextInt(words.size()) + 1;
        return words.get(number);
    }
}
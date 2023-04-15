package ru.gb.lesson2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Homework2 {
    public static void main(String[] args) {
        Path path = Path.of("file.txt");
            try {
                Files.createFile(path);
                String text = "TEXT";
                String result = text.repeat(100);
                Files.writeString(path, result);
            } catch (IOException e) {
                System.out.println("При создании файла возникла ошибка.");
                }
    }
}

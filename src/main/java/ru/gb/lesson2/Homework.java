package ru.gb.lesson2;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        System.out.println(buildString(6, 'a', 'b'));
        System.out.println(buildString(8, 'x', 'y'));
    }

    static String buildString(int n, char c1, char c2) {
    // Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2, начиная с c1.
// Пример. (n = 6, c1='a', c2='b') -> "ababab"
// (n = 8, c1='x', c2='y') -> "xyxyxyxy"
        String bild = "" + c1 + c2;;
        var result = bild.repeat(n/2);
        return result;
    }
}
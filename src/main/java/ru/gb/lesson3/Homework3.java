package ru.gb.lesson3;


public class Homework3 {

public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<String> numbers = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");

        numbers.add("string");
        numbers.add("popol");
        numbers.add("kot");
        numbers.add("klop");
        removeIntegers(strings);
        System.out.println(removeIntegers(strings)); // [string, my_string]
        System.out.println(removeEvenNumber(numbers));
}

static String removeEvenNumber(List<Integer> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка

    for (int i = 0; i < numbers.size(); i++) {
        if (i%2 == 0){
            String str = "";
            str += numbers.remove(i);
        }
        else {
            i++;
        }
    }
    return str;
}

static String removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
    String str = null;
    try {
            str = "";
            for (int i = 0; i < strings.size(); i++) {
                if (Integer.parseInt(strings.get(i))){
                    strings.remove(i);
                } else {
                    str += strings.get(i);
                }

            }

        } catch(NumberFormatException e) {
//Данное выражение принимает строку, приобразует в число, если содержимое действительно число, то будет результат
// число
                    System.out.println("Не число");
                }
    return str;
}

}
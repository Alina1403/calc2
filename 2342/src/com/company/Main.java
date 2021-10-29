package com.company;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
/**
 * класс Main для реализации калькулятора
 * @author Alina
 */
public class Main {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Алина\\IdeaProjects\\2342\\src\\com\\company\\files\\input.TXT"));

        for (String s : lines) {
            System.out.println(s);
        }
        File file = new File("C:\\Users\\Алина\\IdeaProjects\\2342\\src\\com\\company\\files\\output.TXT");
        PrintWriter pw = new PrintWriter(file);
        String a, b, c;
        System.out.println("Ответ:");

        for (int i = 0; i<5; i++) {
            String line = lines.get(i);

            if (isResult(line)) {
                String[] data = getS(line);
                a = data[0];
                b = data[1];
                c = data[2];

                int q = getQ(a);
                int w = getQ(c);

                String operation = b;
                switch (operation) {
                    case ("-"):
                        System.out.println(sub(q, w));
                        pw.println(sub(q, w));

                        break;
                    case ("+"):
                        System.out.println(add(q, w));
                        pw.println(add(q, w));

                        break;
                    case ("/"):
                        System.out.println(div(q, w));
                        pw.println(div(q, w));

                        break;
                    case ("%"):
                        System.out.println(remains(q, w));
                        pw.println(remains(q, w));

                        break;
                    case ("*"):
                        System.out.println(multiply(q, w));
                        pw.println(multiply(q, w));
                        break;
                    case ("^"):
                        System.out.println(degree(q, w));
                        pw.println(degree(q, w));
                        break;
                }

            } else {
                System.out.println("Неккоректные данные");
                pw.println("Неккоректные данные");
                pw.close();
            }

        }pw.close();
    }


    /**
     * метод для преобразования строки в число
     * @param a  строка которую преобразуем в число
     * @return возвращает проеобразованную строку к числовому типу
     */
    private static int getQ(String a) {
        return Integer.parseInt(a);
    }
    /**
     * метод делит строку по пробелам
     * @param string исходная строка,которую делит по пробелам
     * @return возвращает строковый массив
     */

    private static String[] getS(String string) {
        return string.split(" ");
    }

    /**
     * метод возвращает true, если введенная строка соответсвует регулярному выражению, иначе false
     * @param string введенная строка
     * @return возвращает true, если введено правильно, иначе false
     */
    private static boolean isResult(String string) {
        return string.matches("\\d+\\s[\\+\\-\\*\\/\\%\\^]\\s\\d+");
    }

    /**
     * метод осуществляет операцию по возведению в степень
     * @param q первый операнд
     * @param w второй операнд
     * @return возвращает результат
     */
    private static double degree(int q, int w) {
        return Math.pow(q, w);
    }
    /**
     * Метод для умножения
     * @param q первый операнд
     * @param w второй операнд
     * @return возвращает результат
     */
    static int multiply(int q, int w) {
        return q * w;
    }
    /**
     * Метод для выделения остатка
     * @param q первый операнд
     * @param w второй операнд
     * @return возвращает результат
     */
    static int remains(int q, int w) {
        return q % w;
    }
    /**
     * Метод осуществляет деление
     * @param q первый операнд
     * @param w второй операнд
     * @return возвращает результат
     */
    static int div(int q, int w) {
        return q / w;
    }
    /**
     * Метод осуществляет сложение
     * @param q первый операнд
     * @param w второй операнд
     * @return возвращает результат
     */
    static int add(int q, int w) {
        return q + w;
    }
    /**
     * Метод осуществляет вычитание
     * @param q первый операнд
     * @param w второй операнд
     * @return возвращает результат
     */
    static int sub(int q, int w) {
        return q - w;
    }
}
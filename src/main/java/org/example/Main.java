package org.example;

public class Main {
    public static void main(String[] args) {
        // Создание объектов типа StringBuilder и инициализация значением
        StringBuilder builder1 = new StringBuilder("select * from students where ");
        StringBuilder builder2 = new StringBuilder("{\"name\":\"Ivanov\"," +
                " \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");

        // Удаление символов с 0 по 1 индекс включительно из builder2
        builder2.delete(0, 2);
        // Удаление символов с builder2.length() - 2 индекса по builder2.length() - 1 индекс включительно из builder2
        builder2.delete(builder2.length() - 2, builder2.length());
        // Замена символов "\"" на пустую строку в builder2
        changeSymbol(builder2, "\"", "");
        // Замена символов ":" на "=" в builder2
        changeSymbol(builder2, ":", "=");

        // В цикле, пока в builder2 есть вхождения строки "null"
        while (builder2.indexOf("null") != -1) {
            // Если последний символ "null" в builder2 находится перед запятой
            if (builder2.lastIndexOf(",", builder2.indexOf("null")) == -1) {
                // Удалить символы с начала до конкретного вхождения "null" включительно
                builder2.delete(0, builder2.indexOf("null") + 5);
            } else {
                // Иначе удалить символы после последнего вхождения запятой перед "null",
                // и до конкретного вхождения "null" включительно
                builder2.delete(builder2.lastIndexOf(",", builder2.indexOf("null")), builder2.indexOf("null") + 4);
            }
        }

        // Вывод результата объединения builder1 и builder2 на экран
        System.out.println(builder1.append(builder2));
    }

    // Определение метода changeSymbol, который меняет символы в StringBuilder
    public static StringBuilder changeSymbol(StringBuilder builder, String x, String y) {
        // В цикле, пока в builder есть вхождения символа x
        while (builder.indexOf(x) != -1) {
            // Замена символа x на символ y в builder
            builder.replace(builder.indexOf(x), builder.indexOf(x) + 1, y);
        }
        // Возвращение измененного builder
        return builder;
    }

}
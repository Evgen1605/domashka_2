package org.example;

public class razbor_domaski_prepodom {
    public static void main(String[] args) {
        String str = ".Рыбатекст ,используется }дизайнерами, проектировщиками! и фронтендерами, когда нужно быстро " +
                "заполнить макеты или?? прототипы\"{ содержимым. Это тестовый контент, который не должен нести " +
                "никакого" +
                " " +
                "смысла, лишь показать.. наличие\"\" самого текста: или продемонстрировать типографику в деле.";
        str =str.replaceAll("\\p{P}", "").replaceAll("\\s", " "); // заменяет символы пунктуации на пробелы и затем
        // все пробелы заменяет на один пробел
        String[] strings = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("'").append(strings[0]).append("' =");
        int a= 9;

    }
}

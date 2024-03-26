package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("~~~~~Задание 1~~~~~~~~");
        String NAME = "Тимофей";
        System.out.println("Hello "  + NAME);

        System.out.println("~~~~~Задание 2~~~~~~~~");
        Tester tester = new Tester("Работник", "Перышкин", 3, "да", 3000.0);
        Tester tester2 = new Tester("Человек", "оо", 4, "нет", 9000.0);
        Tester tester3 = new Tester("Люд", "ооо", 8, "нет", 13000.0);

        tester.printInfo();

        tester2.printInfo("Информация о сотруднике:");

        tester3.printInfo("Новый сотрудник", ":");

        Tester.printStaticInfo(tester);


    }
}
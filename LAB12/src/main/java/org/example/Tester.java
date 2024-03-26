package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0.0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "много лет");
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Опыт: " + experienceInYears);
        System.out.println("Уровень англа: " + englishLevel);
        System.out.println("ЗП: " + salary);
    }

    public void printInfo(String a) {
        System.out.println(a + " " + name + " " + surname + ":");
        System.out.println("Опыт: " + experienceInYears + " лет");
        System.out.println("Уровень англа: " + englishLevel);
    }

    public void printInfo(String a, String aa) {
        System.out.println(a + " " + name + " " + surname + aa);
        System.out.println("Опыт: " + experienceInYears + " лет");
        System.out.println("Уровень англа: " + englishLevel);
    }

    public static void printStaticInfo(Tester tester) {
        System.out.println("Имя: " + tester.name);
        System.out.println("Фамилия: " + tester.surname);
        System.out.println("Опыт: " + tester.experienceInYears);
        System.out.println("Уровень англа: " + tester.englishLevel);
        System.out.println("ЗП: " + tester.salary);
    }
}

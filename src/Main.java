public class Main {
    public static void main(String[] args) {
        // Домашнее задание-1,2
        System.out.println("Домашнее задание 1,2");

        // Задание 1
        System.out.println("Задание 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Поздравляем тебя с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно подождать");
        }

        // Задание 2
        System.out.println("Задание 2");
        int year = 30;
        if (year >= 7 && year < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (year >= 18 && year < 24) {
            System.out.println("Человек закончил школу, может отправляться в университет");
        } else {
            System.out.println("Человек окончил университет и пора искать первую работу");
        }

        // Задание 3
        System.out.println("Задание 3");
        short carCapacityPeople = 118;


        if (carCapacityPeople < 60) {
            System.out.println("Есть свободные сидячие места");
        } else if (carCapacityPeople >= 60 && carCapacityPeople <= 119) {
            System.out.println("Свободных сидячих мест нет, но есть свободные стоячие места");
        } else {
            System.out.println("Вагон забит полностью. Свободных мест нет");
        }
        // Домашнее задание 3
        System.out.println("Домашнее задание 3");

        // Задание 1
        System.out.println("Задание 1");
        int age1 = 30;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " ,то ему нужно ходить в сад");
        } else if (age1 >= 7 && age1 <= 18) {
            System.out.println("Если возраст человека равен " + age1 + " ,то ему нужно ходить в школу");
        } else if (age1 > 18 && age1 < 24) {
            System.out.println("Если возраст человека равен " + age1 + " ,то его место в университете");
        } else if (age1 >= 24) {
            System.out.println("Если возраст человека равен " + age1 + " ,то ему пора ходить на работу");
        }

        // Задание 2
        System.out.println("Задание 2");

        int attractionAgeRestrictions = 9;

        if (attractionAgeRestrictions < 5) {
            System.out.println("Если твой возраст равен "+ attractionAgeRestrictions
                    + ", то ты не можешь кататься на аттракционе");
        } else if (attractionAgeRestrictions >= 5 && attractionAgeRestrictions < 14) {
            System.out.println("Если твой возраст равен "+ attractionAgeRestrictions
                    + ", то ты можешь кататься на аттракционе только в сопровождении взрослого." +
                    " Если взрослого нет, то кататься нельзя.");
        } else if (attractionAgeRestrictions >= 14) {
            System.out.println("Если твой возраст равен "+ attractionAgeRestrictions
                    + ", то ты можешь кататься на аттракционе без сопровождения взрослого.");
        }

        // Задание 3
        System.out.println("Задание 3");

        int one = 45;
        int two = 14;
        int free = 65;

        if (one > two && one > free) {
            System.out.println("Максимальное число - " + one);
        } else if (two > one && two > free) {
            System.out.println("Максимальное число - " + two);
        } else if (free > one && free > two) {
            System.out.println("Максимальное число - " + free);
        }



    }   }
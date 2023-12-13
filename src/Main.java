public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        int age = 14;

        System.out.print("Если возраст человека равен " + age + ", то ");
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Task 2"); //Task 2
        int degrees = 23;
        System.out.print("На улице " + degrees + " градусов, ");

        if (degrees < 5 ) {
            System.out.print("нужно надеть шапку");
        }
        if (degrees > 5 ){
            System.out.print("можно идти без шапки");
        }
        System.out.println("");


        System.out.println("Task 3"); //Task 3
        int speed = 63;


        if (speed < 60 ) {
            System.out.print("Если скорость " + speed + ", то ");
            System.out.print("можно ездить спокойно");
        }
        if (speed > 60 ){
            System.out.print("Если скорость " + speed + ", то ");
            System.out.print("придется заплатить штраф");
        }
        System.out.println("");

        //Task 4
        System.out.println("Task 4");
        int age4 = 15;
        boolean needGoToKindergarten = age4 >= 2 && age4 <= 6 ? true : false;
        boolean needGoToSchool = age4 >= 7 && age4 <= 17 ? true : false;
        boolean needGoToUniversity = age4 >= 18 && age4 <= 24 ? true : false;
        boolean needGoToJob = age4 > 24 ? true : false;


        if (needGoToKindergarten || needGoToSchool || needGoToUniversity || needGoToJob) {
            if (needGoToKindergarten) {
                System.out.print("Если возраст человека равен " + age4 + ", то ему нужно ходить ");
                System.out.print("в детский сад");
            }
            if (needGoToSchool) {
                System.out.print("Если возраст человека равен " + age4 + ", то ему нужно ходить ");
                System.out.print("в школу");
            }
            if (needGoToUniversity) {
                System.out.print("Если возраст человека равен " + age4 + ", то ему нужно ходить ");
                System.out.print("в университет");
            }
            if (needGoToJob) {
                System.out.print("Если возраст человека равен " + age4 + ", то ему нужно ходить ");
                System.out.print("на работу");
            }
        } else {
            // рано ему куда то ходить) // ничего не выводим
        }
        System.out.println("");

        //Task 5
        System.out.println("Task 5");

        int age5 = 12;
        if (age5 > 5) {
            if (age5 < 14 ) {
                System.out.print("Если возраст ребенка равен " + age5 + ", то ему ");
                System.out.println("можно кататься на аттракционе в сопровождении");
            } else {
                System.out.print("Если возраст ребенка равен " + age5 + ", то ему ");
                System.out.println("можно кататься на аттракционе без сопровождения взрослого");
            }
        } else {
            System.out.print("Если возраст ребенка равен " + age5 + ", то ему ");
            System.out.println("нельзя кататься на аттракционе");
        }

        System.out.println("Task 6"); // Task 6
        int maxCapacity = 102;
        int maxSeats = 60;
        int passengersElse = 2;
        int passengersInTheCarriage = 0;

        if (maxCapacity > passengersInTheCarriage + passengersElse) {
            if (maxSeats > passengersInTheCarriage + passengersElse) {
                System.out.println("в вагоне есть сидячие места для дополнительных пассажиров");
            } else {
                System.out.println("в вагоне есть стоячие места для дополнительных пассажиров");
            }
        } else {
            System.out.println("В вагоне нет места для пассажиров ни стоячих ни сидячих");
        }

        System.out.println("Task 7"); // Task 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two) {
            if (one > three) {
                System.out.println("one is greater than the rest");
            } else {
                System.out.println("three is greater than the rest");
            }
        } else {
            if (two > three) {
                System.out.println("two is greater than the rest");
            } else {
                System.out.println("three is greater than the rest");
            }
        }

    }
}
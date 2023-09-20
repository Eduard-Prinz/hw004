public class Main {
    public static void main(String[] args) {
        int age = 11;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println(" Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }


        int temperature = 22;
        if (temperature <= 5) {
            System.out.println(" На улице холодно, нужно надеть шапку");
        } else {
            System.out.println(" Сегодня тепло, можно идти без шапки");
        }


        int speedMachine = 124;
        if (speedMachine > 60) {
            System.out.println(" Если скорость " + speedMachine + " то придется заплатить штраф");
        } else {
            System.out.println(" Если скорость " + speedMachine + " можно ездить спокойно");
        }


        int age1 = 33;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println(" Если возраст человека равен " + age1 + " то ему нужно ходить в детский сад");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println(" Если возраст человека равен " + age1 + " то ему нужно ходить в школу");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println(" Если возраст человека равен " + age1 + " то его место в университете");
        } else {
            System.out.println(" Если возраст человека равен " + age1 + " то ему пора ходить на работу");
        }


        int childAge = 8;
        if (childAge < 5) {
            System.out.println(" Если возраст ребенка равен " + childAge + " то ему нельзя кататься на аттракционе");
        }
        if (childAge > 5 && childAge < 14) {
            System.out.println(" Если возраст ребенка равен " + childAge + " то ему можно кататься на аттракционе в сопровождении");
        } else {
            System.out.println(" Если возраст ребенка равен " + childAge + " то ему можно кататься без сопровождения взрослого");
        }


        int totalPlace = 102;
        int sitPlace = 60;
        int standPlace = (int) (totalPlace - sitPlace);
        int busySitPlace = 33;          // Занятые сидячие места.
        int busyStandPlace = 22;        // Занятые стоячие места.
        int freeSitPlace = (int) (sitPlace - busySitPlace);
        int freeStandPlace = (int) (standPlace - busyStandPlace);
        int totalPpls = busyStandPlace + busySitPlace;
        int freePlace = (int) (totalPlace - totalPpls);
        if (busySitPlace < sitPlace) {
            System.out.println(" Если количество занятых сидячих мест " + busySitPlace + " то осталось " + freeSitPlace + " свободных сидячих мест");
        } else {
            System.out.println(" Свободных сидячих мест нет");
        }
        if (busyStandPlace < standPlace) {
            System.out.println(" Если количество занятых стоячих мест " + busyStandPlace + " то осталось " + freeStandPlace + " свободных стоячих мест");
        } else {
            System.out.println(" Свободных стоячих мест нет");
        }
        if (totalPpls <= totalPlace) {
            System.out.println(" Если пассажиров в вагоне " + totalPpls + " то свободных мест осталось " + freePlace + " шт");
        } else {
            System.out.println(" Свободных мест нет. Ожидайте следующий поезд :)");
        }


        int one = 777;
        int two = 6666;
        int three = 145;
        if (one > two && one > three) {
            System.out.println(" Первое число больше");
        } else {
            if(two > one && two > three) {
                System.out.println(" Второе число больше");
            } else {
                System.out.println( "Третье число больше");
            }
        }


    }
}
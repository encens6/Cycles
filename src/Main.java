public class Main {

    public static void main(String[] args) {
        for(int i = 0; i <= 10; i = i + 1){
            System.out.println("Итерация цикла " + i);
        }
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1 () {

        System.out.println("Task 1: ");

        for(int a = 1; a <= 10; a = a + 1){
            System.out.println("Cycle iteration: " + a);
        }
    }

    public static void task2 () {

        System.out.println("Task 2: ");

        for (int i = 10; i >= 1; i--){
            System.out.println("Cycle iteration: " + i);
        }
    }

    public static void task3 () {

        System.out.println("Task 3: ");

        for(int a = 0; a <= 17; a = a + 1){
            System.out.println("Cycle iteration: " + a);
        }
    }

    public static void task4 () {

        System.out.println("Task 4: ");

        for (int i = 10; i >= -10; i--) {

            System.out.println("Cycle iteration: " + i);
        }
    }

    public static void task5 () {

        System.out.println("Task 5: ");

        for (int i = 1904; i < 2096; i = i + 4){
            System.out.println( i + ": is a bisextil year ");
        }
    }

    public static void task6 () {

        System.out.println("Task 6: ");

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
    }

    public static void task7 () {

        System.out.println("Task 7: ");

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
            i *= 2;
        }
    }

    public static void task8 () {

        System.out.println("Task 8: ");

        int ep = 29000;
        int totalep = 0;
        for (int i = 0; i < 12; i++) {
            totalep = totalep + totalep /100;
            totalep = totalep + ep;
            System.out.println("Month " + i + " , economie is: " + totalep);
        }
        System.out.println(totalep);
    }

    public static void task9 () {

        System.out.println("Task 9: ");

        double ep = 29000;
        double totalep = 0;
        double interestRate = 0.12; // taux d'intérêt de 12%
        for (int i = 1; i <= 12; i++) {
            totalep += ep;
            totalep *= (1 + interestRate/12); // calcul de l'intérêt mensuel
            System.out.println("Month " + i + ", economie is " + (int)totalep + " roubles.");
        }
        System.out.println("Total economie: " + (int)totalep + " roubles.");
    }

    public static void task10 () {

        System.out.println("Task 10: ");

        int num = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
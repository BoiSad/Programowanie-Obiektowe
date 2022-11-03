import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6();
        zad7();
    }

    public static void zad1() {
        double[] liczby = {10, 4, 6, 7, 8};

        for (int i = 0; i < liczby.length; i++) {
            System.out.println(liczby[i]);
        }
        int suma = 0;
        for (int i = 0; i < liczby.length; i++) {
            suma += liczby[i];
        }
        System.out.println("Suma liczb: " + suma);
        double srednia = 0;
        for (int i = 0; i < liczby.length; i++) {
            srednia = suma / liczby.length;
        }
        System.out.println("Srednia: " + srednia);

        /*
         Pętlą for each
         int suma = 0;
         double srednia = 0;
         for (double i: liczby)
              {
                     suma += liczby[i];
        }
               for (double i: liczby)
              {
                     srednia = suma/ liczby.length;
        }
             System.out.println("Suma liczb: "+suma);
             System.out.println("Srednia: "+srednia);
        }
         */
    }

    public static void zad2() {
        int[] liczbyP = {4, 6, 8, 10, 12, 14};
        int[] liczbyN = {5, 7, 11};

        for (int i = 0; i < liczbyP.length; i += 2) {
            System.out.println("Parzysta: " + liczbyP[i] + ", ");
        }

        for (int j = 0; j < liczbyN.length; j += 2) {
            System.out.println("Nieparzyste: " + liczbyN[j] + ",");
        }
    }

    public static void zad3() {
        String[] slowa = {"Ala", "ma", "kota"};
        for (String slowo : slowa) {
            System.out.print(slowo.toUpperCase() + " ");
        }
        System.out.println();
    }

    public static void zad4() {
        String[] slowa = new String[3];
        System.out.println("Podaj słowa:  ");
        for (int i = 0; i < slowa.length; i++) {
            System.out.print(" slowo: ");
            slowa[i] = slowo();
        }
        for (int i = slowa.length - 1; i >= 0; i--) {
            for (int j = slowa[i].length() - 1; j >= 0; j--) {
                System.out.print(slowa[i].charAt(j));
            }
            System.out.println();
        }
    }

    public static String slowo() {
        return new Scanner(System.in).next();
    }


    public static void zad5() {
        int[] liczby = new int[8];
        System.out.println("Podaj " + liczby.length + " liczb:");
        for (int i = 0; i < liczby.length; i++) {
            System.out.print((i + 1) + " liczba: ");
            liczby[i] = getInt1();
        }
        for (int i = 1; i < liczby.length; i++) {

            int aktualnaLiczba = liczby[i];
            int j = i - i;
            while (j >= 0 && liczby[j] > aktualnaLiczba) {
                liczby[j + 1] = liczby[j];
                j--;
            }
            liczby[j + 1] = aktualnaLiczba;
        }

        System.out.println("Posortowane liczby:");
        for (int x : liczby) {
            System.out.print(x + ", ");
            System.out.println();
        }
    }

    public static int getInt1() {
        return new Scanner(System.in).nextInt();
    }



        public static void zad6() {
            int[] liczby = new int[5];
            System.out.println("Podaj " + liczby.length + " liczb:");
            for (int i = 0; i < liczby.length; i++) {
                System.out.print((i + 1) + " liczba: ");
                liczby[i] = getInt2();
            }
            for (int x : liczby) {
                if (x < 0) {
                    System.out.println(
                            "Tylko dla liczb >= 0. " +
                                    "Pomijam liczbe " + x
                    );
                } else {
                    int silnia = 1;
                    for (int i = 1; i <= x; i++) {
                        silnia *= i;
                    }
                    System.out.println("Silnia z " + x + " wynosi " + silnia);
                }
            }
        }
        public static int getInt2() {
            return new Scanner(System.in).nextInt();
        }


        public static void zad7() {
            String[] pierwsza = { "Karol", "ma", "psa" };
            String[] druga = { "Karol", "ma", "psa" };
            boolean roznicaZnaleziona = false;
            if (pierwsza.length != druga.length) {
                roznicaZnaleziona = true;
            } else {
                for (int i = 0; i < pierwsza.length; i++) {
                    if (!pierwsza[i].equals(druga[i])) {
                        roznicaZnaleziona = true;
                        break;
                    }
                }
            }
            if (roznicaZnaleziona) {
                System.out.println("Nie sa takie same.");
            } else {
                System.out.println("Sa takie same");
            }
        }
    }



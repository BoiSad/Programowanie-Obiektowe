import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        //zad1
        System.out.println(getMyName());
        System.out.println(getMyAge());
        //zad2
        getMyNumbers(2,5);
        //zad3
        System.out.println(Parzysta(2));
        //zad4
        System.out.println(podzielna3i5(25));
        //zad5
        System.out.println(potega(3));
        //zad6
        System.out.println(pierwiastek(9));
        //zad7
        System.out.println(trojkat(2,3,4));
    }
    //metody
    public static String getMyName(){
        return "Jan";
    }
    public static int getMyAge(){
        return 23;
    }
    public static void getMyNumbers(int l1, int l2){
        System.out.println(l1 + " + "+l2+" = "+(l1+l2));
        System.out.println(l1 + " - "+l2+" = "+(l1-l2));
        System.out.println(l1 + " * "+l2+" = "+(l1*l2));
    }
    public static boolean Parzysta(int a) {
        Scanner in = new Scanner(System.in);

        System.out.println("podaj a: ");
        a = in.nextInt();

        if (a % 2 == 0) {
            return true;
        }
        ;
        return false;
    }
    private static boolean podzielna3i5(double liczba) {
        Scanner in = new Scanner(System.in);
        System.out.println("podaj liczbe: ");
        liczba = in.nextInt();
        return liczba % 3 == 0 && liczba % 5 == 0;
    }
    private static double potega(double liczba) {
        Scanner in = new Scanner(System.in);
        System.out.println("podaj liczbe: ");
        liczba = in.nextInt();
        return Math.pow(liczba, 3);
    }
    private static double pierwiastek(double liczba) {
        Scanner in = new Scanner(System.in);
        System.out.println("podaj liczbe: ");
        liczba = in.nextInt();
        return Math.sqrt(liczba);
    }
    private static boolean trojkat(double liczba1, double liczba2, double liczba3) {
        Scanner in = new Scanner(System.in);
        System.out.println("podaj liczby: ");
        liczba1 = in.nextInt();
        liczba2 = in.nextInt();
        liczba3 = in.nextInt();
        if (liczba1 < 0 || liczba2 < 0 || liczba3 < 0) {
            return false;
        }


        double dlugosc = liczba1;
        double bok = liczba2;
        double bok2 = liczba3;

        if (liczba2 > liczba1 && liczba2 > liczba3) {
            dlugosc = liczba2;
            bok = liczba1;
            bok2 = liczba3;
        }
        else if (liczba3 > liczba1 && liczba3 > liczba2) {
            dlugosc = liczba3;
            bok = liczba1;
            bok2 = liczba2;
        }

        return bok * bok + bok2 * bok2 == dlugosc * dlugosc;
    }
}












        /*

       String imie,miasto;
       int wiek;

       // wczytywanie danych z klawiatury

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        wiek = input.nextInt();
        System.out.println("Podaj Imie: ");
        imie = input.next();
        System.out.println("Podaj Miasto: ");
        miasto = input.next();

        System.out.println("imie: "+imie+", miasto: "+miasto+ ", wiek: "+wiek);



/*





        /* System.out.println("Hello world!");
        System.out.println("Witaj");
        int a,b;
        float c = 2.9F;
        double d = 3.3443;
        boolean pytanie = true;
        String Imie = "Jan", miasto = "Rzeszow";
        int wiek = 24;
            System.out.println("imie: "+Imie+" miasto: "+miasto+ ", wiek: "+wiek); /*

         */





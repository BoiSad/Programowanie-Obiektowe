import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        //zad1
        System.out.println(getMyName());
        System.out.println(getMyAge());
        //zad2
        getMyNumbers(2,5);
        //zad3
        System.out.println(Parzysta());


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
            System.out.println("parzysta");
            return false;

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

    }



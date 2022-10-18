import java.util.LinkedList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // zadanie1();
        //zadanie2();
        //zadanie3();
        //kwadratowe();
        funkcje();
    }



    //zad1
    public static void zadanie1() {

        int n, a = 0, b = 10;
        double suma = 0, pkt, ile = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        n = input.nextInt();
        if (n > 0) {
            while (n > 0) {
                System.out.println("Podaj ilosc pkt: 0 - 10");
                pkt = input.nextDouble();

                if (pkt >= a && pkt <= b) {
                    suma += pkt;
                    ile++;
                    n--;
                }
            }//koniec while
                System.out.println("Ile:  " + ile);
                System.out.println("Suma pkt: " + suma);
                System.out.println("srednia: " + suma / ile);

            }
        else{
                System.out.println(("Ilosc studentow musi byc liczba >  0"));
            }
        }
        //zad2

    public static double Input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        double n = input.nextDouble();
        return n;
    }
    public static void zadanie2(){
        int ile_d=0, ile_u=0;
        double sumaD=0, sumaU=0,liczb;

        for(int i=0; i<10;i++){
            liczb=Input();
            if(liczb>=0) {
                ile_d++;
                sumaD += liczb;
            }else{
                ile_u++;sumaU+=liczb;
            }
        }//koniec for

        System.out.println("Ilosc dodatnich: "+ile_d+ ", suma:   "+sumaD);
        System.out.println("Ilosc ujemnych: "+ile_u+ ", suma: "+sumaU);
    }
    public static void zadanie3(){
        int ile_d=0, ile_u=0;
        double sumaD=0, sumaU=0,liczb;
        Random generator = new Random();
        int los = generator.nextInt(-10,55);
        for(int i=0; i<10;i++){
            liczb=Input();
            if(liczb>=0) {
                ile_d++;
                sumaD += liczb;
            }else{
                ile_u++;sumaU+=liczb;
            }
        }//koniec for

        System.out.println("Ilosc dodatnich: "+ile_d+ ", suma:   "+sumaD);
        System.out.println("Ilosc ujemnych: "+ile_u+ ", suma: "+sumaU);
    }
    public static boolean czyPalindrom(String s){
        int l = s.length() - 1;
        s.toLowerCase(Locale.ROOT);
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(l)) return false;
            l--;
        }
        return true;
    }
    public static void kwadratowe(){

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczby: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double delta;

        if(a==0){
            System.out.println("BLAD");
        }else{
            delta=b*b-4*a*c;
            if(delta<0){
                System.out.println("Brak rozwiazan");
            }if(delta==0){
                System.out.println("ma jeden pierwiastek, x1 = " + (-b/2*a));
            }
            if (delta > 0) {
                System.out.println("x1= " + (-b-Math.sqrt(delta))/(2*a));
                System.out.println("x2= " + (-b+Math.sqrt(delta))/(2*a));

            }
        }




    }
    public static void funkcje(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczby: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("Podaj x: ");
        int x = input.nextInt();
    if(x>0){
        a=2*x;
    }else if(x == 0){
        a = 0;
    }else if(x<0){
        a=-3*x;
    }
    if(x>=1){
        b=x*x;
    } else if(x<1) {
       b=x;
    }
    if(x>2){
        c=2+x;
    }else if(x==2){
        c=8;
    }else if(x<2){
        c=x-4;
    }
    System.out.println("A: "+a);
    System.out.println("B: "+b);
    System.out.println("C: "+c);
    }
    public static void porzadkowanie(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczby: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if(x>y && x>z){
            System.out.println("Najwieksza: "+);
        }
    }




    }
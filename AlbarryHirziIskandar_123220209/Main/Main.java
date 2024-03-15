package Main;

import Bangunruang.*;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = input.nextInt();
            processChoice(choice);
        }
    }

    private static void displayMenu() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.println("Mari berhitung bersamakuh ^_^");
        System.out.println("1. tabung");
        System.out.println("2. limas segitiga");
        System.out.println("3. exit");
    }

    private static void processChoice(int choice) {
        if (choice == 1) {
            calculateTabung();
            backToMenu();
        } else if (choice == 2) {
            calculateLimas();
            backToMenu();
        } else if (choice == 3) {
            System.out.println("see you when i see you");
            input.close();
            System.exit(0);
        }
    }

    private static void backToMenu() {
        System.out.println("klik enter untuk kembali ke menu!");
        input.nextLine();
        input.nextLine();
    }

    private static void calculateLimas() {
        System.out.println("input : ");
        System.out.println("input tinggi alasnya : ");
        double tinggiAlas = input.nextDouble();
        System.out.println("input alasnya : ");
        double alas = input.nextDouble();
        System.out.println("input tinggi limasnya : ");
        double tinggiLimas = input.nextDouble();

        System.out.println("hasil : ");
        Limas limas = new Limas(alas, tinggiAlas, tinggiLimas);
        System.out.println("luas segitiga : " + limas.luas());
        System.out.println("keliling segitiga : " + limas.keliling());
        System.out.println("volume limas : " + limas.volume());
        System.out.println("luas permukaan limas : " + limas.luasPermukaan());
    }

    private static void calculateTabung() {
        System.out.println("input  ");
        System.out.println("input jari-jari : ");
        double jari = input.nextDouble();
        System.out.println("input tinggi : ");
        double tinggi = input.nextDouble();
        Tabung tabung = new Tabung(jari, tinggi);
        System.out.println("luas lingkaran : " + tabung.luas());
        System.out.println("keliling lingkaran : " + tabung.keliling());
        System.out.println("volume tabung : " + tabung.volume());
        System.out.println("luas permukaan tabung : " + tabung.luasPermukaan());
    }
}

package efimov.apps;

import java.util.Scanner;

public class TestICO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ico, delka, sum = 0, pc, zbytek, posled;
        
        System.out.print("Zadejte cislo ICO: ");
        ico = sc.nextInt();
        // Vypocet delky cisla pres logaritmus
        delka = (int) (Math.log10(ico) + 1);
        // Overeni, ze ICO se sklada z osmi cislic
        if (delka != 8) System.out.println("Zadali jste nespravne ICO, musi byt osm cislic");
        // Aby cyklus nepocital posledni cilice
        int num = ico - ico % 10;
        // Nasobeni kazdeho cisla zprava doleva od 2 do 8 a vypocet jejich souctu
        for(int i = 1; i <= 8; ++i) {
            pc = num % 10;
            sum += pc * i;
            num = num / 10;
        }
        // Vypocet zbytku a posledniho cisla
        zbytek = sum % 11;
        posled = (11 - zbytek) % 10;
        System.out.format("Zbytek po deleni jedenactkou je: %d\nPosledni cislo je: %d", zbytek, posled);
    }
}
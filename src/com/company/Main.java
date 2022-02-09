//Micro assignment 4 - Brute Force Attack
package com.company;
import java.util.Random;

public class Main {

    //Definerer metode til liste:
    static void liste() {
        Random r = new Random();
        int tilfældigtTal1 = r.nextInt(10);
        int tilfældigtTal2 = r.nextInt(10);
        int tilfældigtTal3 = r.nextInt(10);
        int tilfældigtTal4 = r.nextInt(10);

        //opretter liste med de tilfældige tal
        int[] minListe = new int[] {tilfældigtTal1, tilfældigtTal2, tilfældigtTal3, tilfældigtTal4};

        // koverter tal, så de fire enkelte tal bliver til et '1000' tal
        int randomTal = (1000 * minListe[0]) + (100 * minListe[1]) + (10 * minListe[2]) + (minListe[3]);

        //Et for-loop, som tjekker alle mulige kombinationer og derefter printer fire tal ved siden af hinanden hver gang.
        for(int i = 0; i <= 9999; i++) {
            System.out.printf("%4d", randomTal + i);
            System.out.println();

        //if-statement: hvis 'i' ikke er det samme som 'randomTal', defineret ovenfor, skal computer skrive forkert og fortsætte
            if (i != randomTal) {
                  System.out.print("forkert" + " ");
            }
        //if-statement: hvis 'i' er det samme som 'randomTal' skal computer skrive korrekt og derefter stoppe (break), da koden er fundet
            if(i == randomTal ) {
                System.out.print("KORREKT" + " ");
                System.out.println(i);
                break;

            }
        }
    }

    public static void main(String[] args) {
        liste();
       }
}





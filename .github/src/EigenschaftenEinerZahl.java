

/*

Zuweisungs- und logische Operatoren
Aufgabe 2.2 Eigenschaften einer Zahl
Schreibe ein Programm, dass von der Konsole eine Zahl einliest und ausgibt:

ob es sich um eine runde Zahl handelt
ob die Zahl gerade ist
ob die Zahl deiner Glückszahl entspricht (denk dir hierfür einfach eine eigene Glückszahl aus und gib sie zu Beginn des Programms auf der Konsole aus)
ob die Zahl zweistellig ist
Tipp: Für die ersten beiden Punkte wirst du die Modulo Funktion brauchen.


 */


// Umgebung

import java.util.Scanner;

public class EigenschaftenEinerZahl {
    public static void main(String[] args) {

// Variablen

        int gluecksZahl = 12;
        int rundPruefung = 10;
        int moduloGerade, moduloRund;
        boolean glueckMatch, twoDigit;


// Scanner

        Scanner eingabe = new Scanner(System.in);

// Eingabe


        System.out.println("- - - - - - - - - - - - - - -\n");

        System.out.print("Bitte gib eine beliebige Zahl ein\n--> ");
        int eingabeZahl = eingabe.nextInt();

// Bestätigung


        System.out.println("\n\n- - - - - - - - - - - - - - -\n");
        System.out.println("Deine Eingabe: " + eingabeZahl + "\n");
        System.out.println("Das Programm überprüft deine Eingabe wie folgt:\n\n* Ob es sich um eine runde Zahl handelt\n* Ob die Zahl gerade ist\n* Ob die Zahl meiner Glückszahl " + gluecksZahl + " entspricht \n* Ob die Zahl zweistellig ist\n");
        System.out.println("- - - - - - - - - - - - - - -\n");


        System.out.println("Zum Fortfahren drücke bitte <Enter>\n");
        try {
            System.in.read();
        } catch (Exception e) {
        }

        eingabe.close();


        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("Deine Eingabe: " + eingabeZahl + "\n");

// Überprüfung und Ausgabe


        /*
         * Ob es sich um eine runde Zahl handelt
         * Ob die Zahl gerade ist
         * Ob die Zahl meiner Glückszahl 12 entspricht
         * Ob die Zahl zweistellig ist
         */

        // Ob es sich um eine runde Zahl handelt // Ich weiss echt nicht, warum das nicht läuft...
        moduloRund = (eingabeZahl % rundPruefung);
        if (moduloRund != 1) {
            System.out.println("* Die Zahl " + eingabeZahl + " ist rund. (Teilbar durch " + rundPruefung + ")");
        } else {
            System.out.println("* Die Zahl " + eingabeZahl + " ist keine runde Zahl. (Nicht durch " + rundPruefung + " teilbar)");
        }

        // Ob die Zahl gerade ist
        moduloGerade = (eingabeZahl % 2);
        if (moduloGerade != 1) {
            System.out.println("* Die Zahl " + eingabeZahl + " ist gerade.");
        } else {
            System.out.println("* Die Zahl " + eingabeZahl + " ist ungerade.");
        }

        //  Ob die Zahl meiner Glückszahl 12 entspricht
        if (eingabeZahl == gluecksZahl) {
            System.out.println("* Die Zahl " + eingabeZahl + " entspricht meiner persönlichen Glückszahl.");
        } else {
            System.out.println("* Die Zahl " + eingabeZahl + " entspricht nicht meiner persönlichen Glückszahl.");
        }

        // Ob die Zahl zweistellig ist
        if (eingabeZahl >= 10 && eingabeZahl <= 99) {
            System.out.println("* Die Zahl " + eingabeZahl + " ist zweistellig.");
        } else {
            System.out.println("* Die Zahl " + eingabeZahl + " ist nicht zweistellig.");
        }
        System.out.println("\n- - - - - - - - - - - - - - -\n");


    }
}

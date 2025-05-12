package Esercizio1;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;



    public class Esercizio1 {
        public static void main(String[] args) {
            int[] numeri = new int[5];
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < numeri.length; i++) {
                numeri[i] = random.nextInt(10) + 1;
            }


            System.out.println("Array iniziale:");
            stampaArray(numeri);

            while (true) {
                try {
                    System.out.print("\nInserisci un numero da inserire (0 per uscire): ");
                    int valore = scanner.nextInt();

                    if (valore == 0) {
                        System.out.println("Programma terminato.");
                        break;
                    }

                    System.out.print("Inserisci la posizione (0-4): ");
                    int posizione = scanner.nextInt();

                    numeri[posizione] = valore;
                    System.out.println("Array aggiornato:");
                    stampaArray(numeri);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Errore: posizione non valida. Inserisci un numero tra 0 e 4.");
                } catch (InputMismatchException e) {
                    System.out.println("Errore: devi inserire un numero intero.");
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Errore imprevisto: " + e.getMessage());
                }
            }

        }

        public static void stampaArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }



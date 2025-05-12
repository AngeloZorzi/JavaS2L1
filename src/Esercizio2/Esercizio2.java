package Esercizio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Select n° of Km:");
            double numKm = scanner.nextDouble();

            System.out.println("Select n° of lt");
            double numLt = scanner.nextDouble();

            double consumption = numKm/numLt;

            if (!Double.isFinite(consumption)){
                System.out.println("Mannaggia you cannot divide by 0...");
            } else {
                System.out.println("Consumption is:" + consumption + "Km/lt");
            }
        }catch (InputMismatchException e){
            System.out.println("You must insert a valid number!");
        }
    }
}

package lancuchy_tekstowe;

import java.io.*;

public class NewClass {

    public static void main(String[] args)
            throws IOException
    {
        String imie, nazwisko;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nProgram mierzy dlugosc lancucha imie i nazwisko.");
        System.out.print("Podaj imie:");
        imie = br.readLine();
        System.out.print("Podaj nazwisko:");
        nazwisko = br.readLine();
        System.out.println("Imie " + imie + " zawiera " + imie.length() + " liter(y).");
        System.out.println("Nazwisko " + nazwisko + " zawiera " + nazwisko.length() + " liter(y).");
        System.out.println("");
    }
}

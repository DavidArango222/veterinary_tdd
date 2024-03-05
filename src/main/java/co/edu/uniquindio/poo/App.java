package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Pets pet1 = new Pets("Abril",Species.CAT,Breed.ANGORA,(byte)4,Gender.FEMALE,Colour.BLACK,4.2);
        System.out.println("Hello World!");
        System.out.println(pet1);
    }
}

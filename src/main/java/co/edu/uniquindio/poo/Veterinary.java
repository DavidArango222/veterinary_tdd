package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Veterinary {
    private final String name;
    private static Collection<Pets> pets = null;


    public Veterinary(String name) {
        assert name != null : "El nombre no puede ser nulo";
        this.name = name;
        pets = new LinkedList<>();
    }


    public String getName() {
        return name;
    }

    public void petAdd(Pets pet) {
        assert validateDniCodeExists(pet.dniCode()) == false
                : "El número de identificación ya existe.";
        pets.add(pet);
    }


    public Pets getPets(String dniCode) {
        Pets petsInteres = null;

        for (Pets pets : pets) {
            if (pets.dniCode().equals(dniCode)) {
                petsInteres = pets;
            }
        }
        return petsInteres;
    }


    public static Collection<Pets> getPets() {
        return Collections.unmodifiableCollection(pets);
    }


    public Collection<Pets> getAlphabeticalListing() {
        var comparador = Comparator.comparing(Pets::name);
        var petsOrdenados = pets.stream().sorted(comparador).toList();
        return Collections.unmodifiableCollection(petsOrdenados);
    }


    public Collection<Pets> getDescendingAgeList() {
        var comparador = Comparator.comparing(Pets::age).reversed();
        var petsOrdenados = pets.stream().sorted(comparador).toList();
        return Collections.unmodifiableCollection(petsOrdenados);
    }


    public Collection<Pets> getAdultList() {
        var petsAdult = new LinkedList<Pets>();
        for (Pets pets : pets) {
            if (pets.age() > 4) {
                petsAdult.add(pets);
            }
        }
        return Collections.unmodifiableCollection(petsAdult);
    }

    
    private static boolean validateDniCodeExists(String dniCode) {
        boolean existe = false;

        for (Pets pets : pets) {
            if (pets.dniCode().equals(dniCode)) {
                existe = true;
            }
        }

        return existe;
    }
}

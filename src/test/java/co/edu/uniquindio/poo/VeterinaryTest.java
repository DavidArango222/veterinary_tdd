package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.rowset.spi.SyncProviderException;

import org.junit.jupiter.api.Test;

/**
 * Clase para probar el funcionamiento del código de un curso
 * 
 * @author Jhonatan David Vivas Arango, Valery Andrea Ortiz Mesa, Nicol Dayana Marín Moreno
 * @since 2024-01
 * 
 *        Licencia GNU/GPL V3.0
 *        (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
public class VeterinaryTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Test to verify that a student's data is complete.
     */
    @Test
    public void completeInformation() {
        LOG.info("Iniciating test for complete information");
        Veterinary veterinary = new Veterinary("Huellitas");
        assertEquals("Programación I", veterinary.getNombre());
        LOG.info("Finishing test for complete information");
    }

    /**
     * Test to verify that a pet is added
     */
    @Test
    public void petAdd() {
        LOG.info("Iniciating test add pet");
        Veterinary veterinary = new Veterinary("Huellitas");
        Pets pet = new Pets("Manchas", Species.DOG, Breed.GOLDEN_RETRIEVER, (byte) 2, Gender.MALE, Colour.BLACK, 1.2, "1124312515");
        Veterinary.petAdd(pet);

        assertTrue(Veterinary.getPets().contains(pet));
        assertEquals(1, Veterinary.getPets().size());

        LOG.info("Finishing add pet");
    }

    /**
     * Test to verify that the data of a course is not null
     */
    @Test
    public void nullData() {
        LOG.info("Iniciating for null data");
        assertThrows(Throwable.class, () -> new Veterinary(null));
        LOG.info("Finishing for null data");
    }

    /**
     * Test to verify that the id is not repeated.
     */
    @Test
    public void petAddRepeat() {
        LOG.info("Iniciating test for pet add repeat");

        Veterinary veterinary = new Veterinary("Huellitas");
        Pets pet1 = new Pets("Francisco", Species.DOG, Breed.GOLDEN_RETRIEVER, (byte) 3, Gender.MALE, Colour.BLACK, 1.2, "1124312515");
        Pets pet2 = new Pets("Manchas", Species.DOG, Breed.GOLDEN_RETRIEVER, (byte) 6, Gender.MALE, Colour.BLACK, 1.6, "1124312515");

        veterinary.agregarEstudiante(pet1);
        assertThrows(Throwable.class, () -> veterinary.agregarEstudiante(pet2));

        LOG.info("Finishing test for pet add repeat");
    }

    /**
     * Test to verify obtaining an alphabetical listing
     */
    @Test
    public void getAlphabeticalListing() {
        LOG.info("Inicio obtenerListadoAlfabetico");

        Veterinary veterinary = new Veterinary("Huellitas");

        Pets francisco = new Pets("Francisco", Species.DOG, Breed.GOLDEN_RETRIEVER, (byte) 3, Gender.MALE, Colour.BLACK, 1.2, "1124312515");
        Pets manchas = new Pets("Manchas", Species.DOG, Breed.GOLDEN_RETRIEVER, (byte) 6, Gender.MALE, Colour.BLACK, 1.6, "1124312516");
        Pets tobby = new Pets("Tobby", Species.DOG, Breed.GERMAN_SHEPHERD, (byte) 7, Gender.MALE, Colour.WHITE, 1.7, "1124312517");
        Pets vartolo = new Pets("Vartolo", Species.DOG, Breed.GOLDEN_RETRIEVER, (byte) 2, Gender.MALE, Colour.BLACK, 1.5, "1124312518");

        curso.agregarEstudiante(francisco);
        curso.agregarEstudiante(manchas);
        curso.agregarEstudiante(tobby);
        curso.agregarEstudiante(vartolo);

        Collection<Pets> waitList = List.of(francisco, manchas, tobby, vartolo);

        assertIterableEquals(waitList, veterinary.getAlphabeticalListing());

        LOG.info("Finishing test for get alphabetic listing");
    }

    /**
     * Test to verify to obtain a list by age in descending order
     */
    @Test
    public void obtenerListadoEdadDescente() {
        LOG.info("Inicio obtenerListadoEdadDescente");

        Veterinary veterinary = new Veterinary("Huellitas");

        Pets francisco = new Pets("Francisco", Species.DOG, Breed.GOLDEN_RETRIEVER, (byte) 3, Gender.MALE, Colour.BLACK, 1.2, "1124312515");
        Pets manchas = new Pets("Manchas", Species.DOG, Breed.GOLDEN_RETRIEVER, (byte) 6, Gender.MALE, Colour.BLACK, 1.6, "1124312516");
        Pets tobby = new Pets("Tobby", Species.DOG, Breed.GERMAN_SHEPHERD, (byte) 7, Gender.MALE, Colour.WHITE, 1.7, "1124312517");
        Pets vartolo = new Pets("Vartolo", Species.DOG, Breed.GOLDEN_RETRIEVER, (byte) 2, Gender.MALE, Colour.BLACK, 1.5, "1124312518");


        curso.agregarEstudiante(francisco);
        curso.agregarEstudiante(manchas);
        curso.agregarEstudiante(tobby);
        curso.agregarEstudiante(vartolo);

        var waitList = List.of(tobby, manchas, francisco, vartolo);

        assertIterableEquals(waitList, veterinary.obtainDescendingAgeList());

        LOG.info("Finishing test for obtain Descending Age List");
    }

    /**
     * Test to verify obtaining a list of minors
     */
    @Test
    public void obtainUnderageList() {
        LOG.info("Inicio obtenerListadoMenoresEdad");

        Veterinary veterinary = new Veterinary("Huellitas");

        Pets francisco = new Pets("Francisco", Species.DOG, Breed.GOLDEN_RETRIEVER, (byte) 3, Gender.MALE, Colour.BLACK, 1.2, "1124312515");
        Pets manchas = new Pets("Manchas", Species.DOG, Breed.GOLDEN_RETRIEVER, (byte) 6, Gender.MALE, Colour.BLACK, 1.6, "1124312516");
        Pets tobby = new Pets("Tobby", Species.DOG, Breed.GERMAN_SHEPHERD, (byte) 7, Gender.MALE, Colour.WHITE, 1.7, "1124312517");
        Pets vartolo = new Pets("Vartolo", Species.DOG, Breed.GOLDEN_RETRIEVER, (byte) 2, Gender.MALE, Colour.BLACK, 1.5, "1124312518");


        curso.agregarEstudiante(francisco);
        curso.agregarEstudiante(manchas);
        curso.agregarEstudiante(tobby);
        curso.agregarEstudiante(vartolo);

        Collection<Pets> waitList = List.of(francisco, vartolo);

        assertIterableEquals(waitList, veterinary.obtainUnderageList());

        LOG.info("Finishing test for obtain Underage List");
    }
}

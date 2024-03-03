/**
 * Clase para probar el funcionamiento del código
 * @author Jhonatan David Vivas Arango, Valery Andrea Ortiz Mesa, Nicol Dayana Marín Moreno
 * @since 2024-02
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        assertTrue(true);
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }


    @Test
    public void completeInformation(){
        LOG.info("Iniciating test for complete information");
        Pets pet = new Pets("Manchas", Species.DOG, Breed.GOLDEN_RETRIEVER, (byte)1, Gender.MALE, Colour.BLACK, 1.2);
        assertEquals(pet.name(), "Manchas");
        assertEquals(pet.species(), Species.DOG);
        assertEquals(pet.breed(), Breed.GOLDEN_RETRIEVER);
        assertEquals(pet.age(), (byte)1);
        assertEquals(pet.gender(), Gender.MALE);
        assertEquals(pet.colour(), Colour.BLACK);
        assertEquals(pet.weight(), 1.2);
        LOG.info("Finishing test for complete information");
    }

    @Test
    public void nullData(){
        LOG.info("Iniciating test for null data");
        assertThrows(Throwable.class, () -> new Pets(null, null, null, (byte)0, null, null, 0));
        LOG.info("Finishing test for null data");
    }

    @Test
    public void negativeAge(){
        LOG.info("Iniciating test for negative age");
        assertThrows(Throwable.class, () -> new Pets("Manchas", Species.DOG, Breed.GOLDEN_RETRIEVER, (byte)-1, Gender.MALE, Colour.BLACK, 3.4));
        LOG.info("Finishing test for negative age");
    }

    @Test
    public void negativeWeight(){
        LOG.info("Iniciating test for negative weight");
        assertThrows(Throwable.class, () -> new Pets("Manchas", Species.DOG, Breed.GOLDEN_RETRIEVER, (byte)1, Gender.MALE, Colour.BLACK, -3.4));
        LOG.info("Finishing test for negative weight");
    }

}

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private String cadena;

    @BeforeEach
    void setUp() {
        cadena = "Prueba";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testHacerCadaLetraMinuscula() {
        String resultado = Main.hacerCadaLetraMinuscula("CARLOSPE");
        assertEquals("carlospe", resultado);
    }

    @Test
    void testHacerCadaLetraMinusculaConCadenaYaEnMinusculas() {
        String resultado = Main.hacerCadaLetraMinuscula("que no me dé error");
        assertEquals("que no me dé error", resultado);
    }

    @Test
    void hacerCadenaIdonea() {
        String cadenaOriginal = "Mi numero es 8745335";

        String resultado = Main.HacerCadenaIdonea(cadenaOriginal);

        assertEquals("minumeroes", resultado);
    }

    @Test
    void esPalindromo() {
        String palindromo = "lateleletal";

        boolean resultado = Main.esPalindromo(palindromo);

        assertTrue(resultado);
    }

    @Test
    void ingresarcadena() {
        String entradaUsuario = "Hola Carlos";
        InputStream entradaSimulada = new ByteArrayInputStream(entradaUsuario.getBytes());
        System.setIn(entradaSimulada);

        String resultado = Main.Ingresarcadena();

        assertEquals(entradaUsuario, resultado);
    }
}
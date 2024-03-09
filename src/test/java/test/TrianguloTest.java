package test;

import ejercicios.Triangulo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class TrianguloTest {
    @Test
    public void testNoEsUnTrianguloValido() {
        String valorEsperado = "No es un triángulo válido";
        String valorActual = Triangulo.evaluar(3.9, 6.0, 1.2);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testNoEsUnTrianguloEquilatero() {
        String valorEsperado = "El triángulo es equilátero";
        String valorActual = Triangulo.evaluar(4, 4, 4);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testNoEsUnTrianguloIsóceles() {
        String valorEsperado = "El triángulo es isósceles";
        String valorActual = Triangulo.evaluar(2, 1.9, 2);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testNoEsUnTrianguloEscaleno() {
        String valorEsperado = "El triángulo es escaleno";
        String valorActual = Triangulo.evaluar(3.0, 5.0, 4.0);
        assertEquals(valorEsperado, valorActual);
    }
}

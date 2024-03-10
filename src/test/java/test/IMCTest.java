package test;

import ejercicios.IMC;
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
public class IMCTest {
    @Test
    public void testBajo() {
        String valorEsperado = "bajo";
        String valorActual = IMC.evaluar(50, 1.8,   20);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testMedio() {
        String valorEsperado = "medio";
        String valorActual = IMC.evaluar(70, 1.7,   25);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testMedio1() {
        String valorEsperado = "medio";
        String valorActual = IMC.evaluar(55, 1.75,   45);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testAlto() {
        String valorEsperado = "alto";
        String valorActual = IMC.evaluar(90, 1.72,   45);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testError() {
        String valorEsperado = "Error";
        String valorActual = IMC.evaluar(70, 1.7,   -25);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testError1() {
        String valorEsperado = "Error";
        String valorActual = IMC.evaluar(-70, 1.7,   25);
        assertEquals(valorEsperado, valorActual);
    }
}

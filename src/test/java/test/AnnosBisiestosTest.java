package test;

import ejercicios.AnnosBisiestos;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AnnosBisiestosTest {
    @Test
    public void test1988() {
        String valorEsperado = "1988 es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(1988);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void test2011() {
        String valorEsperado = "2011 no es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(2011);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void test1700() {
        String valorEsperado = "1700 no es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(1700);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void test1500() {
        String valorEsperado = "1500 no es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(1500);
        assertEquals(valorEsperado, valorActual);
    }
     @Test
    public void test2400() {
        String valorEsperado = "2400 es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(2400);
        assertEquals(valorEsperado, valorActual);
    }
}

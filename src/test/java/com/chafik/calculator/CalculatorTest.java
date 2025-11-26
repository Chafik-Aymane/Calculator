package com.chafik.calculator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calc = null;
    }
    
    @Test
    void add_devrait_calculer_la_somme_de_deux_int(){
        int resultat = 15;
        int actuel = calc.add(9,6);

        assertEquals(resultat, actuel, "6+9 devrait etre egal a 15");
    }

    @Test
    void divide_devrait_calculer_la_division_d_int_par_int(){
        int resultat = 5;
        int actuel = calc.divide(10,2);

        assertEquals(resultat, actuel, "10/2 devrait etre egal a 5");
    }
}
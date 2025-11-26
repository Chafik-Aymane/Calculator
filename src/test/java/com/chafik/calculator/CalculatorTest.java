package com.chafik.calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    //Calculator calc;

    @BeforeEach
    void setUp() {
        //calc = new Calculator();
    }

    @AfterEach
    void tearDown() {
        //calc = null;
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "-2, 2, 0",
            "0, 0, 0",
            "-1, -2, -3"
    })
    void add_devrait_calculer_la_somme_de_deux_int(int opG,int opD, int resultatAttendu){
        int actuel = Calculator.add(opG,opD);
        assertEquals(resultatAttendu, actuel,
                String.format("L'addition de %d + %d devrait etre %d",opG,opD,resultatAttendu));
    }
    
    void divide_devrait_calculer_la_division_d_int_par_int(){
        int resultat = 5;
        int actuel = Calculator.divide(10,2);

        assertEquals(resultat, actuel, "10/2 devrait etre egal a 5");
    }
}
package com.sheridan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ice3ArsalanSalamTest {
     @Test
    public void testCalculatorAddition(){
        ice3ArsalanSalam newCalc = new ice3ArsalanSalam(14, 0);
        newCalc.addition(25);
        assertEquals(39, newCalc.getTotal());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vuelo;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author dam
 */
@RunWith(Parameterized.class)
public class VueloTest {

    int numPlazasTuristas;
    int numPlazasBusines;
    int numPlazasOcupadasTuristas;
    int numPlazasOcupadasBusines;
    boolean posible;
     Vuelo instance;

    public VueloTest(int numPlazasTuristas, int numPlazasBusines, int numPlazasOcupadasTuristas, int numPlazasOcupadasBusines, boolean posible) {
        this.numPlazasTuristas = numPlazasTuristas;
        this.numPlazasBusines = numPlazasBusines;
        this.numPlazasOcupadasTuristas = numPlazasOcupadasTuristas;
        this.numPlazasOcupadasBusines = numPlazasOcupadasBusines;
        this.posible = posible;
    }
@Parameters
public static Collection<Object[]> casosPrueba() {
     return Arrays.asList(
    new Object[][]{
        {100,120,30,20,true},
        {30, 150, 40, 20,true}
    });
}
    @Test
    public void testVentaDeBilletes() {
        System.out.println("ventaDeBilletes");
        int numeroBilletes=100;
        int tipoPlaza=1;
        boolean result = instance.ventaDeBilletes(numeroBilletes, tipoPlaza);
        assertEquals("No se puede realizar la reserva", posible, result);

    }
}

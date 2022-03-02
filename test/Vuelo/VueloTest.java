package Vuelo;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class VueloTest {
//TANTAS PROPIEDADES COMO VALORES HAY QUE COMPROBAR
    //PLAZAS TOTALES
    int numPlazasTuristas;
    int numPlazasBusines;
    //PLAZAS OCUPADAS
    int numPlazasOcupadasTuristas;
    int numPlazasOcupadasBusines;
    //NUMERO DE PLAZAS OCUPADAS DESPUES DE OCUPAR
    int numPlazasOcupadasTuristasDespues;
    int numPlazasOcupadasBusinesDespues;
    /*NUMERO DE PLAZAS QUE VAS A DAR(NUMERO DE TICKET),TIPO DE PLAZA ES EL TIPO DE PLAZA
    EL RESULTADO DUDA NO SE LO QUE ES EXACTAMENTE*/
    int numeroPlazas;
    int tipoPlaza;
    int resultado;
    
    boolean posible;
    Vuelo instance;

    /**
     * EN LAS PRUEBAS PARAMETRIZADAS SOLO PUEDE HABER UN CONSTRUCTOR
     */
    public VueloTest(int numPlazasTuristas, int numPlazasBusines, int numPlazasOcupadasTuristas, int numPlazasOcupadasBusines, int numPlazasOcupadasTuristasDespues, int numPlazasOcupadasBusinesDespues, int numeroPlazas, int tipoPlaza, int resultado, boolean posible) {
        this.numPlazasTuristas = numPlazasTuristas;
        this.numPlazasBusines = numPlazasBusines;
        this.numPlazasOcupadasTuristas = numPlazasOcupadasTuristas;
        this.numPlazasOcupadasBusines = numPlazasOcupadasBusines;
        this.numPlazasOcupadasTuristasDespues = numPlazasOcupadasTuristasDespues;
        this.numPlazasOcupadasBusinesDespues = numPlazasOcupadasBusinesDespues;
        this.numeroPlazas = numeroPlazas;
        this.tipoPlaza = tipoPlaza;
        this.resultado = resultado;
        this.posible = posible;
    }
    /**
     * CASOS A CREAR: 4-->UNO POSBLE Y OTRO QUE NO TE DEJE PARA LAS PLAZAS
     * TURSTAS Y LAS PLAZAS BUSINESS.
     */
    @Parameters
    public static Collection<Object[]> casosPrueba() {
        return Arrays.asList(
                new Object[][]{
                    {20, 5, 30, 20, true},
                    {25, 6, 40, 20, true}
                });
    }

    /**
     * METODO DE PRUEBAS PARAMETRIZAADAS
     */
    @Test
    public void testVentaDeBilletes() {
        System.out.println("ventaDeBilletes");
        int numeroBilletes = 100;
        int tipoPlaza = 1;
        boolean result = instance.ventaDeBilletes(numeroBilletes, tipoPlaza);
        assertEquals("No se puede realizar la reserva", posible, result);

    }

    /**
     * METODO DE PRUEBAS SIN PARAMETRIZAR SI DA UN ERROR EN UN EQUALS NO SIGUE
     * MIRANDO EL RESTO DE EQUALS.
     */
    @Test
    public void testVentaDeBilletesNoPara() {
        System.out.println("ventaDeBilletes");
        int numeroBilletes = 10;
        int tipoPlaza = 1;
        Vuelo instance = new Vuelo(20, 5, 30, 20);
        boolean expResult = true;
        boolean result = instance.ventaDeBilletes(numeroBilletes, tipoPlaza);
        assertEquals("Error al actulizar plazas turistas", instance.getNumPlazasOcupadasTuristas(), 15);
        assertEquals("Error al actualizar plazas business", instance.getNumPlazasOcupadasBusines(), 20);
        assertEquals("No se puede realizar la reserva", expResult, result);

    }
}

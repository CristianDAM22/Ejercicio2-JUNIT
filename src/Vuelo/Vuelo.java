package Vuelo;

public class Vuelo {

    private int numVuelo;
    private String nombre;
    private int numPlazasTuristas;
    private int numPlazasBusines;
    private int numPlazasOcupadasTuristas;
    private int numPlazasOcupadasBusines;

    public Vuelo(int numPlazasTuristas, int numPlazasBusines, int numPlazasOcupadasTuristas, int numPlazasOcupadasBusines) {
        this.numPlazasTuristas = numPlazasTuristas;
        this.numPlazasBusines = numPlazasBusines;
        this.numPlazasOcupadasTuristas = numPlazasOcupadasTuristas;
        this.numPlazasOcupadasBusines = numPlazasOcupadasBusines;
    }

    public boolean ventaDeBilletes(int numerodeBilletes, int tipoPlaza) {
        boolean vendido = false;

        /*LOS IF LOS PUDES HACER CON UN SWITCH
        SWITCH(TIPOPLAZA){
        CASE 1:
             if (numerodeBilletes <= (numPlazasTuristas - numPlazasOcupadasTuristas)) {
                numPlazasOcupadasTuristas = numPlazasOcupadasTuristas + numerodeBilletes;
                vendido = true;
        }        
        BREAK;
        CASE 2:
            If (numerodeBilletes <= (numPlazasBusines - numPlazasOcupadasBusines)) {
                numPlazasOcupadasBusines = numPlazasOcupadasBusines + numerodeBilletes;
                vendido = true;
            }
        BREAK;
          }
         */
        
        if (tipoPlaza == 1) {
            if (numerodeBilletes <= (numPlazasTuristas - numPlazasOcupadasTuristas)) {
                numPlazasOcupadasTuristas = numPlazasOcupadasTuristas + numerodeBilletes;
                vendido = true;

            }
        } else if (tipoPlaza == 2) {
            if (numerodeBilletes <= (numPlazasBusines - numPlazasOcupadasBusines)) {
                numPlazasOcupadasBusines = numPlazasOcupadasBusines + numerodeBilletes;
                vendido = true;
            }
        }

        return vendido;

    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumPlazasBusines() {
        return numPlazasBusines;
    }

    public int getNumPlazasOcupadasBusines() {
        return numPlazasOcupadasBusines;
    }

    public int getNumPlazasTuristas() {
        return numPlazasTuristas;
    }

    public int getNumPlazasOcupadasTuristas() {
        return numPlazasOcupadasTuristas;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.vehiculos;

/**
 *
 * @author user
 */
public class SistemaDeVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear instancias de Automovil y Bicicleta
        Automovil auto = new Automovil("Ferrari MIX", 4);
        Bicicleta bicicleta = new Bicicleta("Bici Alaska");

        // Acelerar y frenar el automóvil
        auto.acelerar(60);
        auto.frenar();

        // Acelerar y frenar la bicicleta
        bicicleta.acelerar(20);
        bicicleta.frenar();
    }
    
}

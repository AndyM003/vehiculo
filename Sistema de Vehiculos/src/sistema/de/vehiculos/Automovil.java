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
// Clase Automovil que hereda de la clase base Vehiculo
class Automovil extends Vehiculo {
    private int cantidadMaximaPasajeros;

    public Automovil(String nombre, int cantidadMaximaPasajeros) {
        super(nombre);
        this.cantidadMaximaPasajeros = cantidadMaximaPasajeros;
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println("El automóvil " + getNombre() + " está acelerando con " + velocidad + " km/h.");
    }

    @Override
    public void frenar() {
        System.out.println("El automóvil " + getNombre() + " está frenando.");
    }

    public int getCantidadMaximaPasajeros() {
        return cantidadMaximaPasajeros;
    }
}

// Clase Bicicleta que hereda de la clase base Vehiculo
class Bicicleta extends Vehiculo {
    public Bicicleta(String nombre) {
        super(nombre);
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println("La bicicleta " + getNombre() + " está acelerando con " + velocidad + " km/h.");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta " + getNombre() + " está frenando.");
    }
}

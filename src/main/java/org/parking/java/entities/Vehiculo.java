package org.parking.java.entities;

public class Vehiculo {

    //lOS ATRIBUTOS DE UNA CLASE
    // PARA CUMPLIR CON ENCAPSULAMIENTO
    //DEBEN SER PRIVADOS(private)

    private String placa;
    private TipoVehiculo tipoVehiculo;

    //constructor
    //Sin parametros: constructor por defecto
    public Vehiculo() {
    }

    //constructor parametrizado
    public Vehiculo(String placa,
                   TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    
        
    

}

package org.parking.java;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.Cupo;
import org.parking.java.entities.Empleado;
import org.parking.java.entities.Pago;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class Main {
    @SuppressWarnings("")
    public static void main(String[] args) {
       //Sistema de gestion de E/S
       //de un vehiculo
       
       Vehiculo carrito1 = new Vehiculo("ASD 789", TipoVehiculo.PARTICULAR);

       Vehiculo carrito2 = new Vehiculo("ASD 143", TipoVehiculo.TAXI);

       Vehiculo motico = new Vehiculo();
       motico.setPlaca("XSA 141");
       motico.setTipoVehiculo(TipoVehiculo.MOTO);

       //crear(instanciar) un cliente 

       Cliente cliente1 = new Cliente("Steven", "Lopez", 1019604419L);
       
       Empleado empleado1 = new Empleado("David", "Vergara",131414);

       //Invocar  el metodo addCar
        cliente1.addVehicle(carrito1);
        cliente1.addVehicle(carrito2);
        cliente1.addVehicle("WWW ERT", TipoVehiculo.MOTO);

        //Recoger la lista de  vehiculos del cliente
        for(Vehiculo v :cliente1.getMisVehiculos()){
            System.out.println(v.getPlaca());
            System.out.println(v.getTipoVehiculo());
            System.out.println("---------");
        }
       
        //System.out.println(cliente1.setNombres("Michael Steven"));
        cliente1.setNombres("Michael Steven");
            System.out.println("Nombres actualizados correctamente.");


        //Instanciar cupos:

        Cupo cupito1 = new Cupo('A');
        Cupo cupito2 = new Cupo('B');

        

        //Crear fechas

        LocalDateTime fechaHoraInicio = LocalDateTime.of(2024, Month.FEBRUARY, 1, 15, 30, 0);

        LocalDateTime fechaHoraFin = LocalDateTime.of(2024, Month.FEBRUARY, 10, 6, 15, 5);


        //Hacer registros (pagos)

        Pago pago1 = new Pago(fechaHoraInicio , 
                              fechaHoraFin , 
                              5000.0 , cliente1.getMisVehiculos().get(0) , 
                              cupito1,empleado1 );

        Pago pago2 = new Pago(fechaHoraInicio , 
                              fechaHoraFin , 
                              10000.0 , cliente1.getMisVehiculos().get(0) , 
                              cupito2,  empleado1 );    
                              
     //Añadir a lista de pagos
        List<Pago>misPagos = new ArrayList<Pago>();
        misPagos.add(pago1);

        misPagos.add(pago2);

        //recprrer los pagos para mostrar informacion
        for( Pago p  :misPagos){
            //evidencia:
            //mostrar:
            //  -placa del vehiculo
            //  -valor pagado
            //  -fecha y hora de inicio
            //  -Fecha y hora de fin
            //  -cupo(nombre)
            System.out.println("Pago: |Placa:"+ p.getVehiculo().getPlaca()  + "|" +
                "|valor" + p.getValor() + "|" +
            "|fecha y hora entrada:" + 
                p.getFechaInicio().toString() + "|" +

            "|Cupo:" + p.getCupo().getNombre() + "|" +
                "|Empleados:" + p.getEmpleado().getCodigo() + "|");
        }
    }
    
}



    

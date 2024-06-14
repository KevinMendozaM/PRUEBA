package BUS;

public class Main {
    public static void main(String[] args) {

        TICKET miTicket = new TICKET(123);


        int numeroTicket = miTicket.getNumero();
        System.out.println("Número de ticket: " + numeroTicket);


        miTicket.setNumero(456);
        System.out.println("Nuevo número de ticket: " + miTicket.getNumero());


        NORMAL miAsiento = new NORMAL(true, false, true, false, true, false);

        System.out.println("Ventana: " + miAsiento.getVentana());
        System.out.println("Pasillo: " + miAsiento.getPasillo());
        System.out.println("Adelante: " + miAsiento.getAdelante());
        System.out.println("Atrás: " + miAsiento.getAtras());
        System.out.println("Equipaje: " + miAsiento.getEquipaje());
        System.out.println("Equipaje extra: " + miAsiento.getEquipaje_extra());

        INF_RUTAS miRuta = new INF_RUTAS("QUITO - GUAYAQUIL");


        String rutaViaje = miRuta.getRutas();
        System.out.println("Ruta del viaje: " + rutaViaje);

        SERVICIO miServicio = new SERVICIO("Servicio VIP");

        String infoServicio = miServicio.getInf();
        System.out.println("Información del servicio: " + infoServicio);

        INF_PASAJERO pasajero1 = new INF_PASAJERO(1, "Juan", "Pérez", 12345678);

        pasajero1.println();
    }

}




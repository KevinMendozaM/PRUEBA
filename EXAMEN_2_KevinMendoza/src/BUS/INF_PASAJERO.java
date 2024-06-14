package BUS;

public class INF_PASAJERO {
    private int numero_pasajeros;
    private String nombre_pasajero;
    private String apellido_pasajero;
    private int cedula_pasajero;

    public INF_PASAJERO() {

    }

    public INF_PASAJERO(int numero_pasajeros, String nombre_pasajero, String apellido_pasajero, int cedula_pasajero) {
        this.numero_pasajeros = numero_pasajeros;
        this.nombre_pasajero = nombre_pasajero;
        this.apellido_pasajero = apellido_pasajero;
        this.cedula_pasajero = cedula_pasajero;
    }

    public int getNumero_pasajeros() {
        return numero_pasajeros;
    }

    public String getNombre_pasajero() {
        return nombre_pasajero;
    }

    public String getApellido_pasajero() {
        return apellido_pasajero;
    }

    public int getCedula_pasajero() {
        return cedula_pasajero;
    }

    public void setNumero_pasajeros(int numero_pasajeros) {
        this.numero_pasajeros = numero_pasajeros;
    }

    public void setNombre_pasajero(String nombre_pasajero) {
        this.nombre_pasajero = nombre_pasajero;
    }

    public void setApellido_pasajero(String apellido_pasajero) {
        this.apellido_pasajero = apellido_pasajero;
    }

    public void setCedula_pasajero(int cedula_pasajero) {
        this.cedula_pasajero = cedula_pasajero;
    }

    public void println(){
        System.out.println("Numero de pasajero: " + this.numero_pasajeros);
        System.out.println("Nombre de pasajero: " + this.nombre_pasajero);
        System.out.println("Apellido de pasajero: " + this.apellido_pasajero);
        System.out.println("Cedula de pasajero: " + this.cedula_pasajero);

    }
}

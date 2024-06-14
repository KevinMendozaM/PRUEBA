package BUS;

public class TICKET
{
    private int numero;

    public TICKET() {

    }

    public TICKET(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void imprimirinformacion() {
        System.out.println("Numero de ticket: " + this.numero);
    }
}




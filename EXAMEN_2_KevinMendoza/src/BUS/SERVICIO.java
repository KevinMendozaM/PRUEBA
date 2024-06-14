package BUS;

public class SERVICIO {
    private String inf;

    public SERVICIO() {

    }

    public SERVICIO(String inf) {
        this.inf = inf;
    }

    public String getInf() {
        return inf;
    }

    public void setInf(String inf) {
        this.inf = inf;
    }
    public void println() {
        System.out.println( "Informacion del viaje: " + this.inf);
    }
}

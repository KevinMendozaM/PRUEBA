package BUS;

public class INF_RUTAS {
    private String rutas;

    public INF_RUTAS() {

    }

    public INF_RUTAS(String rutas) {
        this.rutas = rutas;
    }

    public String getRutas() {
        return rutas;
    }

    public void setRutas(String rutas) {
        this.rutas = rutas;
    }
    public void println() {
        System.out.println("A donde desea viajar: " + this.rutas);
    }
}

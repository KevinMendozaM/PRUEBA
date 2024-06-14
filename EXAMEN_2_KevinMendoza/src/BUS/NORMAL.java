package BUS;

public class NORMAL {
    private Boolean ventana;
    private Boolean pasillo;
    private Boolean adelante;
    private Boolean atras;
    private Boolean equipaje;
    private Boolean equipaje_extra;

    public NORMAL() {
    }

    public NORMAL(Boolean ventana, Boolean pasillo, Boolean adelante, Boolean atras, Boolean equipaje, Boolean equipaje_extra) {
        this.ventana = ventana;
        this.pasillo = pasillo;
        this.adelante = adelante;
        this.atras = atras;
        this.equipaje = equipaje;
        this.equipaje_extra = equipaje_extra;
    }

    public Boolean getVentana() {
        return ventana;
    }

    public Boolean getPasillo() {
        return pasillo;
    }

    public Boolean getAdelante() {
        return adelante;
    }

    public Boolean getAtras() {
        return atras;
    }

    public Boolean getEquipaje() {
        return equipaje;
    }

    public Boolean getEquipaje_extra() {
        return equipaje_extra;
    }

    public void setVentana(Boolean ventana) {
        this.ventana = ventana;
    }

    public void setPasillo(Boolean pasillo) {
        this.pasillo = pasillo;
    }

    public void setAdelante(Boolean adelante) {
        this.adelante = adelante;
    }

    public void setAtras(Boolean atras) {
        this.atras = atras;
    }

    public void setEquipaje(Boolean equipaje) {
        this.equipaje = equipaje;
    }

    public void setEquipaje_extra(Boolean equipaje_extra) {
        this.equipaje_extra = equipaje_extra;
    }

    public void println(){
        System.out.println("Asiento con ventana: " + this.ventana);
        System.out.println("Asiento al pasillo: " + this.pasillo);
        System.out.println("Asiento adelante: " + this.adelante);
        System.out.println("Asiento atras: " + this.atras);
        System.out.println("Lleva quipaje: " + this.equipaje);
        System.out.println("Lleva equipaje_extra: " + this.equipaje_extra);

    }

}

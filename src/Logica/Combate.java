package Logica;

public class Combate extends Avion {

    private boolean esFurtivo;

    public Combate(boolean esFurtivo, int idAvion, String modAvion, int capAvion, String Piloto) {
        super(idAvion, modAvion, capAvion, Piloto);
        this.esFurtivo = esFurtivo;
    }

    public boolean isEsFurtivo() {
        return esFurtivo;
    }

    public void setEsFurtivo(boolean esFurtivo) {
        this.esFurtivo = esFurtivo;
    }

}

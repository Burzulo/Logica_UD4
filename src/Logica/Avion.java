package Logica;

public class Avion {

    int idAvion;
    String modAvion;
    int capAvion;
    String Piloto;

    public Avion(int idAvion, String modAvion, int capAvion, String Piloto) {
        this.idAvion = idAvion;
        this.modAvion = modAvion;
        this.capAvion = capAvion;
        this.Piloto = Piloto;
    }

    public Avion() {
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public String getModAvion() {
        return modAvion;
    }

    public void setModAvion(String modAvion) {
        this.modAvion = modAvion;
    }

    public int getCapAvion() {
        return capAvion;
    }

    public void setCapAvion(int capAvion) {
        this.capAvion = capAvion;
    }

    public String getPiloto() {
        return Piloto;
    }

    public void setPiloto(String Piloto) {
        this.Piloto = Piloto;
    }

    // METODO
    public void mostrarAvion() {
        System.out.println("ID:" + this.idAvion + ", Modelo: " + this.modAvion + ", Capacidad: " + this.capAvion + ", Piloto: " + this.Piloto);
    }

}

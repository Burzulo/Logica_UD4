package Logica;

public class Piloto {

    // ATRIBUTOS
    int idPiloto;
    String nomPiloto;
    double horasVueloPiloto;
    String rangoPiloto;

    // CONSTRUCTORES
    public Piloto(int idPiloto, String nomPiloto, double horasVueloPiloto, String rangoPiloto) {
        this.idPiloto = idPiloto;
        this.nomPiloto = nomPiloto;
        this.horasVueloPiloto = horasVueloPiloto;
        this.rangoPiloto = rangoPiloto;
    }

    public Piloto() {
    }

    public int getIdPiloto() {
        return idPiloto;
    }

    public void setIdPiloto(int idPiloto) {
        this.idPiloto = idPiloto;
    }

    public String getNomPiloto() {
        return nomPiloto;
    }

    public void setNomPiloto(String nomPiloto) {
        this.nomPiloto = nomPiloto;
    }

    public double getHorasVueloPiloto() {
        return horasVueloPiloto;
    }

    public void setHorasVueloPiloto(double horasVueloPiloto) {
        this.horasVueloPiloto = horasVueloPiloto;
    }

    public String getRangoPiloto() {
        return rangoPiloto;
    }

    public void setRangoPiloto(String rangoPiloto) {
        this.rangoPiloto = rangoPiloto;
    }

    // METODOS
    public void mostrarPiloto() {
        System.out.println("id:" + this.idPiloto + ", Nombre: " + this.nomPiloto + ", Hs de vuelo: " + this.horasVueloPiloto + ", Rango: " + this.rangoPiloto);
    }

}

package Logica;

public class Entrenamiento extends Avion {

    private boolean tieneDobleMando;

    public Entrenamiento(boolean tieneDobleMando, int idAvion, String modAvion, int capAvion, String Piloto) {
        super(idAvion, modAvion, capAvion, Piloto);
        this.tieneDobleMando = tieneDobleMando;
    }

    public boolean isTieneDobleMando() {
        return tieneDobleMando;
    }

    public void setTieneDobleMando(boolean tieneDobleMando) {
        this.tieneDobleMando = tieneDobleMando;
    }

    
}

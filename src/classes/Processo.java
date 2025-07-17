package classes;

import java.util.ArrayList;
import java.util.List;

public class Processo {


    private List<Personagem> margemD = new ArrayList<>();
    private List<Personagem> margemE = new ArrayList<>();
    private List<Personagem> barco = new ArrayList<>();


    public Processo() {
        margemE.add(new Lobo());
        margemE.add(new Ovelha());
        margemE.add(new Repolho());
        margemE.add(new Pastor());
    }

    boolean esquerda = true;

    public void Embarcacao(int op) {

        List<Personagem> inicioTravessia;
        if (esquerda) {
            inicioTravessia = margemE;
        } else {
            inicioTravessia = margemD;
        }
    }
}

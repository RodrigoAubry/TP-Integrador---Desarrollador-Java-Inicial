public class Ronda {

    //Atributos

    private int nroRonda;
    private Partido partidos[];

    //Constructor

    public Ronda() {
        this.nroRonda++;
    }

    //Metodos

    public void setPartidos(Partido[] partidos) {
        this.partidos = partidos;
    }

    public int puntosTotales(Pronostico pron){
        pron.calcularPuntos();
        return pron.getPuntos();
    }
}

package problema2;

public class Tir extends Vehicul{
    private int incarcatura_maxima;

    public Tir(String marca, double pret, int incarcatura_maxima) {
        super(marca, pret);
        this.incarcatura_maxima = incarcatura_maxima;
    }

    public Tir() {}
}

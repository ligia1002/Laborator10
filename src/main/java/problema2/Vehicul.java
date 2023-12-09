package problema2;

public class Vehicul {
    private String marca;
    private double pret;

    public Vehicul() {}

    public Vehicul(String marca, double pret) {
        this.marca = marca;
        this.pret = pret;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Vehicul{ " +
                "marca= '" + marca + '\'' +
                ", pret= " + pret +
                '}';
    }

}

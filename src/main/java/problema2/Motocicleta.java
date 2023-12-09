package problema2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motocicleta extends Vehicul implements InitializingBean, DisposableBean {
    private int viteza_maxima;

    public Motocicleta(String marca, double pret, int viteza_maxima) {
        super(marca, pret);
        this.viteza_maxima = viteza_maxima;
    }

    public Motocicleta() {
    }

    public int getViteza_maxima() {
        return viteza_maxima;
    }

    public void setViteza_maxima(int viteza_maxima) {
        this.viteza_maxima = viteza_maxima;
    }

    @Override
    public String toString() {
        return super.toString() + "Motocicleta{" +
                "viteza_maxima=" + viteza_maxima +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean - afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean - destroy()");
    }
}


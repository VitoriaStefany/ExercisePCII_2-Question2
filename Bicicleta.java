
package transporte2;

public class Bicicleta {
    private String cor;
    private String marca;
    private float velocidade = 0;
    private int marcha = 0;
    private float velocidadeMaxima;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /*A bicicleta só vai até a quinta marcha.*/
    public void acelerar() {
        
        if (marcha < 5) {
            marcha++;
        }
        if (velocidade < velocidadeMaxima) {
            velocidade++;
        } else {
            System.out.println("Você já atingiu a velocidade máxima!");
        }
    }
    
    public void frear() {
        if (velocidade > 0) {
            velocidade--;
            marcha--;
        }
    }
        
    public String imprimirEstados() {
        if (velocidade == 0) {
            return "A bicicleta está parada!";
        }
        if (velocidade > 0) {
            return "A bicicleta está na "+marcha+"ª marcha."+" Com velocidade = "+velocidade+"."+" E a velocidade máxima é = "+velocidadeMaxima;
        }
        return null;
    }

    @Override
    public String toString() {
        return "A Bicicleta tem a " + "cor " + cor + ", da marca " + marca + ".";
    }

    public Bicicleta(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
}

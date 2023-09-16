
package transporte2;

public class Transporte2 {
    
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta(7);
        b1.setMarca("Caloi");
        b1.setCor("Branca");
        b1.acelerar();
        b1.acelerar();
        b1.acelerar();
        b1.acelerar();
        b1.acelerar();
        b1.acelerar();
        b1.acelerar();
        b1.acelerar();
        
        System.out.println(b1.toString());        
        System.out.println(b1.imprimirEstados());
    }
    
}

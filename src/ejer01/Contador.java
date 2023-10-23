
package ejer01;


public class Contador {
    private int contador = 0;

    public int getContador() {
        return contador;
    }

    public void incrementarContador(int idHilo) {

        for (int i = 0; i < 500; i++) {
            contador++;
            System.out.println("Hilo " + idHilo + " lleva " + (i + 1) + " vueltas.");
        }
        System.out.println("El hilo " + idHilo + " ha terminado");
    }
}

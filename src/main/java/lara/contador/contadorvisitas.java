
package lara.contador;

public class contadorvisitas {
    static int contador;

    public static int getContador() {
        contador++;
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}

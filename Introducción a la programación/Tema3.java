// Tema 3
public class Main {

    public static void main(String[] args) {
        int resultado;
        resultado = suma(20, 40, 60);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.PonerPuerta();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}


class Coche {
    public int puertas;

    public void PonerPuerta() {

        this.puertas++;
    }
}

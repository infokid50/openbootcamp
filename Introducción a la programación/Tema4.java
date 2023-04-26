public class Main {
    public static void main(String[] args) {
        // Muestra signo de un número
        int numeroIf = 10;

        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero"); // No hay otra posibilidad
        }

        // While con variable que aumenta
        int numeroWhile=0;
        while (numeroWhile<3){
            numeroWhile=numeroWhile+1;
            System.out.println("El número es:" + numeroWhile);
        }

        // DoWhile que se ejecute una vez
        int numeroDoWhile=0;
        do {
            numeroDoWhile=numeroDoWhile+1;
            System.out.println("El número dowhile es:" + numeroDoWhile);
        } while (numeroDoWhile<1);

        // Bucle FOR
        for (int numeroFor=0;numeroFor<=3;numeroFor++) {
            System.out.println("El valor del numeroFor es:" + numeroFor);
        }

        // Switch
        String estacion = "navidad"; //lleva a caso default
        switch (estacion){
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("El valor de estacion no es válido");
                break;
        }
        
    }
}

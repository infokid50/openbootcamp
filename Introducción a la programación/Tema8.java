public class main {

    public static void main(String [] args)

    // main
    {
        Persona persona=new Persona();

        persona.setNombre("Manolito");
        String nombre=persona.getNombre();
        System.out.println("Tu nombre es: "+nombre);

        persona.setEdad(27);
        int edad=persona.getEdad();
        System.out.println("Tienes "+edad +" años");

        persona.setTelefono(555444333);
        int telefono=persona.getTelefono();
        System.out.println("Tu teléfono es: "+telefono);



    } // fin del código

} // fin de la clase main

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter
    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;

    }
}







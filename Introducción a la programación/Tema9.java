public class Main {
    public static void main(String[] args) {
    Cliente cliente=new Cliente();
    cliente.setEdad(23);
    cliente.setNombre("Alfonso Gómez");
    cliente.setTelefono(111222333);
        System.out.println("Hola "+cliente.nombre+". Tienes "+cliente.edad+" años"+" y tu teléfono es "+cliente.telefono);
    cliente.setCredito(326.35);
        System.out.println("Tu crédito es de "+cliente.credito+"€");
    Trabajador trabajador=new Trabajador();
    trabajador.setEdad(51);
    trabajador.setNombre("Diego Álvarez");
    trabajador.setTelefono(444555666);
        System.out.println("Hola "+trabajador.nombre+". Tienes "+trabajador.edad+" años"+" y tu teléfono es "+trabajador.telefono);
    trabajador.setSalario(1999.99);
        System.out.println("Además, tu sueldo es de "+trabajador.salario+" €");

    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;

    public Persona(){
        // System.out.println("Estoy en el constructor de la clase Persona");
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    ///
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    ///
    public int getTelefono(){
        return this.telefono;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }

}

class Cliente extends Persona{

    double credito;
    public double getCredito(){
        return this.credito;
    }
    public void setCredito(double credito){
        this.credito=credito;
    }
}

class Trabajador extends Persona{
    double salario;
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }

}

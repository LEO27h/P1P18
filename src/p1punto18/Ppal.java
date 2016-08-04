
package p1punto18;


public class Ppal extends Direccion {
    
    public Ppal(String name, String Last_name, String Second_name) {
        super(name, Last_name, Second_name);
    }
    public static void main(String[] args) {
      Direccion dir = new Direccion(String name, String Last_name, String Second_name,String calle, String ciudad, String provincia, String codigo_postal, String nombre, String primer_apellido, String segundo_apellido);
      //Direccion dir = new Direccion();
      dir.Nueva_direccion();
    }
   
}

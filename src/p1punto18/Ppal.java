
package p1punto18;

import java.util.Scanner;


public class Ppal {
    
    //public Ppal(String name, String Last_name, String Second_name) {
      //  super(name, Last_name, Second_name);
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Direccion dir = new Direccion();
        
        //Direccion dir;
        //dir = new Direccion();
        //Direccion dir = new Direccion(String name, String Last_name, String Second_name, String street, String city, String dept, String postal);
        //Direccion dir = new Direccion();
        dir.Leer_nombre();
        dir.Mostrar_nombre();
        dir.Nueva_direccion();
        dir.Nueva_direccion();
        dir.Nuevo_nombre();
        dir.Mostrar();
    }
}

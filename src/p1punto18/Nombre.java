
package p1punto18;

import java.util.Scanner;



public class Nombre {
    //Atributos
    public String  nombre,primer_apellido,segundo_apellido;
    private Scanner lector;
    //Constructor
    Nombre(String name, String Last_name, String Second_name){
        nombre = name;
        primer_apellido = Last_name;
        segundo_apellido = Second_name;
    }
    //Métodos
    public void Leer_nombre(){
        lector = new Scanner(System.in);
        System.out.println("Digite nombre: ");
        nombre= lector.next();
        System.out.println("Digite primer apellido: ");
        primer_apellido= lector.next();
        System.out.println("Digite segundo apellido");
        segundo_apellido= lector.next();
    }
    public void Mostrar_nombre(){
        System.out.println("El nombre completo es: "+nombre+""+primer_apellido+""+segundo_apellido);
    }
}

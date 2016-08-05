
package p1punto18;

import java.util.Scanner;


public class Direccion extends Nombre {
    //Atributos
    private String calle,ciudad,provincia,codigo_postal;
    private Scanner lector;
    //Constructor
    
    public Direccion(String name, String Last_name, String Second_name, String street, String city, String dept, String postal) {
        super(name, Last_name, Second_name);
    }

 
    
    //Métodos
    public void Nueva_direccion(){
        System.out.println("Digite nueva provincia: ");
        provincia= lector.next();
        System.out.println("Digite nueva ciudad: ");
        ciudad= lector.next();
        System.out.println("Digite nueva calle: ");
        calle= lector.next();
        System.out.println("Digite nuevo código postal: ");
        codigo_postal= lector.next();
} 
    public void Nuevo_nombre(){
        lector = new Scanner(System.in);
        System.out.println("Digite nombre: ");
        nombre= lector.next();
        System.out.println("Digite primer apellido: ");
        primer_apellido= lector.next();
        System.out.println("Digite segundo apellido");
        segundo_apellido= lector.next();
}
    public void Mostrar(){
        System.out.println("El nombre completo es: "+nombre+""+primer_apellido+""+segundo_apellido+"");
}
    
}

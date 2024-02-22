package Ejemplo;
import java.util.Scanner;
/**
 *
 * @author Jose Manuel Mendoza Torres 22310349 
 */
public class Persona 
{
    //Atributos de clas
    private String nombre;
    private int edad;
    private double estatura;
    
    //Métodos de Getter y Setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public double getEstatura(){
        return estatura;
    }

    public void setEstatura(double estatura){
        this.estatura = estatura;
    }
    
    //Metodo para leer datos del teclado
    public void leerInformacion(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el nombre: ");
        setNombre(entrada.nextLine());
        System.out.println("Ingresa el edad: ");
        setEdad(entrada.nextInt());
        System.out.println("Ingresa el estatura: ");
        setEstatura(entrada.nextDouble());
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Estatura: "+getEstatura());
    }
}

package Practica1;
import java.util.Scanner;
/**
 *
 * @author Jose Manuel Mendoza Torres 22310349
 */
public class Figura {
    
    //Atributos de la clase
    private double largo,ancho,alto,volumen;

    //Metodos Getter Y Setter
    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    
    public void leer_medida(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar Largo");
        setLargo(entrada.nextDouble());
        System.out.println("Ingresar Ancho");
        setAncho(entrada.nextDouble());
        System.out.println("Ingresar Altura");
        setAlto(entrada.nextDouble());      
    }
    
    public void imprimir_medidas(){
        System.out.println("Largo: "+getLargo());
        System.out.println("Ancho: "+getAncho());
        System.out.println("Altura: "+getAlto());
    }
    
    public double obtener_volumen(){
        setVolumen(getLargo()*getAncho()*getAlto());
        System.out.println("El volumen es: "+getVolumen());
        return 0;
    }
}

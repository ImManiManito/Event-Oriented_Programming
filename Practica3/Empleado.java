package Practica3;
import java.util.Scanner;
/**
 *
 * @author Jose Manuel Mendoza Torres 22310349
 */
public class Empleado {
    
    private String nombre;
    private String puesto;
    private double pagoHora;
    private double horasTrabajadasMes;
    private double salarioMensual;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public double getHorasTrabajadasMes() {
        return horasTrabajadasMes;
    }

    public void setHorasTrabajadasMes(double horasTrabajadasMes) {
        this.horasTrabajadasMes = horasTrabajadasMes;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    
    public void capturar_datos_trabajador(){
        Scanner entrada =new Scanner (System.in);
        System.out.println("Ingrese su nombre: ");
        setNombre(entrada.next());
        System.out.println("Ingrese su puesto: ");
        setPuesto(entrada.next());
        System.out.println("Ingrese pago por hora: ");
        setPagoHora(entrada.nextDouble());
        System.out.println("Ingrese las horas trabajadas durante el mes: ");
        setHorasTrabajadasMes(entrada.nextDouble());
    }
    
    public double obtener_salario_mensual(){
        
        salarioMensual=getPagoHora()*getHorasTrabajadasMes();
       
        if(horasTrabajadasMes >= 100 && horasTrabajadasMes <=200){
            
            salarioMensual*=1.1;
        }
        if(horasTrabajadasMes >= 201 && horasTrabajadasMes <=220){
            salarioMensual*=1.2;
        }
        if(horasTrabajadasMes >= 221 && horasTrabajadasMes <=230){
            salarioMensual*=1.3;
        }
        
        salarioMensual*=0.84;
            
        return salarioMensual;
    }
    
    public void imprimir_datos_trabajador(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Puesto: "+getPuesto());
        System.out.println("pagoHoras: "+getPagoHora());
        System.out.println("horasTrabajadasMes: "+getHorasTrabajadasMes());
        obtener_salario_mensual();
    }
}






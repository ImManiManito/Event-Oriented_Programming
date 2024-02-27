package Practica3;
/**
 *
 * @author Jose Manuel Mendoza Torres 22310349
 */
public class PrincipalEmpleado {
    public static void main(String args[]){
        Empleado objEmpleado = new Empleado();
        objEmpleado.capturar_datos_trabajador();
        objEmpleado.imprimir_datos_trabajador();
        System.out.println("Su salario mensual es: "+objEmpleado.getSalarioMensual());
    }
}

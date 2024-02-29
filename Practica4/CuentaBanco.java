package Practica4;
import java.util.Scanner;
/**
 *
 * @author Jose Manuel Mendoza Torres 22310349
 */
public class CuentaBanco {
    private String nombreC;
    private String numeroC;
    private double saldoC;

    // Métodos getters y setters
    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(String numeroC) {
        this.numeroC = numeroC;
    }

    public double getSaldoC() {
        return saldoC;
    }

    public void setSaldoC(double saldoC) {
        this.saldoC = saldoC;
    }

    // Capturar datos del usuario
    public void capturarDatos() {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el Nombre del Cliente: ");
        setNombreC(entrada.next());
        System.out.print("Ingrese el Número de Cuenta: ");
        setNumeroC(entrada.next());
        System.out.print("Ingrese el Saldo Inicial de la Cuenta: ");
        setSaldoC(entrada.nextDouble());
    }

    // Imprimir datos de la cuenta
    public void imprimirDatos() {
        
        System.out.println("Nombre del Cliente: " + getNombreC());
        System.out.println("Número de Cuenta: " + getNumeroC());
        System.out.println("Saldo de la Cuenta: " + getSaldoC());
    }

    // Abonar a la cuenta
    public void abonarCuenta(double cantidad) {
        
        this.saldoC += cantidad;
        System.out.println("Saldo Actualizado: " + getSaldoC());
    }

    // Retirar de la cuenta
    public void retirarCuenta(double cantidad) {
        
        if (cantidad > saldoC) {
            System.out.println("No se puede retirar esta cantidad. Saldo insuficiente.");
        } else {
            this.saldoC -= cantidad;
            System.out.println("Saldo Actualizado: " + getSaldoC());
        }
    }

    // Mostrar menú
    public void mostrarMenu() {
        
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSistema de Manejo de Cuenta Bancaria");
            System.out.println("1. Crear la cuenta bancaria");
            System.out.println("2. Imprimir datos de la cuenta bancaria");
            System.out.println("3. Abonar a la cuenta bancaria");
            System.out.println("4. Retirar de la cuenta bancaria");
            System.out.println("5. Salir del sistema");
            System.out.print("Ingrese la opción deseada: ");
            
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    capturarDatos();
                    break;
                case 2:
                    imprimirDatos();
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a abonar: ");
                    double cantidadAbonar = entrada.nextDouble();
                    abonarCuenta(cantidadAbonar);
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetirar = entrada.nextDouble();
                    retirarCuenta(cantidadRetirar);
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 5);
    }
}

package Practica2;
/**
 *
 * @author Jose Manuel Mendoza Torres 22310349
 */
public class PrincipalFecha {
    public static void main(String[]args){
        Fecha objFigura1 = new Fecha();
        objFigura1.leer_fecha();
        if(objFigura1.validar_fecha()==1){
            objFigura1.imprimir_fecha_corta();
            objFigura1.imprimir_fecha_larga();
        }else{
            System.out.println("Error de Fecha");
        }        
    }
}

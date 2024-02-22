package Practica2;
import java.util.Scanner;
/**
 *
 * @author Jose Manuel Mendoza Torres 22310349
 */
public class Fecha {
    
    private int dia, mes, año;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void leer_fecha()
    {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese Dia: ");
        setDia(entrada.nextInt());
        System.out.println("Ingrese Mes: ");
        setMes(entrada.nextInt());
        System.out.println("Ingrese Anio: ");
        setAño(entrada.nextInt());
        validar_fecha();
    }
    
    public int validar_fecha()
    {
        if(getDia()<1 || getDia()>31 || getMes()<1 || getMes()>12 || getAño()<1)
            return 0;
        
        if(getMes()==1 || getMes()==3 || getMes()==5 || getMes()==7 || getMes()==8 || getMes()==10 || getMes()==12)
            return 1;
        
        if((getMes()==4 || getMes()==6 || getMes()==9 || getMes()==11)&&getDia()<31)
            return 1;
        
        if (getMes()==2){
            if((getAño()%4==0&&getAño()%100 !=0) ||(getAño()%100==0&&getAño()%400==0)){
                if(getDia()<=29)
                    return 1;
            }else if(getDia()<=28){
                return 1;
            }
        }
        return 0;
    }
    
    public void imprimir_fecha_corta()
    {
        System.out.println("La fecha corta es: ");
        System.out.println(""+getDia()+"/"+getMes()+"/"+getAño()+"");
        validar_fecha();
    }
    
    public void imprimir_fecha_larga()
    {
        validar_fecha();
        System.out.println("La fecha larga es: ");
        switch(mes){
            case 1:
                System.out.println(""+getDia()+"Enero"+getAño());
                break;
            case 2:
                System.out.println(""+getDia()+"Febrero"+getAño());
                break;
            case 3:
                System.out.println(""+getDia()+"Marzo"+getAño());
                break;
            case 4:
                System.out.println(""+getDia()+"Abril"+getAño());
                break;
            case 5:
                System.out.println(""+getDia()+"Mayo"+getAño());
                break;
            case 6:
                System.out.println(""+getDia()+"Junio"+getAño());
                break;
            case 7:
                System.out.println(""+getDia()+"Julio"+getAño());
                break;
            case 8:
                System.out.println(""+getDia()+"Agosto"+getAño());
                break;
            case 9:
                System.out.println(""+getDia()+"Septiembre"+getAño());
                break;
            case 10:
                System.out.println(""+getDia()+"Octubre"+getAño());
                break;
            case 11:
                System.out.println(""+getDia()+"Noviembre"+getAño());
                break;
            case 12:
                System.out.println(""+getDia()+"Diciembre"+getAño());
                break;
        }
    }
}



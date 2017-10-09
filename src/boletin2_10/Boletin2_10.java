
package boletin2_10;

/**
 *
 * @author David
 */
import java.util.Scanner;
public class Boletin2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sFijo, comi=0.05, ventas, km, dieta=30, numDiasDieta, irpf = 0.18F, sSocial=36, sBruto, sLiquido;
        Scanner sc=new Scanner (System.in);
        System.out.println("Sueldo fijo : ");
        sFijo=sc.nextFloat();
        System.out.println("Kilometros recorridos : ");
        km=sc.nextFloat();
        System.out.println("Nº de ventas : ");
        ventas=sc.nextFloat();
        System.out.println("Nº días para dieta : ");
        numDiasDieta=sc.nextFloat();
        sBruto=sFijo+(km*2)+(comi*ventas)+(dieta*numDiasDieta); //Cálculo sueldo bruto
        sLiquido=sBruto-(sBruto*irpf+sSocial); //Cálculo sueldo líquido
        System.out.println("Sueldo Bruto = "+sBruto+" € \n"+"Sueldo Liquido = "+sLiquido+" €");
    }
    
}

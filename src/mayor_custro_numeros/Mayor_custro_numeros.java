/*

 */
package mayor_custro_numeros;

import java.util.Scanner;

/**
 *
 * @author luistorresco
 */
public class Mayor_custro_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objread=new  Scanner(System.in);
        ClsMayor obj_mayor=new ClsMayor();
        //definicion de variables
        int n1, n2, n3, n4, may1, may2, mayor;
        // lectura datos de entrada
        System.out.println("digite numero uno");
        n1=objread.nextInt();
        System.out.println("digite numero dos");
        n2=objread.nextInt();
        System.out.println("digite numero tres");
        n3=objread.nextInt();
        System.out.println("digite numero cuatro");
        n4=objread.nextInt();
        // operaciones 
        may1=obj_mayor.hallar_mayor_dos_numeros(n1, n2);
        may2=obj_mayor.hallar_mayor_dos_numeros(n3, n4);
        mayor=obj_mayor.hallar_mayor_dos_numeros(may1, may2);
        // imprimir el numero mayor
        System.out.println("el numero mayor es " + mayor);
                
                
                
                
                
        }
    }

/* metodo que halle el mayor de dos numeros*/
package mayor_custro_numeros;

/**
 *
 * @author luistorresco
 */
public class ClsMayor {
    public int hallar_mayor_dos_numeros(int dato1, int dato2){
        int mayor;
        if (dato1>dato2)
            mayor=dato1;
        else
            mayor=dato2;
        return mayor;
    }
}


package conjuntos;

import java.util.ArrayList;


public class DSimetrica {
    private ArrayList<String> xy = new ArrayList<String>();
    private Union u = new Union();
    
    private Diferencia d = new Diferencia();
    private Diferencia d1 = new Diferencia();
    
    public ArrayList<String> DSim(ArrayList<String> x, ArrayList<String> y){
        xy = u.union(d1.Diferencia(x, y),d.DiferenciaR(y, x));
        return xy;
    }
}

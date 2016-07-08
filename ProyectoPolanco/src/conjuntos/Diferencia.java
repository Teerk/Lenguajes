
package conjuntos;

import java.util.ArrayList;


public class Diferencia {
    private ArrayList<String> xy = new ArrayList<String>();
    Interseccion in = new Interseccion();
    
    public ArrayList<String> Diferencia(ArrayList<String> x, ArrayList<String> y){
        ArrayList<String> aux = new ArrayList<String>();
        aux = in.Interseccion(x, y);
        xy.addAll(x);
            for (int i = 0; i < aux.size(); i++) {
                for (int j = 0; j < xy.size(); j++) {
                    xy.remove(aux.get(i));
                }
            }
        return xy;
    }
    
    public ArrayList<String> DiferenciaR(ArrayList<String> y, ArrayList<String> x){
        ArrayList<String> aux = new ArrayList<String>();
        aux = in.Interseccion(x, y);
        xy.addAll(y);
            for (int i = 0; i < aux.size(); i++) {
                for (int j = 0; j < xy.size(); j++) {
                    xy.remove(aux.get(i));
                }
            }
        return xy;
    }
}

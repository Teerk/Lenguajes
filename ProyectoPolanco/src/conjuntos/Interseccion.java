
package conjuntos;

import java.util.ArrayList;

public class Interseccion {
    private ArrayList<String> xy = new ArrayList<String>();
    
public ArrayList<String> Interseccion(ArrayList<String> x, ArrayList<String> y){

            for (int i = 0; i < x.size(); i++) {
                for (int j = 0; j < y.size(); j++) {
                    if(x.get(i).equals(y.get(j))){
                        xy.add(x.get(i));
                    }
                }
            }
        return xy;
    }
    
}

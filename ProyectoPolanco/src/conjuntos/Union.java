
package conjuntos;

import java.util.ArrayList;

public class Union {
    private ArrayList<String> xy = new ArrayList<String>();
    
    public ArrayList<String> union(ArrayList<String> x, ArrayList<String> y){
        for (int i = 0; i < x.size(); i++) {
            xy.add(x.get(i));
        }
        for (int i = 0; i < y.size(); i++) {
            xy.add(y.get(i));
        }
       return xy;
    }
}

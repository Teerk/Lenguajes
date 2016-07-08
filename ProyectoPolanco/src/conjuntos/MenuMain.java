
package conjuntos;

import java.util.ArrayList;
import java.util.Scanner;


public class MenuMain {
    ArrayList<String> x = new ArrayList<String>();
    private ArrayList y = new ArrayList();
    
    
    
    private Union u = new Union();
    private Interseccion i = new Interseccion();
    private Diferencia d = new Diferencia();
    private DSimetrica ds = new DSimetrica();

    MenuMain(){
        ejecutar();
    }
    
    public void ejecutar(){
        int res;
        Scanner read = new Scanner(System.in);
        do{
            System.out.println("Escoge la opereación deseada."+"\n"+"1.Agregar conjuntos"+"\n"+"2.Unión"+"\n"+"3.Intersección"
                               +"\n"+"4.Diferencia"+"\n"+"5.Diferencia Simétrica"+"\n"+"6.Imprimir"+"\n"+"7.Salir"+"\n");
            res = read.nextInt();
            switch (res){
                case 1:
                    Scanner leer = new Scanner(System.in);
                    Scanner leer2 = new Scanner(System.in);
                    int r;
                    do{
                        System.out.println("Elija el conjunto a llenar"+"\n"+"1.A"+"\n"+"2.B"+"\n"+"3.salir");
                        r=leer.nextInt();
                        if(r==1){
                            x.clear();
                            String re;
                            System.out.println("# Termina");
                            do{     
                                re = leer2.nextLine();
                                if(!re.equals("#")){
                                    x.add(re);
                                }
                            }while(!re.equals("#"));
                            System.out.println(x);
                        }
                        else if(r==2){
                            y.clear();
                            String re;
                            System.out.println("# Termina");
                            do{        
                                re = leer2.nextLine();
                                if(!re.equals("#")){
                                    y.add(re);
                                }
                            }while(!re.equals("#"));
                            System.out.println(y);
                        }
                        else{
                            System.out.println("Ok...");
                        }
                    }while(r!=3);
                    break;
                case 2:
                    System.out.println(u.union(x, y));
                    break;
                case 3:
                    System.out.println(i.Interseccion(x,y));
                    break;
                case 4:
                    System.out.println(d.Diferencia(x, y));
                    break;
                case 5:
                    System.out.println(ds.DSim(x, y));
                    break;
                case 6:
                    System.out.println("conjunto A " + x);
                    System.out.println("Conjunto B " + y);
                    break;
                case 7:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("No exite la opción"+"\n");
            }
        }while(res!=7);
    }
    
    
    
    
}

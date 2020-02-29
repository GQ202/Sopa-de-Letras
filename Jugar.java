
package SopaDeLetras;


public class Jugar {
    
    private int x,filas,contador, cantidad2;
    private boolean repetidor=true;
    private String[] vector = new String [cantidad2];
    
    
    public Jugar(int x, int filas,int contador, int cantidad2, String vector[]){
    this.x = x;                                          //Constuctor
    this.filas = filas;
    this.contador = contador;
    this.cantidad2 = cantidad2;
    this.vector = vector;
    }
    
    public void Verificador(){
    if(x==0){
    System.out.println("Por favor ingresa primero las palabras");
    System.out.println(x);System.out.println(filas);System.out.println(contador);System.out.println(cantidad2);
    Menu regreso = new Menu(repetidor);
    regreso.Eleccion();
    }else{Tablero();}
    
    }
    
  /*  public void ValidacionMatriz(){
        if(x>filas || contador>filas){
        System.out.println("Su cantidad de palabras no cabe en el tablero");
        }else{Tablero();}
    }*/
    
    public void Tablero(){
    System.out.println(vector[x]);
    }
}

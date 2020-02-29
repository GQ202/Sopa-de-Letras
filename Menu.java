
package SopaDeLetras;
import java.util.Scanner;
public class Menu {
    
    
    private boolean repetidor;
    private String nombre;
    private int x, filas, contador, cantidad2;
    private String vector[];
    
   public Menu(boolean repetidor){    // constructor
    this.repetidor = repetidor;
    }
   
    public void Eleccion(){
        Scanner Entrada = new Scanner(System.in);
        while(repetidor == true){
        
        System.out.println("Elige una opción :/");
        System.out.print(" 1.Nueva Partida ");
        System.out.print(" 2.Jugar ");
        System.out.println(" 3.Terminar Partida");
        
      
        int opcion1 = Entrada.nextInt();
      
        switch(opcion1){
          case 1: 
              repetidor = false;
              IngresoDePalabras caso = new IngresoDePalabras(nombre);
              caso.Datos();
              break;
          case 2: 
          repetidor = false;
          Jugar caso2 = new Jugar(x,filas, contador, cantidad2, vector);
          caso2.Verificador();
              break;
          case 3: System.out.println("clase 3");
          repetidor = false;
              break;
          default: 
              System.out.println("Por favor ingrese un número válido");
              repetidor = true;
              break;
       }
      }
        Entrada.close();
     }
    }



package SopaDeLetras;
import java.util.Scanner;

public class IngresoDePalabras {
    
    private String nombre,palabras;
    private int filas,ye, contador, cantidad, opcion, cantidad2, subeleccion;
    private boolean repetidor=true;
    private int x;
    Scanner Entrada2 = new Scanner(System.in);
    
    public IngresoDePalabras(String nombre){
    this.nombre = nombre;                  //Constructor
    }
    
    public void Datos(){
    
    System.out.println("Ingrese su nombre");
    nombre = Entrada2.nextLine();
    System.out.println("*********************************");
    System.out.println("*Ingrese el tamaño de su tablero*");
    System.out.println("*********************************"); 
    filas = Entrada2.nextInt(); 
    System.out.println("#columnas");
    
    System.out.print( "Hola " + nombre + " su tablero es de " );
    System.out.println(filas + "X" + filas);
    Insertar();
    }
    
    public void Insertar(){
    System.out.println(nombre + " por favor ingrese su cantidad de palabras ");
    cantidad = Entrada2.nextInt();
    cantidad2 = cantidad; //VEEEEEEEEEEEEEEER
    if(cantidad <=20 && cantidad>0){
    Menu1();
     }else{System.out.println("Ingrese un numero valido");
       Insertar();
     }
    }
    
    public void Menu1(){
    System.out.println("*//////////////////*");
    System.out.println("* Elija una opción *");
    System.out.println("*//////////////////*"); 
    System.out.println("1.Insertar");
    System.out.println("2.Modificar"); 
    System.out.println("3.Eliminar");
    System.out.println("4.Salir"); 
    opcion = Entrada2.nextInt();
    
          switch(opcion){
          case 1: 
              Ingreso();
              break;
          case 2:  
              
              break;
          case 3: System.out.println("clase 3"); 
              break;
          case 4:  
              Menu salida = new Menu(repetidor);
              salida.Eleccion();
              break;
          default: 
              System.out.println("Por favor ingrese un número válido");
              Menu1();
              break;
       }
    }

      public void Almacenador(){
          if(x<cantidad2){
      String[] vector = new String [cantidad2];
      vector[x] = palabras;}else{
      //Jugar enviar = new Jugar(x);   methodo clase Jugar
      ValidacionMatriz();
       }    
     }
 
     public void Ingreso(){
        System.out.println("Ingrese sus palabras");
        ye=1;
        contador = 0;
        while(ye<=cantidad){
        palabras = Entrada2.nextLine();
        contador = palabras.length();
        
        if(contador >0){
        ye++;
      
        if(contador>=5 && contador<=10){
        x++;
        Almacenador(); 
      }else{System.out.println("Ingrese una palabra valida");cantidad = cantidad+1;}
      //  if(palabras.equals(palabras)){System.out.println("Ingrese una palabra valida");cantidad = cantidad+1;}
        }      
    }
       
 }
     
       public void ValidacionMatriz(){
        if(x>filas || contador>filas){
        System.out.println("Su cantidad de palabras no cabe en el tablero");
        System.out.println("*************¿Que desea hacer?***************");
        System.out.println("-1.Cambiar tablero");System.out.println("-2.Cambiar banco de palabras");
        subeleccion = Entrada2.nextInt();
          if(subeleccion==1){
            System.out.println("Ingrese el nuevo tamaño de su tablero");
            filas = Entrada2.nextInt();
            Menu1();
            
          }else if(subeleccion==2){
          System.out.println("Banco de palabras");
          }else{System.out.println("Ingrese una opcion válida"); ValidacionMatriz();}
        }else{System.out.println("Genial"); Menu retorno = new Menu(repetidor); retorno.Eleccion();}
    }

    
     public void Modificar(){
     
     }
     
     public void Elminiar(){
     }
     

}
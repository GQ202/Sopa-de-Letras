import java.util.Scanner;
public class Menu {
    
    

    private String nombre;
    private boolean rectificador;
    private int x, filas, contador, cantidad2;
    private String vector[];
    private String palabras;
    private int ye, cantidad, opcion,subeleccion;
    private boolean repetidor=true;
    
   public Menu(int x){    // constructor
    this.x = x;
    }
   
    public void Eleccion(){
        Scanner Entrada = new Scanner(System.in);
        //while(repetidor == true){
        
        System.out.println("Elige una opción :/");
        System.out.print(" 1.Nueva Partida ");
        System.out.print(" 2.Jugar ");
        System.out.println(" 3.Terminar Partida");
        
        
        int opcion1 = Entrada.nextInt();
        switch(opcion1){
          case 1: 
          
          repetidor = false;
          Datos();
          break;
              
          case 2: 
          repetidor = false;
          Verificador();
          break;
          case 3: System.out.println("clase 3");
          repetidor = false;
          
              break;
          default: 
              System.out.println("Por favor ingrese un número válido");
              Eleccion();
              repetidor = true;
              break;
      // }
      }
        Entrada.close();
     }
    
    Scanner Entrada2 = new Scanner(System.in);
    
    
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
          Eleccion();
              break;
          default: 
              System.out.println("Por favor ingrese un número válido");
              Menu1();
              break;
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
        
            if(x<cantidad2){
            String[] vector = new String [cantidad2];
            vector[x] = palabras;   
            }
            else{
            ValidacionMatriz();  
       }
        
      }else{System.out.println("Ingrese una palabra valida");cantidad = cantidad+1;}
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
        }else{Eleccion();}
    }
    
       
    public void Verificador(){
    if(x > 0){
    System.out.println("tengo hambre");
    
    Tablero();
    }else if(x==0)
    {System.out.println("Por favor ingresa primero las palabras");Eleccion();}
    
    }
        
    
    public void Tablero(){
    System.out.println(x);
    }


     public void Modificar(){
     
     }
     
     public void Elminiar(){
     }
     
    

    }

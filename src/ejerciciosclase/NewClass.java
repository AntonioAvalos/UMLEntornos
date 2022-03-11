package ejerciciosclase;

import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;


/**
 *
 * @author super
 */
public class NewClass {
    
    public static void main(String[] args) {
             
        int contador=0;
        int puntos=0;
        int acumulador=0;
        String temp;
  

        Scanner entrada= new Scanner (System.in);
        
        int njug= entradaJugadores(entrada);
int prueba=0;
        
        String jugador[]=new String[njug];
    
        
         //SE JUEGAN CON LAS POSICIONES
        //Mete cada nombre en la posición del vector DE MANERA ORDENADA. 
        
         for(int p=0; p<njug;p++){
                          
            Scanner entradanombres= new Scanner (System.in);
            System.out.println("Introduzca nick, jugador número " + (p+1)); //FUNCION QUE PIDA NICK
            jugador[p]= entradanombres.nextLine();
   
            
         }
         
         
         for(int i=0; i<1;i++){
             
          int anterior = (int)(Math.random()*njug);        
          temp=jugador[anterior];
          jugador[anterior]=jugador[i];
          jugador[i]= temp;
            
         }
         

          int nrondas; 
               
        Scanner entradarondas= new Scanner (System.in);
        System.out.println("Escribe número de rondas:\n "
                + " 3 -> Partida rápida\n "
                + " 5 -> Partida corta\n "
                + " 10 -> Partida normal\n "
                + " 20 -> Partida larga\n "); //FUNCION QUE PIDA RONDAS
     
        nrondas= entradarondas.nextInt();
        
        while (nrondas!=3 && nrondas!=5 && nrondas!=10 && nrondas!=20){
            
            System.out.println("Error. Introduce un número de rondas correctas");
            
            nrondas= entradarondas.nextInt();
            
                if (nrondas==3 || nrondas==5 || nrondas==10 || nrondas==20){
                   break;
                }
          
        }
        
           
         int tabla[][]=new int[njug][nrondas];
                  
          for (int i = 0; i < nrondas; i++) {
              
             String preguntaAleatoria=serieMatematica(); //FUNCION MATEMATICA
             int respuestaAleatoria=averiguarRespuesta(preguntaAleatoria);
          
              System.out.println("**Respuesta correcta es " + respuestaAleatoria);
              
              
                 //El bucle de las columnas: cuando finaliza pasa de turno
                for (int j = 0; j < njug; j++) {
                    
                   //Scanner entradarespuesta= new Scanner (System.in);
                   System.out.println(jugador[j]+", escribe respuesta");
                   int respuesta= entrada.nextInt();
                   
                   //FUNCION ACERTAR O FALLAR
                   //Si acierta la pregunta, el jugador se lleva 1 punto. 
                   if (respuesta==respuestaAleatoria){
                       System.out.println("Has acertado");
                       tabla[j][i]= 1;
                
                   }
                   
                   else{
                       System.out.println("**Has fallado");
                       System.out.println("**La respuesta corrresta es " + 0);
                       tabla[j][i]= 0;
                   }
                         
           
               }
                
                /*
                Bucle que recorre solo las columnas (jugadores) de la fila en la que está el bucle principal. 
                */
                
                //FUNCION FINAL RONDA
                contador++;
                
                System.out.println("*PUNTUACIÓN ACTUAL*");
              for (int k=0;k<njug;k++){
                  for (int f=0; f<contador;f++){
                      puntos+=tabla[k][f];
                      
                  }       
                  System.out.println("Puntuación de jugador RONDA " + jugador[k] + "  es " + puntos);
                  puntos=0;
              }
              
              
      }
                
         
          //FUNCION PUNTUACION FINAL
         
          System.out.println("----PUNTUACION FINAL-----");
               puntos=0;
               int ganador=0;
               String nombreganador= new String();
               
              for (int k=0;k<njug;k++){
                  for (int f=0; f<contador;f++){
                      puntos+=tabla[k][f];
                     
                  }      
                 
                System.out.println("Puntuación de jugador FINAL " + jugador[k] + "  es " + puntos);
               
                if (puntos>ganador){
                    System.out.println("**" + puntos);
                    ganador=puntos;
                    System.out.println("**" + ganador);
                    nombreganador=jugador[k];
                }
               
                puntos=0;
              }
         
              System.out.println("EL GANADOR ES  " + nombreganador + " CON " + ganador + " PUNTOS" + "¡ENHORABUENA!");

           
          
            //Representación gráfica de la tabla
          for (int m = 0;m<tabla.length; m++) {
           
                for (int j = 0; j < tabla[m].length; j++){
                    
                    System.out.printf("%3d ", tabla[m][j]);
                }
             
            System.out.println();      
          }
          
          
    }        

    public static int entradaJugadores(Scanner entrada) {
        System.out.println("Escribe número de jugadores"); //FUNCIÓN QUE PIDA JUGADORES
        int njug= entrada.nextInt();
        while (njug>6 || njug<=0){
            
            System.out.println("Error. Introduce un número de jugadores entre 1 y 6");
            njug= entrada.nextInt();
            
            if (njug<6 && njug>0){
                break;
            }
        }
        return njug;
    }
          
          
//---FUNCIONES---
          
          
     public static String serieMatematica() {
         
        int b=(int)(4+Math.random()*(8-4+1));
        
        String almacena=" ";
     
        
        switch (b){
            
            case 4:
                
                System.out.println("Operación de 4 enteros");
                almacena=num()+op()+num()+op()+num()+op()+num();
                System.out.println(almacena);  
                
                break;
                
            case 5:
                
                System.out.println("Operación de 5 enteros");
                almacena=num()+op()+num()+op()+num()+op()+num()+op()+num();
                System.out.println(almacena);
           
                break;
                
            case 6:
                System.out.println("Operación de 6 enteros");
                almacena= num()+op()+num()+op()+num()+op()+num()+op()+num()+op()+num();
                System.out.println(almacena);
                
                break;
                
            case 7:
                System.out.println("Operación de 7 enteros");
                almacena=num()+op()+num()+op()+num()+op()+num()+op()+num()+op()+num()+op()+num();
                System.out.println(almacena);
                
                break;
                
            case 8:
                System.out.println("Operación de 8 enteros");
                almacena=num()+op()+num()+op()+num()+op()+num()+op()+num()+op()+num()+op()+num()+op()+num();
                System.out.println(almacena);
                
                break;
         
            
        }
        
        return almacena;
          
    }


    public static String op() {
        
        int n=(int)(1+Math.random()*(3-1+1));
      
        String x=" ";
        switch (n){
            
            case 1->  x="+";
            
            case 2->  x="-";
            
            case 3->  x ="*";
            
        }
        
        return x;
    }

    public static int num() {
        int a=(int)(2+Math.random()*(12-2+1));
        return a;
    }
    
    
 public static int averiguarRespuesta (String expresion) {
        int valor = 0;
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("javascript");
            Object result = engine.eval(expresion);
            valor = Integer.decode(result.toString());
            
        } catch (Exception e) {
            e.getMessage();
        }
        
        return valor;
       
    }
   


}

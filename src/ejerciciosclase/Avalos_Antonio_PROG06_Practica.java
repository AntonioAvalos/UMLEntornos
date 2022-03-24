/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosclase;

import java.util.Scanner;
import javax.script.ScriptEngine;

/**
 *
 * @author Antonio Ávalos Camuñas. 
 * 
 */

public class Avalos_Antonio_PROG06_Practica {
    public static void main(String[] args) {
        
        int contador=0;
        int puntos=0;
        int acumulador=0;
        String temp;
      

        Scanner entrada= new Scanner (System.in);
        
        // FUNCIÓN ENTRADA DE JUGADORES
        int njug= entradaJugadores(entrada);

        
        // FUNCIÓN NICK DE LOS JUGADORES: solicita nick y los ordena aleatoriamente.   
        String jugador[]=nombreJugadores(njug);
         

        // FUNCIÓN ENTRADA NÚMERO DE RONDAS. 
          int nrondas = entradaRondas();
        
         
          //Declaración e inicialización de la matriz que servirá de estructura principal del código. 
         int tabla[][]=new int[njug][nrondas];
                  
          for (int i = 0; i < nrondas; i++) {
              
             //FUNCIÓN SERIE MATEMÁTICA.
             String preguntaAleatoria=serieMatematica(); 
             
             //FUNCIÓN RESPUESTA: calcula el resultado de la expresión matemática. 
             int respuestaAleatoria=averiguarRespuesta(preguntaAleatoria);
          
             //Para facilitar las pruebas se da salida con la solución. 
              System.out.println("**Respuesta correcta es " + respuestaAleatoria);
              
              
                 //El bucle de las columnas: cuando finaliza pasa de turno
                for (int j = 0; j < njug; j++) {
                    
                   //Scanner entradarespuesta= new Scanner (System.in);
                   System.out.println(jugador[j]+", escribe respuesta");
                   int respuesta= entrada.nextInt();
                   
                   
                   //Si acierta la pregunta, el jugador se lleva 1 punto. 
                   if (respuesta==respuestaAleatoria){
                       System.out.println("Has acertado");
                       tabla[j][i]= 1;
                
                   }
                   
                   //Si falla, no genera puntos. 
                   else{
                       System.out.println("**Has fallado");
                       System.out.println("**La respuesta corrresta es " + respuestaAleatoria);
                       tabla[j][i]= 0;
                   }
                         
           
               }
                     
                
            //FUNCIÓN PUNTUACIÓN DE FINAL DE RONDA. 
                
                contador++;
              
                puntos = puntuacionRonda(njug, contador, puntos, tabla, jugador);
                         
      }
                
         
         // FUNCIÓN PUNTUACIONES DE RONDA: permite visualizar las puntuaciones de cada ronda, acumulando los resultados. 
         
          funcionGanador(puntos, njug, contador, tabla, jugador);

           
          
            //Representación gráfica de la matriz
          for (int m = 0;m<tabla.length; m++) {
           
                for (int j = 0; j < tabla[m].length; j++){
                    
                    System.out.printf("%3d ", tabla[m][j]);
                }
             
            System.out.println();      
          }
          
          
    }        
    
    
    // -- FUNCIONES -- 

    
    /**
     * Bucle que recorre solo las columnas (jugadores) de la fila en la que está el bucle principal.
     * 
     * @param njug
     * @param contador
     * @param puntos
     * @param tabla
     * @param jugador
     * @return 
     */
    
    public static int puntuacionRonda(int njug, int contador, int puntos, int[][] tabla, String[] jugador) {
          
        System.out.println("*PUNTUACIÓN ACTUAL*");
        for (int k=0;k<njug;k++){
            for (int f=0; f<contador;f++){
                puntos+=tabla[k][f];
                
            }
            System.out.println("Puntuación de jugador RONDA " + jugador[k] + "  es " + puntos);
            puntos=0;
        }
        return puntos;
    }

    /**
     * Puntuación final de juego y salida de ganador.
     * Estructura similar a la de las puntuaciones de final de ronda, pero en este caso acumula todas las rondas.  
     * 
     * @param puntos
     * @param njug
     * @param contador
     * @param tabla
     * @param jugador 
     */
    public static void funcionGanador(int puntos, int njug, int contador, int[][] tabla, String[] jugador) {
     
           
        System.out.println("----PUNTUACION FINAL-----");
        puntos=0;
        int ganador=0;
        String nombreganador= new String();
        
        for (int k=0;k<njug;k++){
            for (int f=0; f<contador;f++){
                puntos+=tabla[k][f];
                
            }
            
            System.out.println("Puntuación de jugador FINAL " + jugador[k] + "  es " + puntos);
            
            //La mayor puntuaciones que el bucle encuentra la guarda en la variable ganador, así como el nombre de éste. 
            if (puntos>ganador){
                
                ganador=puntos;
         
                nombreganador=jugador[k];
            }
            
            puntos=0;
            
        }
        
        System.out.println("EL GANADOR ES  " + nombreganador + " CON " + ganador + " PUNTOS" + "¡ENHORABUENA!");
    }

    /**
     * 
     * @return 
     */
    public static int entradaRondas() {
        int nrondas;
        Scanner entradarondas= new Scanner (System.in);
        System.out.println("Escribe número de rondas:\n "
                + " 3 -> Partida rápida\n "
                + " 5 -> Partida corta\n "
                + " 10 -> Partida normal\n "
                + " 20 -> Partida larga\n "); //FUNCION QUE PIDA RONDAS
        nrondas= entradarondas.nextInt();
        
        //Limitador del tipo de partida mediante while e if. 
        while (nrondas!=3 && nrondas!=5 && nrondas!=10 && nrondas!=20){
            
            System.out.println("Error. Introduce un número de rondas correctas");
            
            nrondas= entradarondas.nextInt();
            
            if (nrondas==3 || nrondas==5 || nrondas==10 || nrondas==20){
                break;
            }
            
        }
        return nrondas;
    }

    /**
     * 
     * @param njug
     * @return 
     */
    public static String[] nombreJugadores(int njug) {
        String inter;
        String jugador[]=new String[njug];
        
        //Primero, se mete cada nombre en la posición del vector DE MANERA ORDENADA.
        
        for(int p=0; p<njug;p++){
            
            Scanner entradanombres= new Scanner (System.in);
            System.out.println("Introduzca nick, jugador número " + (p+1)); //FUNCION QUE PIDA NICK
            jugador[p]= entradanombres.nextLine();
                    
        }
        
        /*Se crea un Math.random entre 0 y el número de jugadores totales: ese número aleatorio
          será una posición del vector donde se guardan los nombres. El contenido de la posición
          aleatoria se intercambiará con la posición que el bucle va recorriendo de manera ordenada.
          Se utiliza una variable String que permite el intercambio del nick.  
          Se trata de crear una situación que hace que se "barajen" los jugadores.
        */
        
        for(int i=0; i<2;i++){
            
            int anterior = (int)(Math.random()*njug);
            inter=jugador[anterior];
            jugador[anterior]=jugador[i];
            jugador[i]= inter;
            
        }
        
        return jugador;
    }

    /**
     * 
     * @param entrada
     * @return 
     */
    public static int entradaJugadores(Scanner entrada) {
        System.out.println("Escribe número de jugadores"); //FUNCIÓN QUE PIDA JUGADORES
        int njug= entrada.nextInt();
        
        //Limitador del número de jugadores permitidos, de 1 a 6. 
        while (njug>6 || njug<=0){
            
            System.out.println("Error. Introduce un número de jugadores entre 1 y 6");
            njug= entrada.nextInt();
            
            if (njug<6 && njug>0){
                break;
            }
            
        }
        return njug;
    }
          
          
       /**
        * 
        * @return 
        */         
     public static String serieMatematica() {
         
         // Se declara e inicializa un Math.random que elegirá la estructura de 4 a 8 enteros.
         
        int b=(int)(4+Math.random()*(8-4+1));
        
        String almacena=" ";
     
        /* Según lo que salga aleatoriamente, se creará la estructura entre numeros y operadores. 
           Se hace la llamada a sus respectivas funciones, comentadas más abajo en el código. 
        */
    
        switch (b){
            
            case 4:
                
                System.out.println("Serie matemática de 4 enteros");
                almacena=num()+op()+num()+op()+num()+op()+num();
                System.out.println(almacena);  
                
                break;
                
            case 5:
                
                System.out.println("Serie matemática de 5 enteros");
                almacena=num()+op()+num()+op()+num()+op()+num()+op()+num();
                System.out.println(almacena);
           
                break;
                
            case 6:
                System.out.println("Serie matemática de 6 enteros");
                almacena= num()+op()+num()+op()+num()+op()+num()+op()+num()+op()+num();
                System.out.println(almacena);
                
                break;
                
            case 7:
                System.out.println("Serie matemática de 7 enteros");
                almacena=num()+op()+num()+op()+num()+op()+num()+op()+num()+op()+num()+op()+num();
                System.out.println(almacena);
                
                break;
                
            case 8:
                System.out.println("Serie matemática de 8 enteros");
                almacena=num()+op()+num()+op()+num()+op()+num()+op()+num()+op()+num()+op()+num()+op()+num();
                System.out.println(almacena);
                
                break;
         
            
        }
        
        /* La salida es una serie matemática contenida en un String, por lo que más adelante será necesario la función específica que
           calcula una expresión aritmética en un String como si fuera un int. 
        */
        
        
        return almacena;
          
    }


     /**
      * Se declara un Math random entre 1 y 3, dependiendo de lo que salga el operador será una suma, resta o multiplicación.
      * 
      * @return 
      */
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

    /**
     * Genera números enteros entre 2 y 12. 
     * 
     * @return 
     */
    public static int num() {
        
        int a=(int)(2+Math.random()*(12-2+1));
        return a;
    }
    
    
    
    /**
     * Función que permite hacer el cálculo del String de la serie matemática.
     * @param expresion
     * @return 
     */
    
 public static int averiguarRespuesta (String expresion) {
        int valor = 0;
        try {
            javax.script.ScriptEngineManager manager = new javax.script.ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("javascript");
            Object result = engine.eval(expresion);
            valor = Integer.decode(result.toString());
            
        } catch (Exception e) {
            e.getMessage();
        }
        
        return valor;
       
    }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horas;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author karen
 */
public class Horas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner hora1 = new Scanner(System.in);
  System.out.print("Ingrese la hora1: ");
            LocalTime ingreso1 = LocalTime.parse(hora1.next());
            System.out.print("Ingrese la hora 2: ");
            LocalTime ingreso2  = LocalTime.parse(hora1.next());
    ingreso1.compareTo(ingreso2);
 
int hora11=ingreso1.getHour();
int hora2=ingreso2.getHour(); 
int min=ingreso1.getMinute();
int finMin=ingreso2.getMinute();
int segIni=ingreso1.getSecond();
int segFin=ingreso2.getSecond();  
List<String> horario = new ArrayList<String>();

for (int i=hora11; i < hora2; i++) {
          for (int j=min; j<60; j++ ){
              for (int k=segIni; k<60; k++){
                  horario.add(""+hora11+":"+min+":"+segIni);
                  segIni=segIni+1;
              }
                  segIni=0;
                  min=min+1;
          }
min=0;
hora11=hora11+1;
        }

for (int j=0; j<finMin; j++){
    for (int k=0; k<60; k++){
        
        horario.add(""+hora11+":"+min+":"+segIni);
        segIni=segIni+1;
    
    }
    segIni=0;
    min=min+1;
}
for (int k=0; k<=segFin; k++){
          horario.add(""+hora11+":"+min+":"+segIni);
        segIni=segIni+1;
    }
     System.out.println(""+horario);
    }
    
}

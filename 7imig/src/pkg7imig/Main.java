/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7imig;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat=new Scanner(System.in);
        Random generator=new Random();
        
        System.out.println("Entra una aposta");
        int carta=teclat.nextInt();
        
        //cartes
        double valor=0;
        double total=0;
        boolean jugar=true;
        while(jugar){
             int cartes=generator.nextInt(10)+1;
             if (cartes<=7) {
                valor=cartes; 
                System.out.println("Ha sortit la carta"+valor);
             
            }
           
            else{
                valor =0.5;
            if(cartes==8)  System.out.println("Ha sortit sota");
                
            
      else if(cartes==9) System.out.println("Ha sortit cavall");
            
            else System.out.println("Ha sortit rey");
                
            }    
                    
          total=total+valor;
           if (total>7.5) {
                    System.out.println("perds"+carta+"euros");
                jugar=false;
                }
                 
            
          
           else if(total==7.5) {
                System.out.println("Has guanyat!!!");
                System.out.println(carta*2+"euros");
                jugar=false;
                
            }
              
            
            else{
                
                System.out.println("vols continuar?");
                char continuar=teclat.next().charAt(0);
                if (continuar=='n') {
                    System.out.println("recuperes"+carta+"euros");
                    jugar=false;
                    
                }
               
            
            }
            
            
        }
       
    }
}
    



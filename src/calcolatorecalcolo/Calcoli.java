/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatorecalcolo;
import java.math.*;
/**
 *
 * @author eliasforna
 */
public class Calcoli {
    
    //Attributi
    
    public float numero1;
    public float numero2;
    public float indexPot;
    public float totale;
    
    //Costruttore
    
    public Calcoli(float n1,float n2,float inP,float tot)
    {
        
        numero1 = n1;
        numero2 = n2;
        indexPot = inP;
        totale = tot;
        
    }
    
   public void addizione(float n1,float n2, float tot)
   {
       tot = n1 + n2;
       System.out.println("Il risultato dell'addizione è:" +" "+tot);
   }
   public void sottrazione(float n1,float n2, float tot)
   {
       tot = n1 - n2;
       System.out.println("Il risultato della sottrazione è:"+" " +tot);
   }
   public void moltiplicaizione(float n1,float n2, float tot)
   {
       tot = n1 * n2;
       System.out.println("Il risultato della moltiplicazione è:"+" " +tot);
   }
   public void divisione(float n1,float n2, float tot)
   {
       tot = n1 / n2;
       System.out.println("Il risultato della divisione è:"+" " +tot);
   }
   public void quadrato(float n1,float inP, float tot)
   {
       n1 = (float) (double) n1;
       tot = (float) Math.pow(n1, inP);
       System.out.println("Il risultato della potenza è:"+" " +tot);
         System.exit(-1); 
   }
   public void radice(float n1,float tot)
   {
       n1 = (float) (double) n1;
       tot = (float) Math.sqrt(n1);
       System.out.println("Il risultato della radice è:"+" " +tot);
       System.exit(-1);
   }
           
        
    
   
    
    
    
}

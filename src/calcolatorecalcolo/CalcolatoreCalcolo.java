/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatorecalcolo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author eliasforna
 */
public class CalcolatoreCalcolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dichiarazione Input
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        
        //Dichiarazione Variabili
        
        float num1 = 0;
        float num2 = 0;
        float iP = 0;
        int switc1 = 0;
        int switc2 = 0;
        int controlloRadPot = 0;
        
        String inserimento;
        
        //Dichiarazione Oggetti
        
        Calcoli calc = new Calcoli(num1,num2,iP,0);
        
        //Inserimento dati
        
        System.out.println("Programma che risolve operazioni matematiche:\n");
        System.out.println(" - Inserisci 1 se vuoi applicare le 4 operazioni basilari: (Addizione, Sottrazione, Moltiplicazione e Divisione)\n" + " - Altrimenti digita 2 se vuoi lavorare sull'Elevamento a Pontenza o Radice Qudrata.\n");
        
        try 
        {
            
        inserimento = tastiera.readLine();
        switc1 = Integer.valueOf(inserimento);
        
        }
        
        catch(Exception e)
                   {
                       System.out.println("Errore");
                       
                   }
           
        
        switch(switc1)
        {
            case 1: 
                System.out.println("Inserisci il numero 1:"+" ");
        try
        {
            inserimento = tastiera.readLine();
            num1 =   Float.parseFloat(inserimento);
            System.out.println("Inserisci il numero 2:"+" ");
            inserimento = tastiera.readLine();
            num2 = Float.parseFloat(inserimento);
        }
         catch(Exception e)
                   {
                       System.out.println("Errore");
                       
                   }
        break;
                
            case 2:
                System.out.println("Digiti:\n" + "1. Radice Quadrata \n" + "2. Elevamento a Potenza\n");
                try
                {
                    inserimento = tastiera.readLine();
                    controlloRadPot = Integer.valueOf(inserimento);
                    
                }
                catch(Exception e)
                   {
                       System.out.println("Errore");
                       
                   }
                
                
                if(controlloRadPot == 2)
                {
                System.out.println("Inserisci il numero da elevare a potenza:" + " ");
                
                try
                {
                inserimento = tastiera.readLine();
                num1 = Float.parseFloat(inserimento);
                System.out.println("Inserisci l'indice di potenza:" + " ");
                 inserimento = tastiera.readLine();
                iP = Float.parseFloat(inserimento);
                calc.quadrato(num1, iP, 0);
                }
                catch(Exception e)
                   {
                       System.out.println("Errore");
                       
                   }
        
                }
            else
                {
                    try
                    {
                    System.out.println("Inserisci il numero da porre sotto radice:" + " ");
                    inserimento = tastiera.readLine();
                    num1 = Float.parseFloat(inserimento);
                    calc.radice(num1, 0);
                    }
                    catch(Exception e)
                   {
                       System.out.println("Errore");
                       
                   }
                    
                }
                break;
            default: System.out.println("Errore");
                break;
        
        }
        
        //Selezione dell'operazione da eseguire;
        
        System.out.println("Inserisci il numero dell'operazione da effettuare:\n" + "1. Addizione\n" + "2. Sottrazione\n" + "3. Moltiplicazione\n" + "4. Divisione\n");
        
        try
        {
        inserimento = tastiera.readLine();
        switc2 = Integer.valueOf(inserimento);
        }
        catch(Exception e)
                   {
                       System.out.println("Errore");
                       
                   }
        
        switch(switc2)
        {
            case 1: calc.addizione(num1, num2, 0);
                break;
            case 2: calc.sottrazione(num1, num2, 0);
                break;
            case 3: calc.moltiplicaizione(num1, num2, 0);
                break;
            case 4: calc.divisione(num1, num2, 0);
                break;
            default: System.out.println("Errore");
                break;
        }
        
        
        
       
        
        
        
        
        
        
    }
    
}

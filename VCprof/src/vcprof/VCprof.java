/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vcprof;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ballabio_giulio
 */
public class VCprof {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader tastiera = new BufferedReader(input);
            
            Scrittura scrivi = new Scrittura();
            
            String scelta;
            /////////LISTA/////////
            System.out.println("prof in lista");
            System.out.println("rova");
            System.out.println("brev");
            ////////SCELTA/////////
            System.out.println("A CHI VUOI SCRIVERE ? ");
            scelta=tastiera.readLine();
            ///////////////////////
            scrivi.setPROF(scelta);
            String messaggio;
            System.out.print("SCRIVI IL MESSAGGIO...");
            messaggio=tastiera.readLine();
                        
            scrivi.scrivi(messaggio);
            
        
        }catch(Exception e)
        {
            System.out.println("ERRORE MAIN"+e);
        }
        
    }
    
}

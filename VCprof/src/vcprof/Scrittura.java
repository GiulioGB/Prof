package vcprof;
import java.io.*;
/**
 *
 * @author ballabio_giulio
 */
public class Scrittura {
    
    private String professore;
    
    public void Scrittura()
    {
        
    }
    
    public void setPROF(String prof)
    {
        professore=prof;
    }
    
    public void scrivi(String stringa)
    {
          
        try
        {
                     
            FileWriter writer = new FileWriter("\\\\INFO01-DOC\\shared folder\\"+professore+"_bc.csv");
            BufferedWriter buffer = new BufferedWriter(writer);
            
            
            buffer.write(stringa);
            
            writer.close();
            
        }
        catch(IOException e)
        {
            System.out.println("ERRORE SCRITTURA");
        }
    }
    
}

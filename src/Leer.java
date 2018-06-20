/**
 *
 * @author Jesus Ivan
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer {     
    public static InputStreamReader isr=new InputStreamReader(System.in);
    public static BufferedReader br=new BufferedReader(isr);
     
     public static String leer(){ 
         String Dato=" ";
             try {
  	        Dato= br.readLine();
  	        br.skip(System.in.available());
  	        }
  	      catch( IOException Err ){
               }
         return Dato;    
     }
}
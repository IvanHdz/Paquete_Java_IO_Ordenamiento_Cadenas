/**
 *
 * @author Jesus Ivan
 */
public class Cadenas {
    static int cantespeciales = 0;
    
    public Cadenas(){
    }
    
    public static void letrasYnumeros(String cad){ 
         String nc="";
         for(int i=0; i<cad.length(); i++){
            //El if verifica que entre en el rango de letras o números
            if((cad.charAt(i)>= 'a' & cad.charAt(i)<='z' | cad.charAt(i)>= 'A' & cad.charAt(i)<='Z' | cad.charAt(i)>= '0' & cad.charAt(i)<='9')!=true){
                cantespeciales++;
                nc=nc+'?';
            }else
                nc=nc+cad.charAt(i);  
         }
  	 System.out.println("Lo q no es letra ni número se reemplaza por el simbolo (?) : "+nc);
    }
    
    public static void evaluar(String cad){ 
        int cantletras=0,cantnums=0;
      	for(int i=0; i<cad.length(); i++){
            //Se comprueba si es Letra y se suman 
            if ((cad.charAt(i)>= 'a' && cad.charAt(i)<='z')||(cad.charAt(i)>= 'A' && cad.charAt(i)<='Z'))
                cantletras++;
            //Se comprueba si es Número
            else if (cad.charAt(i)>= '0' && cad.charAt(i)<='9')  
                cantnums++; 
  	 }
        
  	 System.out.println("Cantidad de Letras: "+cantletras);
  	 System.out.println("Cantidad de Números: "+cantnums);
  	 System.out.println("Cantidad de Caracteres Especiales: "+cantespeciales);
   }
    
    public static void ordenar(String cad){ 
        int i,j;
        char nc[]= new char [cad.length()+1];
        for( i=0; i<cad.length(); i++)
            nc[i]=cad.charAt(i);
            for(i=0; i<cad.length(); i++){
                for(j=i+1; j<cad.length(); j++){
                    if(nc[i]> nc[j]){
                        char aux=nc[i];
                        nc[i]= nc[j];
                        nc[j]=aux;
                    }
                }
            }
  	System.out.print("Cadena Ordenda: ");
  	for(i=0; i<cad.length(); i++)
            System.out.print(nc[i]);
            System.out.println("");          
    }
}
/**
 *
 * @author Viruz
 */
public class Main {
    public static void main(String []Args){
        System.out.println("Digite una Nueva Cadena: ");
 	String cad2 = Leer.leer();
 	Cadenas.letrasYnumeros(cad2);
 	Cadenas.evaluar(cad2);
 	Cadenas.ordenar(cad2);	  
    }
}
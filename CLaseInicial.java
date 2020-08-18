
import com.melvin.clase02.com.melvin.clase02.Libros;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author recin
 */
public class CLaseInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//    System.out.println(libro.toString());
        //  System.out.println("Hola");
        Libros objetolibro1 = new Libros(1, "PRGRAMACION DE JAVA", 100, "DEITEL");
        Libros objetolibro2 = new Libros(2, "PRGRAMACION DE PHP", 600, "DEITEL");
        
        objetolibro1.setNumeroPaginas(200);


        if (objetolibro1.getNumeroPaginas() < objetolibro2.getNumeroPaginas()) {
            System.out.println("El libro 2 tiene mayor numero de paginas que el libro 1, el libro 2 tiene un numero de paginas de "+objetolibro2.getNumeroPaginas());
            System.out.println("Los informacion del libro 2 es  "+objetolibro2.toString());
        } else {
            System.out.println("El libro 1 tiene mayor numero de paginas que el libro 2, el libro 1 tiene un numero de paginas de "+objetolibro1.getNumeroPaginas());
            System.out.println("Los informacion del libro 1 es  "+objetolibro1.toString());
        }
        
    }
}

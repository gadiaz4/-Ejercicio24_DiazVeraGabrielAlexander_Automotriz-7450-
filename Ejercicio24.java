/*
Diseño e mplementacion de un algoritmo que le permita ingresar por teclado el codigo
de la imagen y le describa los distractores, y determine si un conductor
esta distraido o atento.
 */
package ejercicio24;

/**
 *
 * @author Gabriel Alexander Diaz Vera
 */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio24 {

    public char obtener_imagen;
    public char compara_imagen;
    public char clasificar_distractor;
    public char identificar_conductor;
    public char reconocer_conductor_distraido;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner objeto=new Scanner(System.in);

    System.out.println("\t\t\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE\n");
    System.out.println("Nombre: Díaz Vera Gabriel Alexander");
    System.out.println("Asignatura: Programación");
    System.out.println("Nrc: 7450");
    System.out.println("Tema del Paper: Transferencia de Aprendizaje Mediante Redes Neuronales Convolucionales para el Reconocimiento de Conductores Distraídos.");
    System.out.println("Explicacion: Reconocer conductores distraidos mediante la rotacion y aumento del tamaño de imágenes.\n");

    String calidad_imagen=new String("buena");
    String no_calidad_imagen=new String("mala");
    String dimension_imagen=new String("224x224 pixeles.");
    String redimension=new String("640x480 pixeles.");

    int codigo=-1;
    String seg = new String ("Seguro");
    String noseg = new String ("No Seguro");
    int intentos=0;
        String linea;

       BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

        do{
            try{
            System.out.println("Ingrese el codigo de la imagen entre 1 y 10:");
            linea=teclado.readLine();
            codigo=Integer.parseInt(linea);
            }catch(IOException Objeto1){
                System.out.println("Error al leer el teclado");
            }catch(NumberFormatException Objeto1){
            System.out.println("Ingrese el codigo de la imagen entre 1 y 10:");
            }finally{
            intentos++;
            }
        }while(codigo<=0||codigo>12);
        System.out.println("El codigo de la imagen es: D"+codigo);
        if (codigo<=2){
    System.out.println("La calidad inicial de la imagen es: "+dimension_imagen);
    System.out.println("La redimensionalizacion es: "+redimension);
    System.out.println("La calidad de la imagen es:"+calidad_imagen+"\n");
    System.out.println("El codigo ingresado corresponde a un conductor atento.\n" );
    System.out.println("Descripcion de un conductor atento es:");
    System.out.println("-\tManos en el volante.");
    System.out.println("-\tConduccion a la defensiva.");
    System.out.println("-\tVista en la carretera.");
    System.out.println("-\tEs un conductor --->"+seg);
        }
        if (codigo>2){
     System.out.println("La calidad inicial de la imagen es: "+dimension_imagen);
    System.out.println("La redimensionalizacion es: "+redimension);
    System.out.println("La calidad de la imagen es:"+calidad_imagen+"\n");
    System.out.println("La codigo ingresado corresponde a un conductor distraido.\n" );
    System.out.println("Descripcion de un conductor distraido es:");
    System.out.println("-\tUsar celular.");
    System.out.println("-\tOperar radio.");
    System.out.println("-\tBeber.");
    System.out.println("-\tVoltearse");
    System.out.println("-\tMaquillarse o arreglarse el cabello.");
    System.out.println("-\tHablar con el pasajero.");
    System.out.println("-\tEs un conductor --->"+noseg);
        }

    }
}

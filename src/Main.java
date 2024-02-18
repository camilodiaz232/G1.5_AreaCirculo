import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        // Creacion de las variables
        double radioInterno = 0;
        double radioExterno = 0;
        double areaCorona=0;


        // Metodo para lectura de los valores
        Scanner lectura =  new Scanner(System.in);

        // Captura del radio del circulo interno
        System.out.println("Ingrese el radio del circulo interno");
        radioInterno = Double.parseDouble(lectura.next());

        // Captura del radio del cirtulo externo
        System.out.println("Ingrese el radio del circulo externo");
        radioExterno = Double.parseDouble(lectura.next());

        // Presentacion de resultados
        System.out.println("El area de la corono es:"+calcularCorona(radioInterno, radioExterno));

    }

    // Funcion para calcular el area
    public static double calcularArea (double radio){
            return Math.PI*(Math.pow(radio,2));
        }

    // Funcion para calcular corona
    public static double calcularCorona(double radioInterno, double radioExterno){
        return calcularArea(radioExterno)-calcularArea(radioInterno);
    }

}

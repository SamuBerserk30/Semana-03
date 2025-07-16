import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Persona persona1 = new Persona("Samuel", 19, 1234567891);

        System.out.println("persona 1:\n nombre:" +persona1.getNombre()+ "\n Edad:" +persona1.getEdad()+ "\n Cedula :" +persona1.getCedula());
    }
}

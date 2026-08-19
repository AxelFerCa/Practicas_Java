public class Ejer2 {
    public static void main (String [] args){

        for (int i = 1; i <= 10; i ++){
            System.out.println("conteo de 10");
        }

      // creacion de bucles de for para conteo a 10

        String [] nombres = {"Axel","Fernandez","Casas"};

        for (String nombre: nombres){
            System.out.println( nombre);
        }

     // creacion de bucles de for-each 

        int[] numeros = {1,3,5,7,9};

        for (int numero: numeros){
            System.out.println( numero);
        }
    }
}


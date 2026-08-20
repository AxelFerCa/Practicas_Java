public class Ejer3 {

    /*
        while: primero pregunta → después ejecuta.

        do while: primero ejecuta → después pregunta.

        Por eso do while garantiza al menos una ejecución.
    */

    public static void main(String [] args) {
        
        String nombre = " Axel";
        int conteo = 1;
        while (conteo <= 5  ){
            System.out.println("Conteo" + nombre);
            conteo++;
        }

        // aqui tiene que llegar ala cantidad del conteo que es 5 en nombre y una vez llegada se termina el while

        int numero1 = 1; 

        while (numero1 <= 5){
            System.out.println("conteo de numero" + numero1);
            numero1++;
        }

        // lo mismo pero en numeros 

        int intentos = 1;

        do{
            System.out.println("Intento de conexiones :" + intentos);
            intentos ++ ;
        }while (intentos <=6);

        // aqui es diferente porque imprime sin importar hasta llegar ala condicion y ahi se detendra
    }
}
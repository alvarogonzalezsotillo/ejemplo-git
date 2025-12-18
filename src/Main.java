/*
 Ejemplo de trabajo colaborativo
 Una persona hace el método main.
 Otra persona hace el método esPrimo
 Otra persona hace el método esCapicua

 Y luego lo integramos todo
 */
public class Main {
    public static void main(String[] args) {
        for( int candidato = 10_000_000 ; ; i += 1 ){
            if( esPrimo(candidato) && esCapicua(candidato) ){
                System.out.println("Encontrado:" + candidato);
                System.exit(0);
            }
        }
    }
}
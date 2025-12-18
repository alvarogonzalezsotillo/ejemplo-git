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
    public static boolean esCapicua(int candidato){
            // Trabajamos con el valor absoluto por si el número es negativo
            int n = Math.abs(numero);

            int copia = n;
            int invertido = 0;

            // Construimos el número invertido
            while (copia != 0) {
                int resto = copia % 10;          // última cifra
                invertido = invertido * 10 + resto; // añadimos la cifra al final
                copia = copia / 10;              // quitamos la última cifra
            }

            // Si el número original (en valor absoluto) es igual al invertido, es capicúa
            return n == invertido;
    }

}
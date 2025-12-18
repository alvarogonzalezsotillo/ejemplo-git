//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
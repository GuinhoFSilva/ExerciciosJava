import java.util.ArrayList;
import java.util.List;

public class ExercicioVinteETres{
    public static void main(String[] args) {
       System.out.println(multiplicarImpares(98478));
       System.out.println(multiplicarImpares(13579));
       System.out.println(multiplicarImpares(2222));
    }
    public static int multiplicarImpares(int numero){
        String numeroString = String.valueOf(numero);
        List<Integer> listaImpares = new ArrayList<>();
        for(int i = 0; i < numeroString.length(); i++){
            int numAtual = Integer.parseInt(String.valueOf(numeroString.charAt(i)));
            if(numAtual % 2 != 0){
                listaImpares.add(numAtual);
            }
        }
        int produto = 1;
        for (Integer imparAtual : listaImpares) {
            produto *= imparAtual;
        }
        return produto;
    }
}
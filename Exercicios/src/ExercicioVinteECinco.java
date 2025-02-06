import java.util.Arrays;
import java.util.List;

public class ExercicioVinteECinco {
    public static void main(String[] args) {
        System.out.println(contarConsoantesEVogais("A linguagem Java é poderosa"));
       
    }
    public static String contarConsoantesEVogais(String texto){
        List<String> vogais = Arrays.asList("a", "e", "i", "o", "u", "á", "é", "í", "ó", "ú", "â", "ê", "î", "ô", "û", "à", "è", "ì", "ò", "ù");
        int contadorVogais = 0;
        int contadorConsoantes = 0;
                  
        for(int i = 0; i < texto.length(); i++){
            char caracterAtual = texto.toLowerCase().charAt(i);
            if(Character.isLetter(caracterAtual)){
                if(vogais.contains(String.valueOf(caracterAtual))){
                    contadorVogais++;
                } else {
                    contadorConsoantes++;
                }
            }
        }
        return "Vogais: " + contadorVogais + " Consoantes: " + contadorConsoantes;
    }
}

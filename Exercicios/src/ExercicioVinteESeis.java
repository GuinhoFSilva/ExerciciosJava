import java.util.ArrayList;
import java.util.List;

public class ExercicioVinteESeis {
    public static void main(String[] args) {
        System.out.println(somarQuadrados(123));
        System.out.println(somarQuadrados(321));
        System.out.println(somarQuadrados(64356));
    }
    public static int somarQuadrados(int numero){
        String numeroString = String.valueOf(numero);
        List<Integer> digitos = new ArrayList<>();
        for(int i = 0; i < numeroString.length(); i++){
            int digitoAtual = Integer.parseInt(String.valueOf(numeroString.charAt(i)));
            digitos.add(digitoAtual);
        }
        int soma = 0;
        for(Integer numAtual : digitos){
            soma += pegarQuadrado(numAtual);
        }
        return soma;
    }
    public static int pegarQuadrado(int digito){
        return digito * digito;
    }
}

public class ExercicioVinteEQuatro {
    public static void main(String[] args) {
        System.out.println(checarPalindromo("arara"));
        System.out.println(checarPalindromo("banana"));
        System.out.println(checarPalindromo("Omissíssimo"));
    }
    public static String checarPalindromo(String palavra){
        String palindromo = "";
        for(int i = palavra.length(); i >= 1 ; i--){
            char caracterAtual = palavra.charAt(i - 1);
            palindromo += caracterAtual;
        }
        if(palavra.equalsIgnoreCase(palindromo)){
            return "É palindromo"; 
        } else {
            return "Não é palíndromo";
        }
    }
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String texto = "A rainha da neve";

        String padrao = "\\bneve\\b"; // expressão regular para selecionar a palavra "neve"
        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(texto);

        if (matcher.find()) { // verifica se a expressão regular foi encontrada na string
            System.out.println("Expressão encontrada!");
        } else {
            System.out.println("Expressão não encontrada.");
        }
    }
}

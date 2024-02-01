import java.util.*;

public class n8ejercicio8 {
    public static void main(String[] args) {

        String phrase = "In a hole in the ground there lived a hobbit.";

        invertString convertText = (text) -> {
            String invertPhrase ="";
            int i;
            for (i=text.length()-1; i>=0; i--){
                invertPhrase += text.charAt(i);
            }
            return invertPhrase;
        };
        System.out.println("-Frase sin invertir: "+phrase);
        System.out.println();
        System.out.println("-Frase invertida: "+convertText.reverse(phrase));


    }
}
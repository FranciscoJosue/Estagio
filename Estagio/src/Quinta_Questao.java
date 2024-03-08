import java.util.Scanner;
public class Quinta_Questao {
    public static void main(String[] args) {
        System.out.println("Digite uma palavra ou frase: ");
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        scan.close();
        char[] letras = palavra.toCharArray();

        for (int i = 0, j = letras.length - 1; i < j; i++, j--){
            char k = letras[i];
            letras[i] = letras[j];
            letras[j] = k;
        }

        String invertida = new String(letras);
        System.out.println(palavra);
        System.out.println(letras);


    }
}

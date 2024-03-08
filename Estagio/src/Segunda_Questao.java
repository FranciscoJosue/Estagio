import java.util.Scanner;
import java.math.BigInteger;
public class Segunda_Questao {
    public static void main (String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número: ");
        BigInteger Numero = scan.nextBigInteger();
        scan.close();

        BigInteger Antes = BigInteger.ZERO;
        BigInteger Atual = BigInteger.ONE;

        while(Atual.compareTo(Numero) <= 0) {
            if(Atual.equals(Numero)) {
                System.out.println("O número pertence a sequência Fibonaci.");
                return;
            }
            BigInteger Proximo = Antes.add(Atual);
            Antes = Atual;
            Atual = Proximo;
        }
        System.out.println("O número não pertence a sequência Fibonaci");
    }
}

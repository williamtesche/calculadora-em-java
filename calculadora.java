import java.util.Scanner;

public class calculadora {
    static  public void main(String[] args) {
            Scanner scan=new Scanner(System.in);

            num n1=new num();
            num n2=new num();
            num res=new num();
        
            System.out.printf("%nDigite o valor 1:");
            n1.setValor(scan.nextInt());

            System.out.printf("%nDigite o valor 2:");
            n2.setValor(scan.nextInt());

            res.setValor(n1.getValor() + n2.getValor());
            System.out.printf ("%nA soma de %d com %d e igual a %d",n1.getValor(),n2.getValor(),res.getValor());
        }
}

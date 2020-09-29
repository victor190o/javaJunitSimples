import java.util.Scanner;

public class Calculadora {
    public void main(String[] args) {

        double n1;
        double n2;

        String  operacao = "";
        boolean isAValidOperation=false;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a operação desejada (+, -, *, /): ");
        operacao = entrada.nextLine();

        System.out.println("Digite um valor: ");
        n1 = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite um valor: ");
        n2 = Integer.parseInt(entrada.next());

        if(operacao.equals("+")) {
            System.out.println("O resultado da subtração é: " +(sumOp(n1, n2)));

            isAValidOperation = true;;
        }

        if(operacao.equals("-")) {
            System.out.println("O resultado da subtração é: " +(subOp(n1, n2)));
            
            isAValidOperation = true;;
        }

        if(operacao.equals("*")) {
            System.out.println("O resultado da subtração é: " +(multOp(n1, n2)));

            isAValidOperation = true;;
        }

        if(operacao.equals("/")) {
            System.out.println("O resultado da subtração é: " +(divOp(n1, n2)));

            isAValidOperation = true;;
        }

        if(!isAValidOperation) {
            System.out.println("Oopração inválida, Tente novamente!");

        }

    }

    public static double sumOp(double n1, double n2){
        double calc;
        calc = n1 + n2;

        return calc;
    }

    public static double subOp(double n1, double n2){
        double calc;
        calc = n1 - n2;
        return calc;
    }

    public static double multOp(double n1, double n2){
        double calc;
        calc = n1 * n2;
        return calc;
    }

    public static double divOp(double n1, double n2){
        double calc;
        calc = n1 / n2;
        return calc;
    }

}

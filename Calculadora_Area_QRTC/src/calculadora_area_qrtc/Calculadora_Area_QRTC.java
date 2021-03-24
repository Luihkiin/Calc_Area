package calculadora_area_qrtc;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculadora_Area_QRTC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat ("#,##0.00");
        
        //Declaração de variáveis
        double valor1;
        double valor2;
        double resultado = 0;
        int objeto;
        
        //Finalidade
        System.out.println("Programa que calcula a área das seguintes formas: ");
        System.out.println("1 - Quadrado;");
        System.out.println("2 - Retângulo;");
        System.out.println("3 - Triângulo;");
        System.out.println("4 - Círculo.");
        System.out.println("");
        
        //Entrada da operação
        System.out.print("Entre com a forma que deseja calcular (1,2,3 ou 4): ");
        objeto = entrada.nextInt();
        System.out.println("");
        
        //Entrada de dados e processamento
        switch (objeto){
            case 1:
                //Quadrado
                System.out.println("Você escolheu o cálculo da área de um quadrado,");
                System.out.print("Insira o comprimento de seu lado (cm) : ");
                valor1 = entrada.nextDouble();
                resultado = valor1 * valor1;
                break;
            case 2:
                //Retângulo
                System.out.println("Você escolheu o cálculo da área de um retângulo,");
                System.out.print("Insira a altura (cm): ");
                valor1 = entrada.nextDouble();
                System.out.print("Agora, insira o comprimento de sua base (cm): ");
                valor2 = entrada.nextDouble();
                resultado = valor1 * valor2;
                break;
            case 3:
                //Triângulo
                System.out.println("Você escolheu o cálculo da área de um triângulo,");
                System.out.print("Insira a altura (cm): ");
                valor1 = entrada.nextDouble();
                System.out.print("Agora, insira o comprimento de sua base (cm): ");
                valor2 = entrada.nextDouble();
                resultado = (valor1 * valor2) / 2;
                break;
            case 4:
                //Círculo
                System.out.println("Você escolheu o cálculo da área do círculo,");
                System.out.print("Insira o raio (cm) ");
                valor1 = entrada.nextDouble();
                resultado = (Math.PI * Math.pow(valor1, 2));
            default:
                System.out.println("Operação inválida!!!");
                break;
        }
        //Saída
        
        if ((objeto == 1) || (objeto == 2) || (objeto == 3) || (objeto == 4)){
            System.out.println("O valor da área é: " +df.format(resultado) +" cm².");
        }else {
            System.out.println("Tente novamente.");
        }
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //Faça um Programa que peça as 4 notas bimestrais
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite a nota do primeiro bimestre: ");
       double bi1 = sc.nextDouble();
       System.out.println("Digite a nota do segundo bimestre: ");
       double bi2 = sc.nextDouble();
       System.out.println("Digite a nota do terceiro bimestre: ");
       double bi3 = sc.nextDouble();
       System.out.println("Digite a nota do quarto bimestre: ");
       double bi4 = sc.nextDouble();
       sc.close();
       //mostre a média.
       double media = (bi1 + bi2 + bi3 + bi4)/ 4;
       System.out.println("A média dos bimestres foi: " +media);
    }
}

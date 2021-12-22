package main.Main;

import javax.swing.JOptionPane;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        try {
            Scanner scanner = new Scanner(System.in);

            double desconto1 = 0.075;
            double desconto2 = 0.09;
            double desconto3 = 0.12;
            double desconto4 = 0.14;
            double descontoMax = 6433.57 * desconto4;
            double salarioInformado = 0.0;
            double inss = 0.0;
            double salarioFinal = 0.0;
            String nome = "";

            System.out.println("Digite o nome do funcionário: ");
            nome = scanner.nextLine();

            System.out.println("Informe o salário");
            salarioInformado = scanner.nextDouble();

            if (salarioInformado <= 1100.0) {
                inss = salarioInformado * desconto1;
                salarioFinal = salarioInformado - inss;

                System.out.println("Nome: " + nome);
                System.out.println("Salário Bruto: " + salarioInformado);
                System.out.println("Aliquota Aplicável: " + desconto1);
                System.out.println("Valor do INSS: " + inss);
                System.out.println("Salário Liquido: " + salarioFinal);


            } else if (salarioInformado <= 2203.48) {
                inss = salarioInformado * desconto2;
                salarioFinal = salarioInformado - inss;

                System.out.println("Nome: " + nome);
                System.out.println("Salário Bruto: " + salarioInformado);
                System.out.println("Aliquota Aplicável: " + desconto2);
                System.out.println("Valor do INSS: " + inss);
                System.out.println("Salário Liquido: " + salarioFinal);

            } else if (salarioInformado <= 3305.22) {
                inss = salarioInformado * desconto3;
                salarioFinal = salarioInformado - inss;

                System.out.println("Nome: " + nome);
                System.out.println("Salário Bruto: " + salarioInformado);
                System.out.println("Aliquota Aplicável: " + desconto3);
                System.out.println("Valor do INSS: " + inss);
                System.out.println("Salário Liquido: " + salarioFinal);

            } else if (salarioInformado <= 6433.57) {
                inss = salarioInformado * desconto4;
                salarioFinal = salarioInformado - inss;

                System.out.println("Nome: " + nome);
                System.out.println("Salário Bruto: " + salarioInformado);
                System.out.println("Aliquota Aplicável: " + desconto4);
                System.out.println("Valor do INSS: " + inss);
                System.out.println("Salário Liquido: " + salarioFinal);

            } else if (salarioInformado >= 6433.57) {

                salarioFinal = salarioInformado - descontoMax;

                System.out.println("Nome: " + nome);
                System.out.println("Salário Bruto: " + salarioInformado);
                System.out.println("Aliquota Aplicável: " + desconto4);
                System.out.println("Valor do INSS: " + descontoMax);
                System.out.println("Salário Liquido: " + salarioFinal);

            }
        }catch (NumberFormatException ne) {
            System.out.println("Erro de entrada inválida: " + ne.getMessage());
        } catch (NullPointerException nue) {
            System.out.println("Erro de entrada nula: " + nue.getMessage());
        } catch (Exception e) {
            // mostra os erros no console
            e.printStackTrace();
            //tratamento da exceção
            System.out.println("Mensagem do erro: " + e.getMessage()
                    + "\nClasse do erro: " + e.getClass());
        }
    }


}

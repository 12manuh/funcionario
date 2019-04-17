
package main;

import java.util.Scanner;

public class Funcionario {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double salariobase;

        CalcularSalario calculo = new CalcularSalario();

        String Nome = null, Cargo = null;
        System.out.println("Digite o nome do funcionário:");

        Nome = s.nextLine();

        calculo.funcionário(Nome);
        System.out.println("Digite o cargo do funcionário:");
        Cargo = s.nextLine();
        System.out.println("digite o salário do funcionário");
        salariobase = s.nextDouble();
        calculo.getDesconto(salariobase, Cargo);

    }

    private static class CalcularSalario {

        public CalcularSalario() {
        }

        private void funcionário(String Nome) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void getDesconto(double salariobase, String Cargo) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}


package CalcularSalario;
public class CalcularSalario{

    double salarioBaseDesconto;
    String nome;

    public void funcionário(String Nome) {
        this.nome = Nome;

        System.out.println("Nome :" + Nome);

    }

    public void getDesconto(double salarioBase, String cargo) {

        if (cargo.equals("DESENVOLVEDOR")) {
            if (salarioBase >= 3000) {
                salarioBaseDesconto = (salarioBase * 0.2) + salarioBase;
            } else if (salarioBase < 3000) {

                salarioBaseDesconto = (salarioBase * 0.1) + salarioBase;
            }
        }

        if (cargo.equals("DBA")) {
            if (salarioBase >= 2000) {
                salarioBaseDesconto = (salarioBase * 0.25) + salarioBase;
            } else if (salarioBase < 2000) {

                salarioBaseDesconto = (salarioBase * 0.15) + salarioBase;
            }
        }

        if (cargo.equals("TESTADOR")) {
            if (salarioBase >= 2000) {
                salarioBaseDesconto = (salarioBase * 0.25) + salarioBase;
            } else if (salarioBase < 2000) {

                salarioBaseDesconto = (salarioBase * 0.15) + salarioBase;
            }
        }

        if (cargo.equals("GERENTE")) {
            if (salarioBase >= 5000) {
                salarioBaseDesconto = (salarioBase * 0.30) + salarioBase;
            } else if (salarioBase < 5000) {

                salarioBaseDesconto = (salarioBase * 0.20) + salarioBase;
            }
        }

        System.out.println("Calculo do salário liquido é =" + salarioBaseDesconto);

    }
}
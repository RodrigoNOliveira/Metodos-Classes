import java.util.Scanner;

public class ContaCorrente {

    Scanner scanner = new Scanner(System.in);
    String nomeCliente;
    float saldo;
    float quantia;

    public ContaCorrente (String nomeCliente, float saldo){
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.quantia = 0;
    }


    public void sacar(boolean saque) {
        if (saque == true) {
            System.out.print("Digite a quantia a ser sacada:");
            quantia = scanner.nextFloat();
            if (quantia > saldo) {
                System.out.println();
                System.out.println("Valor invalido");
            } else {
                saldo = saldo - quantia;
                System.out.println();
                System.out.println("Saque realizado com sucesso, saldo atual: " + saldo);
            }
        } else {
        }
    }

    public void depositar(boolean deposito) {
        if (deposito == true) {
            System.out.println();
            System.out.print("Digite a quantia a ser depositada:");
            quantia = scanner.nextFloat();
            if (quantia <= 0) {
                System.out.println();
                System.out.println("Valor invalido");
            } else {
                saldo = saldo + quantia;
                System.out.println();
                System.out.println("Deposito realizado com sucesso, saldo atual: " + saldo);
            }
        }
    }

    public void transferir(boolean transferencia) {
        if (transferencia == true) {
            System.out.println();
            System.out.print("Digite a quantia a ser transferida:");
            quantia = scanner.nextFloat();
            if (quantia > saldo) {
                System.out.println();
                System.out.println("Valor invalido");
            } else {
                saldo = saldo - quantia;
                System.out.println();
                System.out.println("Transferencia realizada com sucesso, saldo atual: " + saldo);
            }
        }
    }

    public float pegaSaldo() {
        System.out.println();
        System.out.format("O seu saldo é de: %.2f\n", saldo);
        return saldo;

    }

    public static String simulaEmprestimo (float valorDesejo, float salario, int parcelas){
      String resposta = "";
      if (salario*0.25 < valorDesejo/parcelas){
        resposta = String.format("O valor desejado para emprestimo de %.2f não foi aceitado", valorDesejo );
      }
      else  if
        (salario*0.25 > valorDesejo/parcelas){
        resposta = String.format("O valor desejado para emprestimo de %.2f foi aceito", valorDesejo );
      }

      return resposta;


    }

}
public class Caneta {

    String marca;
    String cor;
    float ponta;
    boolean tampada;

    public Caneta(String marca, String cor, float ponta, boolean tampada){
        this.marca = marca;
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = tampada;
 
    }



    public void riscar() {
        if (tampada == true) {
            System.out.println("A caneta esta tampada, não é possivel riscar");
        } else {
            System.out.println("Riscando ...");
        }
    }

    public void destampar() {
        tampada = false;
        System.out.println("Destampando a caneta");
    }

    public void tampar() {
        tampada = true;
        System.out.println("Tampando a caneta");
    }

    public void condicao() {
        if (tampada == true) {
            System.out.println("A caneta esta tampada");
        } else {
            System.out.println("A caneta esta destampada");
        }
    }

    public String tinta(int qtdTinta) {
        String resposta = "";

        if (qtdTinta == 0) {
            resposta = String.format("A caneta %s está sem tinta", cor);
        } else if (qtdTinta == 1) {
            resposta = String.format("Sua caneta %s está com pouca tinta.", cor);
        } else if (qtdTinta == 2) {
            resposta = String.format("Sua caneta %s está com metade de tinha.", cor);
        } else if (qtdTinta == 3) {
            resposta = String.format("Sua caneta %s está com muita tinha", cor);
        } else {
            resposta = String.format("Parametro invalido");
        }

        return resposta;
    }



    public static void trocarRefil(){
      System.out.println("Refil trocado");
    }

}

public class Gato {

    String nome;
    String raca;
    float idade;
    float peso;
    char sexo;
    String corPelo;
    String corOlho;
    String tamanhoGato;
    String tamanhoPelo;
    String tamanhoRabo;
    String tamanhoOrelha;
    

    public Gato(String nome, String raca, float idade, float peso, char sexo, String corPelo, String corOlho, String tamanhoGato, String tamanhoPelo, String tamanhoRabo, String tamanhoOrelha){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
        this.corPelo = corPelo;
        this.corOlho = corOlho;
        this.tamanhoGato = tamanhoGato;
        this.tamanhoPelo = tamanhoPelo;
        this.tamanhoRabo = tamanhoRabo;
        this.tamanhoOrelha = tamanhoOrelha;
    }




    public void miar() {
        System.out.format("O gato %s esta miando: miau, miauu, miauuu\n", nome);

    }

    public void rosnar() {
        System.out.format("O gato %s esta rosnando: grrrr ... grrrr\n", nome);

    }

    public void ronronar() {
        System.out.format("O gato %s esta ronronando: room ... room ... roomm\n", nome);
    }

    public void carinho(boolean feliz) {
        if (feliz == true) {
            System.out.format("O gato %s esta calmo, pode acaricia-lo\n", nome);
        } else {
            System.out.format("O gato %s esta bravo, cuidado para não ser unhado\n", nome);
        }
    }

    public void limpo(boolean banho) {
        if (banho == true) {
            System.out.format("O gato %s está limpo\n", nome);
        } else {
            System.out.format("O gato %s está sujo, dê um banho nele\n", nome);
        }
    }


    public static void racao(float quilos){
          System.out.format("Você colocou %.2f de ração\n", quilos);
        }
    

}
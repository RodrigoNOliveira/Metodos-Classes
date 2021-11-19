public class Carro {

    String nome;
    String tipoCarro;
    String modelo;
    int ano;
    String fabricante;
    float motor;
    int portas;
    String cor;
    String combustivel;
    

    public Carro (String nome, String tipoCarro, String modelo, int ano, String fabricante, float motor, int portas,String cor, String combustivel){
        this.nome = nome ;
        this.tipoCarro = tipoCarro ;
        this.modelo = modelo ;
        this.ano = ano ;
        this.fabricante = fabricante ;
        this.motor = motor ;
        this.portas = portas;
        this.cor = cor;
        this.combustivel = combustivel ;
        

    }




    public void condicao(boolean ligado) {
        if (ligado == true) {
            System.out.println("Seu carro está ligado");
        } else {
            System.out.println("Seu carro está desligado");
        }
    }

    public void acelerar() {
        System.out.println("Seu carro está acelerando");
    }

    public void frear() {
        System.out.println("Seu carro está freando");
    }

    public void luz(int farol) {
        switch (farol) {

        case 0:
            System.out.println("Seu farol esta desligado.");
            break;

        case 1:
            System.out.println("Seu farol está baixo.");
            break;

        case 2:
            System.out.println("Seu farol está alto.");
            break;
        case 3:
            System.out.println("Seu farol está muito alto.");
            break;
        default:
            System.out.println("Falha no farol, procure assistencia tecnica");
            break;

        }
    }

    public static String abastecer ( float litros){

      String resposta = "";
            resposta = String.format("Seu tanque agora tem mais %.2f litros de combustivel" , litros);
        

        return resposta;
    } 
   

}
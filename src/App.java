class App {
    public static void main(String[] args) {



        // GATO

        Gato gato1 = new Gato("Harry", "Siamês", 2f, 3.5f, 'M', "marrom com branco", "verde", "médio", "curto", "médio", "pequena");
    
        
        System.out.println();
        System.out.format(
                "O gato %s da raça %s de %.1f anos de idade com o peso de %.2fkg e do sexo %c.\nTem o seu pelo da cor %s e o seu olho da cor %s.\nO tamanho do seu pelo é %s o do seu rabo é %s e da sua orelha é %s\n",
                gato1.nome, gato1.raca, gato1.idade, gato1.peso, gato1.sexo, gato1.corPelo, gato1.corOlho,
                gato1.tamanhoPelo, gato1.tamanhoRabo, gato1.tamanhoOrelha);

        System.out.println();
        gato1.miar();
        System.out.println();
        gato1.rosnar();
        System.out.println();
        gato1.ronronar();
        System.out.println();
        gato1.carinho(true);
        System.out.println();
        gato1.limpo(false);
        System.out.println();
        

        Gato.racao(12f);
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println();















        // CONTA CORRENTE

        ContaCorrente conta1 = new ContaCorrente("Rodrigo Nathan", 512f);

        System.out.format("Olá %s!\n\nSaldo atual: %.2f\n\n", conta1.nomeCliente, conta1.saldo);

        conta1.depositar(true);
        conta1.sacar(false);
        conta1.transferir(false);

        conta1.pegaSaldo();

        System.out.format("Resposta a simulação: \n%s", ContaCorrente.simulaEmprestimo(6000f, 2000f, 10));
        
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println();

















        // CARRO

        Carro carro1 = new Carro("Fiat toro", "Sport Utility Pick-Up", "4x4 turbo automatico",  2021,  "fiat", 2.0f, 4, "Branco perolado", "Diesel");
        

        System.out.format(
                "Seu carro é um(a) %s modelo %s do ano de %d. A classe do carro é %s e sua fabricante é a %s. O seu motor é um %.1f, ele possui %d portas é da cor %s e seu tipo de combustivel é %s\n",
                carro1.nome, carro1.modelo, carro1.ano, carro1.tipoCarro, carro1.fabricante, carro1.motor,
                carro1.portas, carro1.cor, carro1.combustivel);

        System.out.println();
        carro1.acelerar();
        System.out.println();
        carro1.frear();
        System.out.println();
        carro1.condicao(false);
        System.out.println();
        carro1.luz(2);
        System.out.println();
        System.out.format("Abastecer carro:\n %s", Carro.abastecer(12f));
        
        


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println();

        // CANETA

        Caneta caneta1 = new Caneta("bic", "verde", 2.0f, true);


        System.out.format("A sua caneta é %s da marca %s com a ponta %.1f\n", caneta1.cor, caneta1.marca,
                caneta1.ponta);
        System.out.println();
        caneta1.riscar();
        System.out.println();
        caneta1.destampar();
        System.out.println();
        caneta1.riscar();
        System.out.println();
        caneta1.condicao();
        System.out.println();
        caneta1.tampar();
        System.out.println();
        caneta1.condicao();
        System.out.println();
        System.out.println(caneta1.tinta(2));
        System.out.println();
        Caneta.trocarRefil();


    }
}
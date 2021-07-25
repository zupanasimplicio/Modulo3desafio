import java.util.List;

public class Sistema {


    public static void cadastroDeImovel(){
        IO.mostratexto( "Digitar o endereco ");
        String endereco = IO.criarvalor().next();
        IO.mostratexto(" Digitar o valor do aluguel ");
        double aluguel = IO.criarvalor().nextDouble();
        IO.mostratexto(" Funcionario ");
        String funcionario = IO.criarvalor().next();
        IO.mostratexto(" Digita qtd de moradores para o imovel ");
        int qtdDeMoradores =IO.criarvalor().nextInt();

        for (int i =0;i<qtdDeMoradores;i++){
            IO.mostratexto(" Digita nome do morador ");
            String nomeMorador = IO.criarvalor().next();
            IO.mostratexto(" Digita o cpf do morador ");
            String cpfMorador = IO.criarvalor().next();
            Morador morador = new Morador(nomeMorador,cpfMorador);

            Imovel.adicionarMorador(morador);

        }

        Imovel imovel = new Imovel(endereco,aluguel,funcionario);
        ListaDeImoveis.adicionarImovel(imovel);
    }


    public static void excluirCadastroPorCpf() throws Exception{
        System.out.println("Digite o cpf do cadastro que você quer exlcuir da lista");
        String cpf = IO.criarvalor().next();

    }

    public static void menu(){
        System.out.println("-------------");
        System.out.println("Digite 1 para cadastrar o  Imovel");
        System.out.println("Digite 2 para exibir os Valores dos Imoveis");
        System.out.println("Digite 3 para excluir CPF lista");
        System.out.println("Digite 4 para cadastrar  Endereço");
        System.out.println("Digite 5 para cadastrar Moradores");
        System.out.println("Digite 6 para cadastrar Funcionario Responsável ");
        System.out.println("Digite 7 para sair do programa");
        System.out.println("-------------");
    }

    public static void executarSistema() throws Exception{
        boolean executar = true;

        while (executar == true){
            menu();
            String opcaoEscolhida = IO.criarvalor().next();

            switch (opcaoEscolhida){
                case "1":
                    cadastroDeImovel();
                    break;

                case "2":
             ListaDeImoveis.mostrarListaDeImoveis();
                    break;

                case "3":
                    excluirCadastroPorCpf();
                    break;


            }



        }
    }
}






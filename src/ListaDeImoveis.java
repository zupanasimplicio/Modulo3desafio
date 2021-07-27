import java.util.ArrayList;
import java.util.List;

public class ListaDeImoveis {

    private static List<Imovel>imoveis =new ArrayList<>();

    public static void mostrarListaDeImoveis(){
        System.out.println(" Lista de imoveis ");
        for (Imovel imovel: imoveis) {
            imovel.exibirValoresDosImoveis();
        }
    }
    public static void adicionarImovel(Imovel imovel){
        imoveis.add(imovel);
    }

    public static void excluirMoradorPorCpf(String cpfMorador){
        Morador moradorExcluir = new Morador();
        for (Imovel imovel: imoveis) {
            for (int index = 0;index <imovel.getMoredoresImovel().size();index++){
                Morador morador = imovel.getMoredoresImovel().get(index);
                if (morador.getCpf().equals(cpfMorador)) {
                    System.out.println("cpf do morador " + moradorExcluir.getCpf());
                    imovel.getMoredoresImovel().remove(morador);
                }
            }
        }
        mostrarListaDeImoveis();
    }
}

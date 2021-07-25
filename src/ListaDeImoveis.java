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

}

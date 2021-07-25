import java.util.ArrayList;
import java.util.List;

public class Imovel {

    private String endereco;
    private double precoAluguel;
    private String funcionario;
    private static List<Morador>moredoresImovel =new ArrayList<>();

    public Imovel() {
    }

    public Imovel( String endereco, double precoAluguel, String funcionario){
        this.endereco = endereco;
        this.precoAluguel = precoAluguel;
        this.funcionario = funcionario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public double getPrecoAluguel() {
        return precoAluguel;
    }

    public void setPrecoAluguel(double precoAluguel) {
        this.precoAluguel = precoAluguel;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public List<Morador> getMoredoresImovel() {
        return moredoresImovel;
    }
    public static void exibirMoradores(){
        for (Morador morador:moredoresImovel) {
            System.out.println("nome morador: "+morador.getNome());

        }
    }
    public static void adicionarMorador(Morador morador){
        moredoresImovel.add(morador);
    }

    public void setMoredoresImovel(List<Morador> moredoresImovel) {
        this.moredoresImovel = moredoresImovel;
    }
    public void exibirValoresDosImoveis() {
        System.out.println("Endereco imovel "+ this.endereco);
        System.out.println("Valor do aluguel é"+this.precoAluguel);
        System.out.println("Funcionario responsavel pelo imovel"+this.funcionario);
        this.exibirMoradores();
    }
}

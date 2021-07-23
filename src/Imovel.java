import java.util.List;

public class Imovel {

    private String endereco;
    private double precoAluguel;
    private String funcionario;
    private List<Morador>moredoresImovel;

    public Imovel() {
    }

    public Imovel( String endereco, double precoAluguel, String funcionario, List<Morador> moredoresImovel) {
        this.endereco = endereco;
        this.precoAluguel = precoAluguel;
        this.funcionario = funcionario;
        this.moredoresImovel = moredoresImovel;
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

    public void setMoredoresImovel(List<Morador> moredoresImovel) {
        this.moredoresImovel = moredoresImovel;
    }
}

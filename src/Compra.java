public class Compra {

    private String descricao;
    private double Valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.Valor = valor;

    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return Valor;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "descricao='" + descricao + '\'' +
                ", Valor=" + Valor +
                '}';
    }
}

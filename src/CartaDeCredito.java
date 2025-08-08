import java.util.ArrayList;
import java.util.List;

public class CartaDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;  // ✅ Importante: iniciar saldo igual ao limite
        this.compras=new ArrayList<>();

    }
    public boolean lancaCompras(Compra compra){
        if (this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }

        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
public class Canela extends AdicionalDecorator {

    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com Canela";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.0;
    }
}
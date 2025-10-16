public class Chocolate extends AdicionalDecorator{
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com Chocolate";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.5;
    }
}

public abstract  class AdicionalDecorator implements Bebida{
    protected Bebida bebida;

    public AdicionalDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public abstract String getDescricao();

    @Override
    public abstract double getPreco();
}

package model;

public class Mago extends Heroi{
    public Mago(String n, int i) {
        super(n, i);
        setTipo("Mago");
    }

    @Override
    public void atacar() {
        System.out.printf("O %s atacou usando magia!\n", getTipo());
    }
}

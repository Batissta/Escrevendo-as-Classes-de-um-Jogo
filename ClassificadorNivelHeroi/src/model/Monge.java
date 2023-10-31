package model;

public class Monge extends Heroi{
    public Monge(String n, int i) {
        super(n, i);
        setTipo("Monge");
    }

    @Override
    public void atacar() {
        System.out.printf("O %s atacou usando artes marciais!\n", getTipo());
    }
}

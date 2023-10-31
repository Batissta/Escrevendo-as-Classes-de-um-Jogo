package model;

public class Ninja extends Heroi{
    public Ninja(String n, int i) {
        super(n, i);
        setTipo("Ninja");
    }

    @Override
    public void atacar() {
        System.out.printf("O %s atacou usando shurikens!\n", getTipo());
    }
}

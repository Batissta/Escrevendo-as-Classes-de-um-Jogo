package model;

public class Guerreiro extends Heroi{
    public Guerreiro(String n, int i) {
        super(n, i);
        setTipo("Guerreiro");
    }

    @Override
    public void atacar() {
        System.out.printf("O %s atacou usando espada!\n", getTipo());
    }
}

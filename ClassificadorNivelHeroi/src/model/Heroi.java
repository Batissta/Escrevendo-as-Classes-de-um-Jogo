package model;

public abstract class Heroi {
    private String nome;
    private int idade;
    private String tipo;

    public Heroi(String n, int i){
        this.setNome(n);
        this.setIdade(i);
    }
    public abstract void atacar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static void main(String[] args) {
        Heroi mago = new Mago("Azkaban", 58);
        Heroi guerreiro = new Guerreiro("Meliodas", 42);
        Heroi monge = new Monge("Jackie Chan", 36);
        Heroi ninja = new Ninja("Naruto", 31);

        mago.atacar();
        guerreiro.atacar();
        monge.atacar();
        ninja.atacar();
    }
}

public class Passarinho extends Animal {

    public Passarinho(String nome, int idade, TipoAnimal tipo) {
        super(nome, idade, tipo);
    }

    @Override
    public void emitirSom() {
        System.out.println("O PAPACAPIM DUS MEUS SONHIU");
    }

    @Override
    public void Comer() {
        System.out.println("Passarinho Comendo");
    }
}

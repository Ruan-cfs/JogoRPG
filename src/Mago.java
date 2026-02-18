public class Mago extends Personagem{
    protected int mana=200;
    public Mago(String nome){
        super(nome,100,250);
    }

    public void atacar(Personagem alvo) {
        this.mana -= 95;

        if (this.mana == 0){
            System.out.println("Você está sem mana para atacar!");
        } else {
            System.out.println(this.nome + " conjurou a Ira Divina e caíram raios do céu atacando " + alvo.nome + "!");

            int danoCausado = this.forca;
            alvo.receberDano(danoCausado);
        }
    }

}


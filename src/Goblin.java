public class Goblin extends Personagem{
    protected int danoCausado=0;
    public Goblin(String nome){
        super(nome,500,300);
    }

    public void atacar(Personagem alvo) {
        System.out.println(this.nome + " avança com seu machado de guerra contra " + alvo.nome + "!");

        this.danoCausado = this.forca/3;
        alvo.receberDano(this.danoCausado);
    }

    public void receberDano(int dano) {
        super.receberDano(dano);
    }
}

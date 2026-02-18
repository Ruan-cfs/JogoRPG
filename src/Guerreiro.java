public class Guerreiro extends Personagem{

    public Guerreiro(String nome){
        super(nome,150,100);
    }

    public void atacar(Personagem alvo){
        System.out.println(this.nome + " Avança com sua espada contra " + alvo.nome + "!");

        int danoCausado = this.forca;
        alvo.receberDano(danoCausado);
    }



}


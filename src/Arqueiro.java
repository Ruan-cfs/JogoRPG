public class Arqueiro extends Personagem{

    public Arqueiro(String nome){
        super(nome,100,80);
    }

    public void atacar(Personagem alvo){
        System.out.println(this.nome + " atira suas flechas contra " + alvo.nome + "!");

        int danoCausado = this.forca;
        alvo.receberDano(danoCausado);
    }

}


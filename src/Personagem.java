public abstract class Personagem {
    protected String nome= "";
    protected int vida=0;
    protected int forca=0;
    public Personagem(String nome, int vida, int forca){
        this.nome=nome;
        this.vida=vida;
        this.forca=forca;

    }
    public void receberDano(int dano){
        if (this.vida >= dano) {
            this.vida -= dano;
        }else{
            this.vida=0;
        }


        if (this.vida <=0){
            System.out.print("\nVocê foi derrotado!\n");
        }
    }

    public abstract void atacar(Personagem alvo);

    public  void status(){
        System.out.println("--- Status ---");
        System.out.println("Nome: " + nome + " | Vida: " + vida);
    }


}

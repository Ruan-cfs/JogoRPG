public class Main {
    public static void main(String[] args) {

        Guerreiro guerreiro = new Guerreiro("Alastor, o nobre Guerreiro");
        Arqueiro arqueiro = new Arqueiro("Hélios, Arqueiro de Solaria");
        Mago mago = new Mago("Orion, o senhor dos raios");
        Tank tank = new Tank("Atlas, o escudo de ferro");
        Goblin vilao = new Goblin("Zorg, o terrivel");

        System.out.println("--- O COMBATE COMEÇA NA FLORESTA SOMBRIA --- \n");

        vilao.atacar(tank);
        tank.status();
        System.out.println();

        arqueiro.atacar(vilao);
        mago.atacar(vilao);
        guerreiro.atacar(vilao);
        guerreiro.atacar(vilao);

        System.out.println("\n--- RESULTADO FINAL DA BATALHA ---");

        vilao.status();


    }
}

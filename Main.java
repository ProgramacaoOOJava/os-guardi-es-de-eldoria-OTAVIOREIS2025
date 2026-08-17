public class Main {
    public static void main(String[] args) {
        Personagem h1 = new Personagem();
        h1.nome = "Arthus";
        h1.classe = "Guerreiro";
        h1.nivel = 10;
        h1.pontosDeVida = 150;
        h1.poderBase = 25.5;

        Personagem h2 = new Personagem();
        h2.nome = "Jaina";
        h2.classe = "Mago";
        h2.nivel = 12;
        h2.pontosDeVida = 90;
        h2.poderBase = 40.0;
             
        h1.exibirStatus();
        h2.exibirStatus();   

    }
}

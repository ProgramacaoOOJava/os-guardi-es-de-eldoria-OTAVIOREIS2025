// Classe principal do programa
public class Main {

    public static void main(String[] args) {
        // Cria um vetor de Personagem contendo
        // objetos de diferentes subclasses
        Personagem[] grupo = {
            new Guerreiro("Arthus"),
            new Mago("Elenara")
        };

        // Percorre todos os personagens do grupo
        for (Personagem p : grupo) {

            // Exibe o status do personagem
            p.exibirStatus();

            // Executa a habilidade especial
            // correspondente ao tipo real do personagem
            p.usarHabilidadeEspecial();





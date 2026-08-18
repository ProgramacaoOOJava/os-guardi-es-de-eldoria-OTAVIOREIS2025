public abstract class Personagem {

    // Atributo comum todos os personagens
    protected String nome;

    // Construtor da classe Personagem
    public Personagem(String nome){
        this.nome = nome;
    }
    
    // Método para exibir informações comuns do personagem
    public void exibirStatus(){
        System.out.println("Nome: " + nome);
    }
}


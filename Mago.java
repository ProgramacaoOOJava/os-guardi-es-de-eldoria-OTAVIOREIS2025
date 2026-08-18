// Subclasse Mago que herda de Personagem
public class Mago extends Personagem {

// Atributo próprio do Mago
    private int mana;

 // Construtor do Mago
    public Mago(String nome) {  
 
        // Chama o construtor da classe Personagem
        super(nome); 

        // Define a mana inicial do Mago
        this.mana = 100;
    }

    // Sobrescreve o método de exibição de status
    @Override
    public void exibirStatus() {

        System.out.println("=== MAGO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Mana: " + mana);
    }
    }      



public class User {
    private String nome;
    private int eta;

// Istanza statica privata Singleton
    private static User istanzaUnica;

// Costruttore privato Singleton
    private User(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

// Metodo per ottenere l'istanza Singleton
    public static User getIstanza(String nome, int eta) {
        if (istanzaUnica == null) {   //Crea nuova istanza solamente se non esistente
            istanzaUnica = new User(nome, eta);
        }
        return istanzaUnica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
// Funzione per informazioni di età e nome.
    public void stampaInformazioni() {
        System.out.println("Nome: " + nome + ", Età: " + eta);
    }
}

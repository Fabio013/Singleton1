public class Main {
    public static void main(String[] args) {

// Creo prima istanza di User utilizzando il metodo getInstance
        User user1 = User.getIstanza("Mario", 32);
// Stampa delle informazioni di default del primo utente
        user1.stampaInformazioni();

// Creo seconda istanza di User
        User user2 = User.getIstanza("Luca", 27);
// Modifico le informazioni del secondo utente
        user2.setNome("Carlo");
        user2.setEta(70);

// Stampo informazioni del secondo utente
        user2.stampaInformazioni();

// Stampo nuovamente il primo utente per provare che la modifica fatta alla seconda istanza abbia influito anche sulla prima
        user1.stampaInformazioni();
    }
}
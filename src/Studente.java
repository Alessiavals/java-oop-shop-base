public class Studente {
    
    public String nome;
    public String cognome;
    public int eta;

    public Studente (String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public void setStudente () {
        if (eta < 0) {
            System.out.println("Non è un'età valida.");
        } else {
        System.out.println("Lo studente si chiama " + nome + " " + cognome + " e ha " + eta + " anni.");
    }}

}

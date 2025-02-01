public class Prodotto {
    
    public int codice;
    public String nome;
    public String descrizione;
    public int prezzo;
    public int iva;


    // costruttore 
    
    public Prodotto() {
        
    }

    // metodo per il prezzo

    public int getPrezzoBase() {
        return prezzo;
    }

    // metodo che mi restituisce il prezzo

    public int getPrezzoPiuIva() {
            return prezzo + (prezzo * iva / 100);
        
    }

    public void setDescrizione() {
        System.out.println("Questo prodotto è: " + descrizione);
    }

    // assegno il nome del prodotto

    public String getNomeProdotto() {
        return nome + codice;
    }
}

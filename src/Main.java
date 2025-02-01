


public class Main {

    public static void main(String[] args) {
        
        // VALORIZZO PIASTRA 

        Prodotto piastra = new Prodotto();
        piastra.nome = "GHD-";
        piastra.codice = 12345;
        piastra.descrizione = "Piastra-Lisciante";
        piastra.prezzo = 200;
        piastra.iva = 22;

        // PRESENTO IL PRODOTTO PIASTRA
        
        System.out.println("Il nostro prodotto si chiama " + piastra.getNomeProdotto());
        piastra.setDescrizione();
        System.out.println("Il prezzo base della piastra è " + piastra.getPrezzoBase() + " euro");
        System.out.println("Il totale compreso di iva del 22% è " + piastra.getPrezzoPiuIva() + " euro");


        System.out.println("------------Passiamo al prossimo prodotto:-------------");


        // VALORIZZO SHAMPOO

        Prodotto shampoo = new Prodotto();
        shampoo.nome = "Pantene";
        shampoo.codice = 67890;
        shampoo.descrizione = "Idratante-Rinforzante";
        shampoo.prezzo = 10;
        shampoo.iva = 22;

        // PRESENTO IL PRODOTTO SHAMPOO

        System.out.println("Questo prodotto si chiama " + shampoo.getNomeProdotto());
        shampoo.setDescrizione();
        System.out.println("Il prezzo base è "+ shampoo.getPrezzoBase() + " euro");
        System.out.println("Compreso di iva del 22% è " + shampoo.getPrezzoPiuIva() + " euro");
    }
}

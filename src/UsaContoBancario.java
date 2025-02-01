
public class UsaContoBancario {
    public static void main(String[] args) {
        
       ContoBancario contoCorrente = new ContoBancario("ITNFSIFNFRSO");
       System.out.println("Al momento il conto è di " + contoCorrente.saldo + " EUR");

       // deposito soldi

       contoCorrente.setDeposito(50);
       contoCorrente.setPreleva(20);
       System.out.println("Il saldo finale è di " + contoCorrente.getSaldoFinale() + " EUR");
    }
}

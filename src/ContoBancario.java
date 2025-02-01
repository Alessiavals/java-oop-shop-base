public class ContoBancario {
    
    public String conto;
    public double saldo;


    // costruttore

    public ContoBancario (String conto) {
        this.conto = conto;
        this.saldo = 0.0;
    }

    // metodo per il deposito

    public void setDeposito(double numeroDeposito) {
        if (numeroDeposito > 0) {
            saldo+= numeroDeposito;
            System.out.println("Hai depositato " + numeroDeposito + " EUR");
        } else {
            System.out.println("Non hai depositato nulla");
        }
    }

    // metodo per il prelievo

    public void setPreleva(double numeroPrelievo) {
        if (numeroPrelievo > 0) {
            saldo-=numeroPrelievo;
            System.out.println("Hai prelevato " + numeroPrelievo + " EUR");
        } else {
            System.out.println("Non hai prelevato nulla");
        }
    }

    // metodo per ottenere saldo finale

    public double getSaldoFinale() {
        return saldo;
    }

   
}


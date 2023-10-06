package tpCompte;




public class Versement extends Operation{
    public Versement(double montant) {
        super(montant);
    }

    @Override
    public String toString() {
        return "Verser ";
    }
}

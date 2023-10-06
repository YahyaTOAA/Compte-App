package tpCompte;



public class Retrait extends Operation{
    public Retrait(double montant) {
        super(montant);
    }

    @Override
    public String toString() {
        return "Retrait ";
    }
}

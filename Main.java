package tpCompte;

import static tpCompte.Compte.listOperation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        CompteCourant c1 = new CompteCourant(1500,2000);
        CompteEpargne c2 = new CompteEpargne(1000,5);

        try {
            c1.verser(2000);
            c1.retirer(1000);
            c1.verser(100);
            c1.retirer(15);
            c1.verser(1440);
            c1.retirer(2600);
            c1.verser(4000);
            c1.retirer(6600);

            c1.versement(500, c2);
            c2.updateSolde(5);

            System.out.println("solde compte courant: " + c1.consulterSolde());
            System.out.println("solde compte epargne: " + c2.consulterSolde());


            System.out.println(c1.totalVersements());
            System.out.println(c1.totalRetraits());


            FileWriter historique = new FileWriter("C:/Users/ManagerY/AndroidStudioProjects/MyApplication/app/src/androidTest/java/tpCompte/Client1.txt");
            BufferedWriter out = new BufferedWriter(historique);
            for (Operation operation : listOperation) {
                if (operation instanceof Retrait){
                    out.write("Numero :"+operation.getNumero() + " Au " + operation.getDateOperation() +" "+operation.toString()+" De " + operation.getMontant()+" DH\n");
                }else if (operation instanceof Versement){
                    out.write("Numero :"+operation.getNumero() + " Au " + operation.getDateOperation() +" "+operation.toString()+ " De " + operation.getMontant()+" DH\n");
                }

            }
            out.close();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("Erreur" + e.getMessage());
        }
    }
}

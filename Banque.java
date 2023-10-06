//package tpCompte;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Banque {
//    private List<Compte> listCompte;
//    public void Banque(){
//        this.listCompte=new ArrayList<>();
//    }
//    public int IndiceCompte(int codc){
//        for (Compte compte:listCompte) {
//            if (listCompte.contains(listCompte.get(compte).getCode())){
//                return listCompte.indexOf(listCompte.get());
//            }else {
//                return -1;
//            }
//        }
//
//        return 0;
//    }
//    public void ajouter(Compte compte)throws Exception{
//        if (listCompte.contains(compte)){
//            throw new Exception("compte deja existe");
//        }else{
//            listCompte.add(compte);
//        }
//    }
//    public void supprimer(int code)throws  Exception{
//        if (listCompte.contains(listCompte.get(code))){
//            listCompte.remove(code);
//        }else{
//            throw new Exception("compte n'existe pas");
//        }
//    }
//    public int nombreDesComptesCourant(){
//        int nombreDesComptesCourant=0;
//        for (Compte compte:listCompte) {
//            nombreDesComptesCourant+=listCompte.indexOf(compte);
//        }
//        return nombreDesComptesCourant;
//    }
//}

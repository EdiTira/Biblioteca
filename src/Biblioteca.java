import java.util.*;

public class Biblioteca {
    public List<Carte> carti;
    public Map<String, Carte> mapCarti;

    public Biblioteca(ArrayList<Carte> carti) {
        this.carti = carti;
    }

    public void adaugare(Carte carte, String titlu){
        this.carti.add(carte);
        this.mapCarti.put(titlu, carte);
    }

    public void afisareBiblioteca(){
        System.out.println("BIBLIOTECA: ");
        //this.carti.forEach(Carte::afisare);
        for( Carte carte : carti ){
            carte.afisare();
        }
    }

    public void sortare(){
        this.carti.sort(Comparator.comparing(Carte::getAutor).thenComparing(Carte::getTitlu));
    }

}

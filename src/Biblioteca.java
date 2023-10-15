import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Carte> carti;

    public Biblioteca(ArrayList<Carte> carti) {
        this.carti = carti;
    }

    public void afisareBiblioteca(Biblioteca biblioteca){
        System.out.println(biblioteca.carti);
    }

    public void sortare(String autor, String titlu){
        this.carti.sort()
    }

}

import java.util.ArrayList;
import java.util.List;

public class Carte {
    public String autor;
    public String titlu;

    public List<Pagina> pagini;

    public Carte(String autor, String titlu, ArrayList<Pagina> pagini) {
        this.autor = autor;
        this.titlu = titlu;
        this.pagini = pagini;
    }

    public void afisare(){
        System.out.println(this.autor);
        System.out.println("----------");
        System.out.println(this.titlu);
        //this.pagini.forEach(Pagina::afisare);
        for( Pagina pagina : pagini){
            pagina.afisare();
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public List<Pagina> getPagini() {
        return pagini;
    }

    public void setPagini(List<Pagina> pagini) {
        this.pagini = pagini;
    }

    public void sortare(String autor, String titlu){

    }
}

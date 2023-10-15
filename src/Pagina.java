import java.util.ArrayList;

public class Pagina {
    public Integer nr;
    public String content;

    public Pagina(Integer nr, String content) {
        this.nr = nr;
        this.content = content;
    }

    public Integer getNr() {
        return nr;
    }

    public void setNr(Integer nr) {
        this.nr = nr;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void afisarePagina(){
        System.out.println("Content: " + this.content);
        System.out.println("Nr: " + this.nr);
    }
}

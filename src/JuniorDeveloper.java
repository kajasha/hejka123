/**
 * Created by michalina on 26/08/16.
 */
public class JuniorDeveloper {
    private String name;
    private int doswiadczenie;
    private boolean praca;


    public JuniorDeveloper(String name,  int doswiadczenie, boolean praca) {
        this.name = name;
        this.doswiadczenie = doswiadczenie;
        this.praca = praca;
    }

    public int getDoswiadczenie() {
        return doswiadczenie;
    }


    public boolean jestzajebisty() {
        return false;
    }

    public boolean maKase() {
        return false;
    }
}


/**
 * Created by michalina on 26/08/16.
 */
public class SeniorDeveloper extends JuniorDeveloper {


    private boolean zrozumienieGeekowychZartow;

    public SeniorDeveloper(String name, int doswiadczenie, boolean praca, boolean zrozumienieGeekowychZartow) {
        super(name, doswiadczenie, praca);
        this.zrozumienieGeekowychZartow = zrozumienieGeekowychZartow;
    }



    public boolean jestzajebisty() {
        return true;
    }

    public boolean maKase() {
        return true;
    }

    public boolean jestMiszczem() {
        if(getDoswiadczenie()>10){
            return true;
        }
        return false;
    }


}

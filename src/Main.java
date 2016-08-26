public class Main {

    public static void main(String[] args) {


        try {
            String a = null;
            System.out.println("Hejka Świecie!");
        } catch (NullPointerException e) {
            System.out.println("Żegnaj Świecie!");
        }


    }

    public void Dog() {
        try {
            int cat[] = new int[12];
            cat[16] = 12;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("whaju?");
        }
    }
}

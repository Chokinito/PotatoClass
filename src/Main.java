public class Main {
    public static void main(String[] args) {
        Potato miPotato = new Potato();
        miPotato.quitarbrazos();
        miPotato.quitarbrazos();
        miPotato.quitarbrazos();
        System.out.println(miPotato.brazos);
    }
}
        class Potato{

            public int brazos = 0;
            public void quitarbrazos(){

                this.brazos--;
            }
        }
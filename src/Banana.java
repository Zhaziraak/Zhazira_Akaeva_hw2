public class Banana extends Fruits {
    private String polza ;
    private String calory;

    public Banana(String polza, String calory) {
        this.polza = polza;
        this.calory = calory;
    }

    @Override
    public void print() {
        System.out.println("Банан богат многими витаминами, и также "
        + polza + ". Ещё содержит " +  calory + ".");
    }
}

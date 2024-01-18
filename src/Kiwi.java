
public class Kiwi extends Fruits {
    private String heal;
    private String from;

    public Kiwi(String heal, String from) {
        this.heal = heal;
        this.from = from;
    }

    @Override
    public void print() {
        System.out.println("Киви является " + heal +
                "ом. Его родиной является " + from + ".");
    }
}

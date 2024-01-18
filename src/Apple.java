public class Apple extends Fruits {
    private String vitam;
    private String useful;

    public Apple(String vitam, String useful) {
        this.vitam = vitam;
        this.useful = useful;
    }

    @Override

    public void print() {
        System.out.println("Яблоко содержит " + vitam +
                " и " + useful + ".");
    }
}

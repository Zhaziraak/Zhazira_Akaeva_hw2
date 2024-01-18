public class Main {
    public static void main(String[] args) {
        createObjects("Apple");
        createObjects("Kiwi");
        createObjects("Banana");

        Printable [] printables = {createObjects("Apple"),
                createObjects("Kiwi"),
                createObjects("Banana")};
        for (Printable printable: printables) {
            printable.print();
        }
    }

    public static Fruits createObjects (String className){
        switch (className)
        {
            case "Apple":
                return new Apple("витамин С", "Калий");
            case "Kiwi":
                return new Kiwi("антиоксидант", "Китай");
            case "Banana":
                return new Banana("снижает риск инсульта", "много калорий");
        }
        return null;
    }
}
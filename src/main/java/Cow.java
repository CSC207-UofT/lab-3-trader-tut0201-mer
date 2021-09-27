public class Cow implements Tradable, Domesticatable {
    @Override
    public String sound() {
        return "Moo!";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}

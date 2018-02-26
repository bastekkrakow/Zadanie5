public class Main {

    public static void main(String[] args) {
Product banany = new Product("Banan1", "Zielone", "Do hurtowni");

Guarantee guarantee = new Guarantee(20180230, banany);
        System.out.println(guarantee.isValid(banany));


    }
}

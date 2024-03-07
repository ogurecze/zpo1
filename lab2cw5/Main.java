public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println(shop.doCalculate(new Client("PL")));
        System.out.println(shop.doCalculate(new Client("GER")));
        System.out.println(shop.doCalculate(new Client("GB")));
    }
}
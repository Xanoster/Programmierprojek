public class cookieCaper {

    static class Baker {
        String name;
        String bakeryName;

        Baker(String name, String bakeryName) {
            this.name = name;
            this.bakeryName = bakeryName;
        }

        void bakeCookies() {
            System.out.println(name + " baking cookies in " + bakeryName);
        }

    }

    static class Customer {
        String name;
        int favCookies;

        Customer(String name, int favCookies) {
            this.name = name;
            this.favCookies = favCookies;
        }

        void placeOrder() {
            System.out.println(name + " placed order of " + favCookies);
        }
    }

    static class Cookie {
        String flavor;
        int quantity;

        Cookie(String flavor, int quantity) {
            this.flavor = flavor;
            this.quantity = quantity;
        }

        void order() {
            System.out.println(quantity + " " + flavor + " is ready");
        }
    }

    public static void main(String[] args) {
        Baker sarah = new Baker("Sarah", "Choco Bakery");
        Customer alex = new Customer("ALEX", 12);
        Cookie choco = new Cookie("chocolate", 12);

        sarah.bakeCookies();
        alex.placeOrder();
        choco.order();
    }
}
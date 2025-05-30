public class farmersMarket {

    static class Vendor {
        String name;
        String specialty;

        Vendor(String name, String specialty) {
            this.name = name;
            this.specialty = specialty;
        }

        void prepareProduce() {
            System.out.println(name + " is preparing fresh " + specialty + ".");
        }
    }

    static class Customer {
        String name;
        int quantityOrdered;

        Customer(String name, int quantityOrdered) {
            this.name = name;
            this.quantityOrdered = quantityOrdered;
        }

        void placeOrder() {
            System.out.println(name + " places an order for " + quantityOrdered + " quarts of strawberries.");
        }
    }

    static class Produce {
        String type;
        String quality;

        Produce(String type, String quality) {
            this.type = type;
            this.quality = quality;
        }

        void pack() {
            System.out.println("Packing " + quality + " " + type + " into containers.");
        }
    }

    public static void main(String[] args) {
        Vendor maria = new Vendor("Maria", "organic strawberries");
        Customer sam = new Customer("Sam", 2);
        Produce strawberries = new Produce("strawberries", "ripe red");

        sam.placeOrder();
        maria.prepareProduce();
        strawberries.pack();

        System.out.println("Sam enjoys the fresh aroma of the strawberries.");
        System.out.println(maria.name + " smiles, happy with her customers.");
    }
}

/**
 * Part of complex system
 */

class Deliver {
    void send(Shipment shipment) {
        System.out.println("Shipment with " + shipment.getGoods().getName() +
                " sent to " + shipment.getAddress());
    }
}

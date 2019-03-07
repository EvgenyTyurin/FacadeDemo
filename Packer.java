/**
 * Part of complex system
 */

class Packer {
    Shipment pack(Goods goods, String address) {
        System.out.println(goods.getName() + " packed and signed to " + address);
        return new Shipment(goods, address);
    }
}

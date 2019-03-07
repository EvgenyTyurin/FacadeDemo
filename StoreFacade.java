/**
 * Facade
 */

class StoreFacade {
    void order(String goodsStr, String address){
        Storage storage = new Storage();
        Goods goods = storage.getGoods(goodsStr);
        Packer packer = new Packer();
        Shipment shipment = packer.pack(goods, address);
        Deliver deliver = new Deliver();
        deliver.send(shipment);
    }
}

class Shipment {
    private Goods goods;
    private String address;

    Shipment(Goods goods, String addres) {
        this.goods = goods;
        this.address = addres;
    }

    Goods getGoods() {
        return goods;
    }

    String getAddress() {
        return address;
    }
}

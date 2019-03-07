/**
 * Part of complex system
 */

class Storage {
    Goods getGoods(String name) {
        System.out.println("Storage find good " + name);
        return new Goods(name);
    }
}

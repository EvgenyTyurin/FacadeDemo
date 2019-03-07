/**
 * Facade pattern demo
 * Mar 2019 Evgeny Tyurin
 * Complex classes online store system(Storage, Packer Deliver) was facaded by
 * simple StoreFacade that can just order Iphone X in one click
 */

public class FacadeDemo {
    /** Run point */
    public static void main(String[] args) {
        StoreFacade storeFacade = new StoreFacade();
        storeFacade.order("IPhone X", "London, Baker street 22b");
    }
}

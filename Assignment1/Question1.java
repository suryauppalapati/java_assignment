abstract class Apple {
    abstract void release();
}

class Iphone13 extends Apple {
    void release() {
        System.out.println("Iphone13 Released..");
    }
}
 
interface Laptop {
    void release();
}
class M1 implements Laptop {
    public void release() {
        System.out.println(" M1 released..");
    }
}

class MacbookPro implements Laptop {
    public void release() {
        System.out.println("Macbook Pro released..");
    }
}

class Question1 {
    public static void main(String args[]) {
        Apple i13 = new Iphone13();
        Laptop mbookpro = new MacbookPro();
        Laptop m1 = new M1();
        
        i13.release();
        mbookpro.release();
        m1.release();
    }
}

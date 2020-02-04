package chapter9.exercise;

public class TasterTester {

    public static void main(String[] args){

        Cake cake = new Cake("chocolate");
        cake.setPrice(29.99);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        BirthdayCake bCake = new BirthdayCake();
        bCake.setFlavor("ojete");
        bCake.setPrice(49.95);
        System.out.println("Birthday cake flavor: " + bCake.getFlavor());
        System.out.println("Birthday cake price: " + bCake.getPrice());

        WeddingCake wCake = new WeddingCake();
        wCake.setFlavor("white chocolate");
        wCake.setPrice(99.99);
        System.out.println("Wedding cake flavor: " + wCake.getFlavor());
        System.out.println("Wedding cake price: " + wCake.getPrice());

    }

}

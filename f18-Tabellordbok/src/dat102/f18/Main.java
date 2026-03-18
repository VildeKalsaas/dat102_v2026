package dat102.f18;

public class Main {

    public static void main(String[] args) {

        TabellOrdbok<Integer, String> hm = new TabellOrdbok<>(100);
        Integer tall = 15;
        String s = new String("femten");
        hm.leggTil(tall, s);

        String gmlVerdi = hm.leggTil(tall, "Femten");
        System.out.println(gmlVerdi);

        System.out.println(hm.getVerdi(tall));

    }

}

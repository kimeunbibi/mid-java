package enumeration.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;
        System.out.println("basic : " + Grade.BAISC.discount(price));
        System.out.println("gold : " + Grade.GOLD.discount(price));
    }
}

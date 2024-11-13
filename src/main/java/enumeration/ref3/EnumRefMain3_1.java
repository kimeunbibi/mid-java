package enumeration.ref3;

import enumeration.ex3.DiscountService;
import enumeration.ex3.Grade;

public class EnumRefMain3_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
    }
}

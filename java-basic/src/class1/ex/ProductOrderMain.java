package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        // 상품 주문 정보를 "productOrder" 타입의 변수로 받아 저장
        // 상품 주문 정보와 최종 금액 출력
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        ProductOrder order2 = new ProductOrder();
        ProductOrder order3 = new ProductOrder();

        order1.productName = "두부";
        order1.quantity = 2;
        order1.price = 2000;

        order2.productName = "계란";
        order2.quantity = 3;
        order2.price = 6000;

        order3.productName = "김치";
        order3.quantity = 12;
        order3.price = 1000000;

        orders[0] = order1;
        orders[1] = order2;
        orders[2] = order3;


        for (ProductOrder o : orders) {
            System.out.println(o.productName + "는" + o.quantity + "개 샀더니" + o.price*o.quantity + "라더라");
        }
    }
}

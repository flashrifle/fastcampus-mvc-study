package org.example.customerOrder;

import org.example.customerOrder.Cooking;
import org.example.customerOrder.Customer;
import org.example.customerOrder.Menu;
import org.example.customerOrder.MenuItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * 1. 도메인을 구성하는 객체에 어떤것이 있는지 고민
 *      ㄴ 손님, 메뉴판, 요리사, 요리
 * 2. 객체들간의 관계 고민
 *      ㄴ 손님 -- 메뉴판
 *      ㄴ 손님 -- 요리사
 *      ㄴ 요리사 -- 요리
 * 3. 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링
 *      ㄴ 손님 -- 손님타입
 *      ㄴ 요리 -- 요리타입
 *      ㄴ 메뉴 -- 메뉴타입
 * 4. 협력을 설계
 * 5. 객체들을 포함하는 타입에 적절한 책임 할당
 * 6. 구현
 */
public class CustomerTest {

    @DisplayName("메뉴이름에 해당하는 요리를 주문을 한다")
    @Test
    void orderTest() {
        Customer customer = new Customer();
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000), new MenuItem("냉면", 7000)));
        Cooking cooking = new Cooking();

        assertThatCode(() -> customer.order("돈까스", menu, cooking))
                .doesNotThrowAnyException();
    }
}

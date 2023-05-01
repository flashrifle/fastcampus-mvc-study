package org.example.customerOrder;

import org.example.customerOrder.MenuItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuItemTest {

    @DisplayName("메뉴 항목을 생성")
    @Test
    void createTest() {
        assertThatCode(()-> new MenuItem("만두", 5000))
                .doesNotThrowAnyException();
    }
}

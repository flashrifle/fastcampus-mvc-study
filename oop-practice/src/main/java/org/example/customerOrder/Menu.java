package org.example.customerOrder;

import java.util.List;

public class Menu {
    private final List<MenuItem> menuItems;

    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem choose(String name) {
        return this.menuItems.stream()
                .filter(menuItem -> menuItem.mathes(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 이름입니다."));
    }

}
package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangjian
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @date Date : 2020年06月24日 15:48
 */
@Data
public class Frame implements Component {

    private String text;

    public Frame(String text){
        this.text = text;
    }

    private List<Component> components = new ArrayList<>();
    @Override
    public void print() {
        System.out.println("print Frame("+text+")");
        components.forEach(component -> {
            component.print();
        });
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }
}

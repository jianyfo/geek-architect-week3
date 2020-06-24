package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author : zhangjian
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @date Date : 2020年06月24日 15:39
 */
@Data
@AllArgsConstructor
public class TextBox implements Component{

    private String text;
    @Override
    public void print() {
        System.out.println("print TextBox("+ text +")");
    }

    @Override
    public void add(Component frame) {

    }
}

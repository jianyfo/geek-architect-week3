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
public class LinkLable implements Component {

    private String link;

    private String text;

    @Override
    public void print() {
        System.out.println("print LinkLable(" + text + ")");
    }

    @Override
    public void add(Component frame) {
    }
}

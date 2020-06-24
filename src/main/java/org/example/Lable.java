package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author : zhangjian
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @date Date : 2020年06月24日 15:38
 */
@Data
@AllArgsConstructor
public class Lable implements Component {

    private String text;



    @Override
    public void print() {
        System.out.println("print Lable(" + text + ")");
    }

    @Override
    public void add(Component frame) {

    }

}

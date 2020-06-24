package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author : zhangjian
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @date Date : 2020年06月24日 15:33
 */
@Data
@AllArgsConstructor
public class Picture implements Component {
    @Override
    public void print() {
        System.out.println("print Picture(LOGO图片)");
    }

    @Override
    public void add(Component frame) {
    }
}

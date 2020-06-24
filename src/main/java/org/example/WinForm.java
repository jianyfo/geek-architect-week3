package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangjian
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @date Date : 2020年06月24日 15:27
 */
public class WinForm implements Component {

    private List<Component> components = new ArrayList<>();


    @Override
    public void print() {

        System.out.println("print WinForm(Window窗口)");

        components.forEach(component->{
            component.print();
        });
    }
    @Override
    public void add(Component frame) {
        components.add(frame);
    }

    public static void main(String[] args){
        WinForm winForm = new WinForm();
        winForm.add(new Picture());
        winForm.add(new Button("登录"));
        winForm.add(new Button("注册"));
        Frame frame = new Frame("FRAME1");
        frame.add(new Lable("用户名"));
        frame.add(new TextBox("文本框"));
        frame.add(new Lable("密码"));
        frame.add(new PasswordBox("密码框"));
        frame.add(new CheckBox("记住用户名"));
        frame.add(new LinkLable("#","忘记密码"));
        winForm.add(frame);

        winForm.print();
    }
}

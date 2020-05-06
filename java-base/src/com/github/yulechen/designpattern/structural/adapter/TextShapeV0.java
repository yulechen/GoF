package com.github.yulechen.designpattern.structural.adapter;

/**
 * @Author: chenq
 * @Date: 2020/5/6  10:46
 */
public class TextShapeV0 implements Shape {

    private TextView  textView;

    @Override
    public void boundingBox() {
        // textView adaptor to TextShape
        textView.getExtent();
    }

    @Override
    public Manipulator createManipulator() {
         return new TextManipulator();
    }


}

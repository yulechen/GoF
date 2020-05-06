package com.github.yulechen.designpattern.structural.adapter;

/**
 * @Author: chenq
 * @Date: 2020/5/6  10:54
 */
public class TextShapeV1 extends TextView implements Shape {

    @Override
    public void boundingBox() {
          getExtent();
    }

    @Override
    public Manipulator createManipulator() {
        return new TextManipulator();
    }
}

package com.github.yulechen.designpattern.structural.adapter;

/**
 * @Author: chenq
 * @Date: 2020/5/6  10:46
 */
public class Line implements Shape {

    @Override
    public void boundingBox() {

    }

    @Override
    public Manipulator createManipulator() {
             return null;
    }

}

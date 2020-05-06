package com.github.yulechen.designpattern.structural.adapter;

/**
 * @Author: chenq
 * @Date: 2020/5/6  10:45
 */
public interface Shape {

    void boundingBox();
    Manipulator createManipulator();

}

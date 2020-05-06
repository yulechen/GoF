package com.github.yulechen.designpattern.structural.adapter;

/**
 * @Author: chenq
 * @Date: 2020/5/6  10:44
 */
public class DrawingEditor {
    public static void main(String[] args) {
        // 提供给client 外部视图
        Shape textShape = new TextShapeV0();
        textShape.boundingBox();
        textShape.createManipulator();

        // 内部实现功能
        /**  boundingBox
         *       TextView.getExtent
         *    boundingBox 可以复用TextView.getExtent
         *
         */

    }
}

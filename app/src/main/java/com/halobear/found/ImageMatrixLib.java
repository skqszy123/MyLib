package com.halobear.found;

import android.graphics.Matrix;

/**
 * Project：Found
 * Author: sunkeqiang
 * Version:
 * Description：
 * Date：2017/12/6 14:06
 * Modification  History:
 * Why & What is modified:
 */
public class ImageMatrixLib {
    /**
     * 通过图片矩阵信息分析当前角度，缩放，位置（2D）
     * @param matrix 图片矩阵信息
     */
    private void logInfo(Matrix matrix){
        float floats[] = new float[9];
        matrix.getValues(floats);
        android.util.Log.e("ImageInfo",
                "rotate:"+Math.atan2(floats[3],floats[0])
                        +"\nscale:"+Math.sqrt(floats[0] * floats[0] + floats[3] * floats[3])
                        +"\n(x,y):("+floats[2]+","+floats[5]+")");
    }
}

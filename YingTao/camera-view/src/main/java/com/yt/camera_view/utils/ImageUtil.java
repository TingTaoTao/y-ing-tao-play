package com.yt.camera_view.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/**
 *
 */
public class ImageUtil {
    public static Bitmap getRotateBitmap(Bitmap bitmap, float rotateDegree) {
        Matrix matrix = new Matrix();
        matrix.setRotate(rotateDegree);
        Bitmap rotateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        return rotateBitmap;
    }
}

package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import defpackage.fz4;
import defpackage.nca;

@fz4
/* loaded from: classes.dex */
public class NativeRoundingFilter {
    static {
        nca.b("native-filters");
    }

    @fz4
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    @fz4
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    @fz4
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @fz4
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    @fz4
    public static void toCircle(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z);
    }

    @fz4
    public static void toCircleFast(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z);
    }
}

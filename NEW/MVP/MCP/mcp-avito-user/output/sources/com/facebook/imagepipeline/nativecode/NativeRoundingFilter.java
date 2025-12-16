package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.infer.annotation.Nullsafe;
import iX0.C41358a;

@com.facebook.common.internal.g
@Nullsafe
/* loaded from: classes13.dex */
public class NativeRoundingFilter {
    static {
        C41358a.c("native-filters");
    }

    public static void a(Bitmap bitmap, int i12, int i13, int i14, int i15) {
        nativeAddRoundedCornersFilter(bitmap, i12, i13, i14, i15);
    }

    @com.facebook.common.internal.g
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i12, int i13, int i14, int i15);

    @com.facebook.common.internal.g
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z12);

    @com.facebook.common.internal.g
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z12);

    @com.facebook.common.internal.g
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i12, int i13, boolean z12);

    @com.facebook.common.internal.g
    public static void toCircle(Bitmap bitmap, boolean z12) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z12);
    }

    @com.facebook.common.internal.g
    public static void toCircleFast(Bitmap bitmap, boolean z12) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z12);
    }
}

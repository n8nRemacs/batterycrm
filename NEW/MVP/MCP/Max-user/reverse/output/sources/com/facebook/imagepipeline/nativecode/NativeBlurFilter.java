package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import defpackage.fz4;
import defpackage.nca;

@fz4
/* loaded from: classes.dex */
public class NativeBlurFilter {
    static {
        nca.b("native-filters");
    }

    @fz4
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}

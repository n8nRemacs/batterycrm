package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.infer.annotation.Nullsafe;
import iX0.C41358a;

@com.facebook.common.internal.g
@Nullsafe
/* loaded from: classes13.dex */
public class NativeBlurFilter {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f340495a = 0;

    static {
        C41358a.c("native-filters");
    }

    @com.facebook.common.internal.g
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i12, int i13);
}

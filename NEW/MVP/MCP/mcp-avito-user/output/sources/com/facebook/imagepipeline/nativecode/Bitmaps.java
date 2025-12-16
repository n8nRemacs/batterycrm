package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.o;
import com.facebook.infer.annotation.Nullsafe;
import iX0.C41358a;
import java.util.List;

@com.facebook.common.internal.g
@Nullsafe
/* loaded from: classes13.dex */
public class Bitmaps {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f340492a = 0;

    static {
        List<String> list = b.f340502a;
        C41358a.c("imagepipeline");
    }

    @com.facebook.common.internal.g
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        o.a(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        o.a(Boolean.valueOf(bitmap.isMutable()));
        o.a(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        o.a(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @com.facebook.common.internal.g
    private static native void nativeCopyBitmap(Bitmap bitmap, int i12, Bitmap bitmap2, int i13, int i14);
}

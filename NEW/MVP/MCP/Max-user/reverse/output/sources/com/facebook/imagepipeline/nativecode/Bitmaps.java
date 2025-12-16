package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import defpackage.fz4;
import defpackage.hf7;
import defpackage.l5j;
import defpackage.nca;

@fz4
/* loaded from: classes.dex */
public class Bitmaps {
    public static final /* synthetic */ int a = 0;

    static {
        int i = hf7.a;
        nca.b("imagepipeline");
    }

    @fz4
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        l5j.a(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        l5j.a(Boolean.valueOf(bitmap.isMutable()));
        l5j.a(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        l5j.a(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @fz4
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import j.N;
import java.security.MessageDigest;

/* compiled from: CenterCrop.java */
/* loaded from: classes5.dex */
public class l extends AbstractC36364h {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f339372b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(com.bumptech.glide.load.h.f339193a);

    @Override // com.bumptech.glide.load.h
    public final void b(@N MessageDigest messageDigest) {
        messageDigest.update(f339372b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC36364h
    public final Bitmap c(@N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @N Bitmap bitmap, int i12, int i13) {
        float width;
        float height;
        Paint paint = G.f339346a;
        if (bitmap.getWidth() == i12 && bitmap.getHeight() == i13) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i13 > bitmap.getHeight() * i12) {
            width = i13 / bitmap.getHeight();
            width2 = (i12 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i12 / bitmap.getWidth();
            height = (i13 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapE = eVar.e(i12, i13, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapE.setHasAlpha(bitmap.hasAlpha());
        G.a(bitmap, bitmapE, matrix);
        return bitmapE;
    }

    @Override // com.bumptech.glide.load.h
    public final boolean equals(Object obj) {
        return obj instanceof l;
    }

    @Override // com.bumptech.glide.load.h
    public final int hashCode() {
        return -599754482;
    }
}

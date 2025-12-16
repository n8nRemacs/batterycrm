package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import j.N;

/* compiled from: BitmapTransformation.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC36364h implements com.bumptech.glide.load.n<Bitmap> {
    @Override // com.bumptech.glide.load.n
    @N
    public final com.bumptech.glide.load.engine.w<Bitmap> a(@N Context context, @N com.bumptech.glide.load.engine.w<Bitmap> wVar, int i12, int i13) {
        if (!com.bumptech.glide.util.m.i(i12, i13)) {
            throw new IllegalArgumentException(androidx.appcompat.app.r.l(i12, i13, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        com.bumptech.glide.load.engine.bitmap_recycle.e eVar = com.bumptech.glide.b.b(context).f338682b;
        Bitmap bitmap = wVar.get();
        if (i12 == Integer.MIN_VALUE) {
            i12 = bitmap.getWidth();
        }
        if (i13 == Integer.MIN_VALUE) {
            i13 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(eVar, bitmap, i12, i13);
        return bitmap.equals(bitmapC) ? wVar : C36363g.d(bitmapC, eVar);
    }

    public abstract Bitmap c(@N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @N Bitmap bitmap, int i12, int i13);
}

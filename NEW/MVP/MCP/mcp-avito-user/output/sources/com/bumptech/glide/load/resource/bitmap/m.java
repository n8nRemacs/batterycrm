package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import j.N;
import java.security.MessageDigest;

/* compiled from: CenterInside.java */
/* loaded from: classes5.dex */
public class m extends AbstractC36364h {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f339373b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(com.bumptech.glide.load.h.f339193a);

    @Override // com.bumptech.glide.load.h
    public final void b(@N MessageDigest messageDigest) {
        messageDigest.update(f339373b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC36364h
    public final Bitmap c(@N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @N Bitmap bitmap, int i12, int i13) {
        Paint paint = G.f339346a;
        if (bitmap.getWidth() > i12 || bitmap.getHeight() > i13) {
            Log.isLoggable("TransformationUtils", 2);
            return G.b(eVar, bitmap, i12, i13);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    @Override // com.bumptech.glide.load.h
    public final boolean equals(Object obj) {
        return obj instanceof m;
    }

    @Override // com.bumptech.glide.load.h
    public final int hashCode() {
        return -670243078;
    }
}

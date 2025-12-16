package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Paint;
import j.N;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: Rotate.java */
/* loaded from: classes5.dex */
public class B extends AbstractC36364h {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f339321b = "com.bumptech.glide.load.resource.bitmap.Rotate".getBytes(com.bumptech.glide.load.h.f339193a);

    @Override // com.bumptech.glide.load.h
    public final void b(@N MessageDigest messageDigest) {
        messageDigest.update(f339321b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(0).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC36364h
    public final Bitmap c(@N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @N Bitmap bitmap, int i12, int i13) {
        Paint paint = G.f339346a;
        return bitmap;
    }

    @Override // com.bumptech.glide.load.h
    public final boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        ((B) obj).getClass();
        return true;
    }

    @Override // com.bumptech.glide.load.h
    public final int hashCode() {
        return com.bumptech.glide.util.m.f(-950519196, com.bumptech.glide.util.m.f(0, 17));
    }
}

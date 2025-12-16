package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import j.N;
import java.security.MessageDigest;

/* compiled from: FitCenter.java */
/* loaded from: classes5.dex */
public class s extends AbstractC36364h {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f339391b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(com.bumptech.glide.load.h.f339193a);

    @Override // com.bumptech.glide.load.h
    public final void b(@N MessageDigest messageDigest) {
        messageDigest.update(f339391b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC36364h
    public final Bitmap c(@N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @N Bitmap bitmap, int i12, int i13) {
        return G.b(eVar, bitmap, i12, i13);
    }

    @Override // com.bumptech.glide.load.h
    public final boolean equals(Object obj) {
        return obj instanceof s;
    }

    @Override // com.bumptech.glide.load.h
    public final int hashCode() {
        return 1572326941;
    }
}

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import j.N;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: GranularRoundedCorners.java */
/* loaded from: classes5.dex */
public final class t extends AbstractC36364h {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f339392f = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(com.bumptech.glide.load.h.f339193a);

    /* renamed from: b, reason: collision with root package name */
    public final float f339393b;

    /* renamed from: c, reason: collision with root package name */
    public final float f339394c;

    /* renamed from: d, reason: collision with root package name */
    public final float f339395d;

    /* renamed from: e, reason: collision with root package name */
    public final float f339396e;

    public t(float f12, float f13, float f14, float f15) {
        this.f339393b = f12;
        this.f339394c = f13;
        this.f339395d = f14;
        this.f339396e = f15;
    }

    @Override // com.bumptech.glide.load.h
    public final void b(@N MessageDigest messageDigest) {
        messageDigest.update(f339392f);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f339393b).putFloat(this.f339394c).putFloat(this.f339395d).putFloat(this.f339396e).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC36364h
    public final Bitmap c(@N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @N Bitmap bitmap, int i12, int i13) {
        return G.d(eVar, bitmap, new F(this.f339393b, this.f339394c, this.f339395d, this.f339396e));
    }

    @Override // com.bumptech.glide.load.h
    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f339393b == tVar.f339393b && this.f339394c == tVar.f339394c && this.f339395d == tVar.f339395d && this.f339396e == tVar.f339396e;
    }

    @Override // com.bumptech.glide.load.h
    public final int hashCode() {
        return com.bumptech.glide.util.m.e(this.f339396e, com.bumptech.glide.util.m.e(this.f339395d, com.bumptech.glide.util.m.e(this.f339394c, com.bumptech.glide.util.m.f(-2013597734, com.bumptech.glide.util.m.e(this.f339393b, 17)))));
    }
}

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import j.N;
import j.P;

/* compiled from: BitmapResource.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C36363g implements com.bumptech.glide.load.engine.w<Bitmap>, com.bumptech.glide.load.engine.s {

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f339368b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f339369c;

    public C36363g(@N Bitmap bitmap, @N com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        com.bumptech.glide.util.k.c(bitmap, "Bitmap must not be null");
        this.f339368b = bitmap;
        com.bumptech.glide.util.k.c(eVar, "BitmapPool must not be null");
        this.f339369c = eVar;
    }

    @P
    public static C36363g d(@P Bitmap bitmap, @N com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new C36363g(bitmap, eVar);
    }

    @Override // com.bumptech.glide.load.engine.s
    public final void a() {
        this.f339368b.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.w
    @N
    public final Class<Bitmap> b() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.w
    public final void c() {
        this.f339369c.b(this.f339368b);
    }

    @Override // com.bumptech.glide.load.engine.w
    @N
    public final Bitmap get() {
        return this.f339368b;
    }

    @Override // com.bumptech.glide.load.engine.w
    public final int getSize() {
        return com.bumptech.glide.util.m.c(this.f339368b);
    }
}

package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import j.N;

/* compiled from: LazyBitmapDrawableResource.java */
/* loaded from: classes5.dex */
public final class x implements com.bumptech.glide.load.engine.w<BitmapDrawable>, com.bumptech.glide.load.engine.s {

    /* renamed from: b, reason: collision with root package name */
    public final Resources f339411b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.w<Bitmap> f339412c;

    public x(@N Resources resources, @N com.bumptech.glide.load.engine.w<Bitmap> wVar) {
        com.bumptech.glide.util.k.c(resources, "Argument must not be null");
        this.f339411b = resources;
        com.bumptech.glide.util.k.c(wVar, "Argument must not be null");
        this.f339412c = wVar;
    }

    @Override // com.bumptech.glide.load.engine.s
    public final void a() {
        com.bumptech.glide.load.engine.w<Bitmap> wVar = this.f339412c;
        if (wVar instanceof com.bumptech.glide.load.engine.s) {
            ((com.bumptech.glide.load.engine.s) wVar).a();
        }
    }

    @Override // com.bumptech.glide.load.engine.w
    @N
    public final Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.w
    public final void c() {
        this.f339412c.c();
    }

    @Override // com.bumptech.glide.load.engine.w
    @N
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.f339411b, this.f339412c.get());
    }

    @Override // com.bumptech.glide.load.engine.w
    public final int getSize() {
        return this.f339412c.getSize();
    }
}

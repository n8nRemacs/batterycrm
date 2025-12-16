package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import j.N;

/* compiled from: UnitBitmapDecoder.java */
/* loaded from: classes5.dex */
public final class H implements com.bumptech.glide.load.l<Bitmap, Bitmap> {
    @Override // com.bumptech.glide.load.l
    public final /* bridge */ /* synthetic */ boolean a(@N Bitmap bitmap, @N com.bumptech.glide.load.k kVar) {
        return true;
    }

    @Override // com.bumptech.glide.load.l
    public final com.bumptech.glide.load.engine.w<Bitmap> b(@N Bitmap bitmap, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        return new a(bitmap);
    }

    /* compiled from: UnitBitmapDecoder.java */
    public static final class a implements com.bumptech.glide.load.engine.w<Bitmap> {

        /* renamed from: b, reason: collision with root package name */
        public final Bitmap f339350b;

        public a(@N Bitmap bitmap) {
            this.f339350b = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.w
        @N
        public final Class<Bitmap> b() {
            return Bitmap.class;
        }

        @Override // com.bumptech.glide.load.engine.w
        @N
        public final Bitmap get() {
            return this.f339350b;
        }

        @Override // com.bumptech.glide.load.engine.w
        public final int getSize() {
            return com.bumptech.glide.util.m.c(this.f339350b);
        }

        @Override // com.bumptech.glide.load.engine.w
        public final void c() {
        }
    }
}

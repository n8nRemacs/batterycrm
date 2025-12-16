package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import j.N;

/* compiled from: BitmapDrawableResource.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C36359c extends com.bumptech.glide.load.resource.drawable.b<BitmapDrawable> implements com.bumptech.glide.load.engine.s {
    @Override // com.bumptech.glide.load.resource.drawable.b, com.bumptech.glide.load.engine.s
    public final void a() {
        ((BitmapDrawable) this.f339422b).getBitmap().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.w
    @N
    public final Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.w
    public final void c() {
        ((BitmapDrawable) this.f339422b).getBitmap();
        throw null;
    }

    @Override // com.bumptech.glide.load.engine.w
    public final int getSize() {
        return com.bumptech.glide.util.m.c(((BitmapDrawable) this.f339422b).getBitmap());
    }
}

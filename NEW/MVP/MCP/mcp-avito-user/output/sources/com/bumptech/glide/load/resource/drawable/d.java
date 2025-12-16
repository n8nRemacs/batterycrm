package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import j.N;

/* compiled from: NonOwnedDrawableResource.java */
/* loaded from: classes5.dex */
final class d extends b<Drawable> {
    @Override // com.bumptech.glide.load.engine.w
    @N
    public final Class<Drawable> b() {
        return this.f339422b.getClass();
    }

    @Override // com.bumptech.glide.load.engine.w
    public final int getSize() {
        T t12 = this.f339422b;
        return Math.max(1, t12.getIntrinsicHeight() * t12.getIntrinsicWidth() * 4);
    }

    @Override // com.bumptech.glide.load.engine.w
    public final void c() {
    }
}

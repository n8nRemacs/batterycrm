package com.facebook.drawee.drawable;

import android.graphics.drawable.Drawable;

/* compiled from: ArrayDrawable.java */
/* loaded from: classes10.dex */
class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f340037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f340038c;

    public a(b bVar, int i12) {
        this.f340038c = bVar;
        this.f340037b = i12;
    }

    @Override // com.facebook.drawee.drawable.e
    public final Drawable a() {
        return this.f340038c.a(this.f340037b);
    }

    @Override // com.facebook.drawee.drawable.e
    public final Drawable g(Drawable drawable) {
        return this.f340038c.c(drawable, this.f340037b);
    }
}

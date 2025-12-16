package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import j.X;

/* compiled from: ViewOverlayApi18.java */
@X
/* loaded from: classes6.dex */
class M implements N {

    /* renamed from: a, reason: collision with root package name */
    public final ViewOverlay f356732a;

    public M(@j.N View view) {
        this.f356732a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.N
    public final void a(@j.N Drawable drawable) {
        this.f356732a.add(drawable);
    }

    @Override // com.google.android.material.internal.N
    public final void b(@j.N Drawable drawable) {
        this.f356732a.remove(drawable);
    }
}

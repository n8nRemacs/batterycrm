package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import j.P;

/* compiled from: BaseTarget.java */
@Deprecated
/* loaded from: classes5.dex */
public abstract class b<Z> implements q<Z> {

    /* renamed from: b, reason: collision with root package name */
    public com.bumptech.glide.request.i f339592b;

    @Override // com.bumptech.glide.request.target.q
    @P
    public com.bumptech.glide.request.d a() {
        return this.f339592b;
    }

    @Override // com.bumptech.glide.request.target.q
    public void f(@P com.bumptech.glide.request.i iVar) {
        this.f339592b = iVar;
    }

    @Override // com.bumptech.glide.manager.i
    public final void e() {
    }

    @Override // com.bumptech.glide.manager.i
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.i
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.q
    public void b(@P Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.q
    public void g(@P Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.q
    public void k(@P Drawable drawable) {
    }
}

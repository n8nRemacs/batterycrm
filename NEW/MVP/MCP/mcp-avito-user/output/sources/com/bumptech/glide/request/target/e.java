package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.N;
import j.P;

/* compiled from: CustomTarget.java */
/* loaded from: classes5.dex */
public abstract class e<T> implements q<T> {

    /* renamed from: b, reason: collision with root package name */
    public final int f339593b;

    /* renamed from: c, reason: collision with root package name */
    public final int f339594c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public com.bumptech.glide.request.i f339595d;

    public e() {
        if (!com.bumptech.glide.util.m.i(BeduinInputModel.MIN_TEXT_VERSION, BeduinInputModel.MIN_TEXT_VERSION)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f339593b = BeduinInputModel.MIN_TEXT_VERSION;
        this.f339594c = BeduinInputModel.MIN_TEXT_VERSION;
    }

    @Override // com.bumptech.glide.request.target.q
    @P
    public final com.bumptech.glide.request.d a() {
        return this.f339595d;
    }

    @Override // com.bumptech.glide.request.target.q
    public final void f(@P com.bumptech.glide.request.i iVar) {
        this.f339595d = iVar;
    }

    @Override // com.bumptech.glide.request.target.q
    public final void j(@N com.bumptech.glide.request.i iVar) {
        iVar.c(this.f339593b, this.f339594c);
    }

    @Override // com.bumptech.glide.manager.i
    public final void e() {
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStop() {
    }

    @Override // com.bumptech.glide.request.target.q
    public void g(@P Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.q
    public final void h(@N com.bumptech.glide.request.i iVar) {
    }

    @Override // com.bumptech.glide.request.target.q
    public final void k(@P Drawable drawable) {
    }
}

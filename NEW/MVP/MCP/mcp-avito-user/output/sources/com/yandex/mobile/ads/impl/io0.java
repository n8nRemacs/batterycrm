package com.yandex.mobile.ads.impl;

import android.view.TextureView;

/* loaded from: classes8.dex */
public final class io0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final in0 f386648a;

    public io0(@j.N du duVar) {
        this.f386648a = duVar;
    }

    public final void a(@j.N ho0 ho0Var) {
        TextureView textureViewC = ho0Var.c();
        ((du) this.f386648a).a(textureViewC);
        textureViewC.setVisibility(4);
        ho0Var.a().setVisibility(0);
        ho0Var.b().setVisibility(0);
    }

    public final void b(@j.N ho0 ho0Var) {
        TextureView textureViewC = ho0Var.c();
        ((du) this.f386648a).a((TextureView) null);
        textureViewC.setVisibility(8);
        ho0Var.a().setVisibility(8);
        ho0Var.b().setVisibility(8);
    }
}

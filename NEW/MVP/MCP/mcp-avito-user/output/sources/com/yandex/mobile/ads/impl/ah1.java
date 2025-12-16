package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class ah1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final h90 f383568a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final cj f383569b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final im f383570c;

    public ah1(@j.N h90 h90Var, @j.N cj cjVar, @j.P im imVar) {
        this.f383568a = h90Var;
        this.f383569b = cjVar;
        this.f383570c = imVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@j.N View view) {
        h90 h90Var;
        if (this.f383570c != null) {
            h90Var = new h90(this.f383568a.a(), this.f383568a.c(), this.f383568a.d(), this.f383570c.b(), this.f383568a.b());
        } else {
            h90Var = this.f383568a;
        }
        this.f383569b.a(h90Var).onClick(view);
    }
}

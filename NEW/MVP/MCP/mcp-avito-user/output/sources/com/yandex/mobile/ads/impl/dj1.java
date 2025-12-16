package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class dj1 implements bj {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final View f384622a;

    public dj1(@j.N View view) {
        this.f384622a = view;
    }

    @Override // com.yandex.mobile.ads.impl.bj
    public final void a(@j.N h90 h90Var, @j.N cj cjVar) {
        hl0 hl0Var = new hl0(this.f384622a.getContext(), cjVar.a(h90Var));
        this.f384622a.setOnTouchListener(hl0Var);
        this.f384622a.setOnClickListener(hl0Var);
    }
}

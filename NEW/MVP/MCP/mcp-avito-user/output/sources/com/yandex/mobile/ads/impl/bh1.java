package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;

/* loaded from: classes8.dex */
public final class bh1 implements bj {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ho0 f383964a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final im f383965b;

    public bh1(@j.N ho0 ho0Var, @j.P im imVar) {
        this.f383964a = ho0Var;
        this.f383965b = imVar;
    }

    @Override // com.yandex.mobile.ads.impl.bj
    @SuppressLint({"ClickableViewAccessibility"})
    public final void a(@j.N h90 h90Var, @j.N cj cjVar) {
        ui uiVar = new ui(this.f383964a.getContext(), new ah1(h90Var, cjVar, this.f383965b));
        this.f383964a.setOnTouchListener(uiVar);
        this.f383964a.setOnClickListener(uiVar);
    }
}

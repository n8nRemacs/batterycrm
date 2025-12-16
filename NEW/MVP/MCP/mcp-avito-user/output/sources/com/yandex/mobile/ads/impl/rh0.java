package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class rh0 implements bj {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final hi0 f389543a;

    public rh0(@j.N hi0 hi0Var) {
        this.f389543a = hi0Var;
    }

    @Override // com.yandex.mobile.ads.impl.bj
    public final void a(@j.N h90 h90Var, @j.N cj cjVar) {
        this.f389543a.setClickListener(new qh0(h90Var, cjVar));
    }
}

package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class bv0 implements jv0, pt0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final jv0 f384076a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private dt0 f384077b = dt0.f384669c;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private dw f384078c;

    public bv0(@j.N jv0 jv0Var) {
        this.f384076a = jv0Var;
    }

    @Override // com.yandex.mobile.ads.impl.jv0
    @j.N
    public final dt0 a() {
        jv0 jv0Var = this.f384078c;
        if (jv0Var == null) {
            jv0Var = this.f384076a;
        }
        dt0 dt0VarA = jv0Var.a();
        this.f384077b = dt0VarA;
        return dt0VarA;
    }

    @Override // com.yandex.mobile.ads.impl.pt0
    public final void a(@j.P com.google.android.exoplayer2.d0 d0Var) {
        this.f384078c = d0Var == null ? new dw(this.f384077b) : null;
    }
}

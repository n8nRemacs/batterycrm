package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class vf0 implements no0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.monetization.ads.mediation.nativeads.a f390864a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.q0 f390865b = new com.yandex.mobile.ads.nativeads.q0();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final of0 f390866c;

    public vf0(@j.N com.monetization.ads.mediation.nativeads.a aVar, @j.N of0 of0Var) {
        this.f390864a = aVar;
        this.f390866c = of0Var;
    }

    @Override // com.yandex.mobile.ads.impl.no0
    @j.N
    public final mo0 a(@j.N nj0 nj0Var) {
        return new pf0(this.f390865b.a(nj0Var), this.f390864a, this.f390866c);
    }
}

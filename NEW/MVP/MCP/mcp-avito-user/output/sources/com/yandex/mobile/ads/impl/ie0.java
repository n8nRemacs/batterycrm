package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class ie0 implements t3 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AdResponse f386480a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final de0 f386481b;

    public ie0(@j.N AdResponse adResponse, @j.P de0 de0Var) {
        this.f386480a = adResponse;
        this.f386481b = de0Var;
    }

    @Override // com.yandex.mobile.ads.impl.t3
    @j.N
    public final InterfaceC39315d1 a() {
        return new qe0(this.f386481b);
    }

    @Override // com.yandex.mobile.ads.impl.t3
    @j.N
    public final d6 b() {
        return new ne0(this.f386480a);
    }
}

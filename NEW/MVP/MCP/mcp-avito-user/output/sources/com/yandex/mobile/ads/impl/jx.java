package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes8.dex */
final class jx implements pa1, jc1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final vl f386989a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private Map<String, String> f386990b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f386991c;

    public jx(@j.N vl vlVar) {
        this.f386989a = vlVar;
    }

    @Override // com.yandex.mobile.ads.impl.jc1
    public final void a(boolean z12) {
        this.f386991c = z12;
        this.f386989a.a(z12);
    }

    @Override // com.yandex.mobile.ads.impl.pa1
    public final void a(@j.P Map<String, String> map) {
        this.f386990b = map;
    }

    @j.N
    public final ix a() {
        return new ix(this.f386991c, this.f386990b);
    }
}

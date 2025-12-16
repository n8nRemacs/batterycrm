package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class ge0 implements mk0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final a f385730a;

    public interface a {
    }

    public ge0(@j.N nl0 nl0Var) {
        this.f385730a = nl0Var;
    }

    @Override // com.yandex.mobile.ads.impl.mk0
    @j.N
    public final com.yandex.mobile.ads.nativeads.k a(@j.N Context context, @j.N n2 n2Var) {
        com.yandex.mobile.ads.nativeads.k kVar = new com.yandex.mobile.ads.nativeads.k(context, n2Var);
        ((nl0) this.f385730a).f388333a.f388573e.a(kVar);
        return kVar;
    }
}

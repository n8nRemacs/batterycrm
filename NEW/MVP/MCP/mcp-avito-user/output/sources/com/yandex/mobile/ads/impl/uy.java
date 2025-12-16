package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class uy {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final vy f390640a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.core.identifiers.ad.gms.service.d f390641b;

    public uy(@j.N Context context) {
        this.f390640a = new vy(context);
        this.f390641b = new com.yandex.mobile.ads.core.identifiers.ad.gms.service.d(context);
    }

    @j.P
    public final s8 a() {
        s8 s8VarA = this.f390640a.a();
        return s8VarA == null ? this.f390641b.a() : s8VarA;
    }
}

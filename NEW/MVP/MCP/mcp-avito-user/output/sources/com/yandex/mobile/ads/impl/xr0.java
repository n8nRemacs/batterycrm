package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class xr0 implements ac1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final yr0 f391797a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ps f391798b = new ps();

    public xr0(@Y61.k yr0 yr0Var) {
        this.f391797a = yr0Var;
    }

    @Override // com.yandex.mobile.ads.impl.ac1
    @Y61.k
    public final int a() {
        return 2;
    }

    @Override // com.yandex.mobile.ads.impl.ac1
    @Y61.l
    public final String a(@Y61.k n2 n2Var) {
        return vv.a(n2Var);
    }

    @Override // com.yandex.mobile.ads.impl.ac1
    @Y61.k
    public final String a(@Y61.k Context context, @Y61.k n2 n2Var, @Y61.k e31 e31Var) {
        return this.f391798b.a(context, vv.a(context, n2Var, e31Var).a(this.f391797a.a()).a());
    }
}

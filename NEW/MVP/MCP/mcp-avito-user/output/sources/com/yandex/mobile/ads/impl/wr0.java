package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.MediationData;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class wr0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final xr0 f391481a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final WeakReference<re> f391482b;

    public wr0(@j.N re reVar, @j.N MediationData mediationData, @j.N a4 a4Var) {
        this.f391482b = new WeakReference<>(reVar);
        this.f391481a = new xr0(new yr0(m7.a(a4Var.b()), mediationData));
    }

    public final void a() {
        re reVar = this.f391482b.get();
        if (reVar == null || reVar.j()) {
            return;
        }
        reVar.a(this.f391481a);
    }
}

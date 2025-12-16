package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class qe0 implements InterfaceC39315d1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final pe0 f389153a = new pe0();

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final de0 f389154b;

    public qe0(@j.P de0 de0Var) {
        this.f389154b = de0Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39315d1
    @j.N
    public final Map<String, Object> a() {
        ly0 ly0Var = new ly0(new HashMap());
        de0 de0Var = this.f389154b;
        if (de0Var != null) {
            zf0 zf0VarB = de0Var.b();
            com.monetization.ads.mediation.base.e eVarA = this.f389154b.a();
            ly0Var.b(zf0VarB.c(), "adapter");
            ly0Var.b(zf0VarB.g(), "adapter_parameters");
            this.f389153a.getClass();
            ly0Var.a(new HashMap(pe0.a(eVarA)));
        }
        return ly0Var.a();
    }
}

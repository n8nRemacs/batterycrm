package com.yandex.mobile.ads.impl;

import java.util.Iterator;

/* loaded from: classes8.dex */
final class zw0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final q11 f392401a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39304a2 f392402b;

    public zw0(@j.N q11 q11Var, @j.N C39304a2 c39304a2) {
        this.f392401a = q11Var;
        this.f392402b = c39304a2;
    }

    @j.P
    public final p60 a(long j12) {
        Iterator it = this.f392401a.a().iterator();
        while (it.hasNext()) {
            ut0 ut0Var = (ut0) it.next();
            p60 p60VarA = ut0Var.a();
            boolean z12 = Math.abs(ut0Var.b() - j12) < 200;
            EnumC39384z1 enumC39384z1A = this.f392402b.a(p60VarA);
            if (z12 && EnumC39384z1.f392141c.equals(enumC39384z1A)) {
                return p60VarA;
            }
        }
        return null;
    }
}

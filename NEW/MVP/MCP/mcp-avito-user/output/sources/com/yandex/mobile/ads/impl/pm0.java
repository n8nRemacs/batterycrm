package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class pm0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final rb f388888a;

    public pm0(@j.N rb rbVar) {
        this.f388888a = rbVar;
    }

    @j.N
    public final om0 a() {
        ro0 ro0Var;
        rd0 rd0VarA = this.f388888a.a();
        sn0 sn0Var = null;
        if (rd0VarA != null) {
            sn0 sn0Var2 = rd0VarA.c() != null ? new sn0() : null;
            ro0Var = rd0VarA.b() != null ? new ro0() : null;
            sn0Var = sn0Var2;
        } else {
            ro0Var = null;
        }
        return new om0(sn0Var, ro0Var);
    }
}

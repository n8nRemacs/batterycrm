package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;

/* loaded from: classes8.dex */
public final class s7 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f389799a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final InstreamAdRequestConfiguration f389800b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final k4 f389801c = new k4();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final vh1 f389802d = new vh1();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final ut f389803e = new ut();

    public s7(@j.N Context context, @j.N InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f389799a = context.getApplicationContext();
        this.f389800b = instreamAdRequestConfiguration;
    }

    @j.N
    public final m50 a() {
        u90 u90Var = new u90(this.f389799a, this.f389800b);
        t6 t6Var = new t6();
        nt0 nt0Var = new nt0();
        hh1 hh1VarA = nt0Var.a();
        wt wtVarC = nt0Var.c();
        hu0 hu0Var = new hu0();
        m4 m4Var = new m4(new s6(new xu(hu0Var, hh1VarA)));
        wh1 wh1Var = new wh1();
        xf xfVar = new xf();
        this.f389803e.getClass();
        u6 u6VarB = t6Var.b();
        h4 h4VarC = t6Var.c();
        wt wtVarC2 = nt0Var.c();
        hh1 hh1VarA2 = nt0Var.a();
        m2 m2Var = new m2(xfVar, t6Var, nt0Var, m4Var);
        fh1 fh1Var = new fh1(h4VarC, hh1VarA2, hu0Var, wh1Var);
        mt0 mt0Var = new mt0(u6VarB, m2Var, fh1Var, m4Var);
        ft0 ft0Var = new ft0(h4VarC, hu0Var, hh1VarA2, mt0Var);
        it0 it0Var = new it0(u6VarB, m4Var);
        us0 us0Var = new us0(xfVar, nt0Var, t6Var, fh1Var, new xu(hu0Var, hh1VarA2), m2Var);
        tt ttVar = new tt(xfVar, wtVarC2, ft0Var, mt0Var, it0Var, new j91(h4VarC, nt0Var, new u7(xfVar, h4VarC, hh1VarA2, hu0Var), us0Var), us0Var);
        i4 i4Var = new i4(hh1VarA);
        this.f389801c.getClass();
        u6 u6VarB2 = t6Var.b();
        h4 h4VarC2 = t6Var.c();
        hh1 hh1VarA3 = nt0Var.a();
        wt wtVarC3 = nt0Var.c();
        bv0 bv0Var = new bv0(new b5(u6VarB2, nt0Var));
        wtVarC3.a(bv0Var);
        jt jtVar = new jt(u6VarB2, nt0Var, bv0Var, new o4(t6Var, new b3(hh1VarA3, h4VarC2)), new n4(t6Var, nt0Var, m4Var), m4Var);
        this.f389802d.getClass();
        u6 u6VarB3 = t6Var.b();
        wt wtVarC4 = nt0Var.c();
        bv0 bv0Var2 = new bv0(new di1(u6VarB3, nt0Var, hu0Var));
        wtVarC4.a(bv0Var2);
        return new m50(t6Var, i4Var, new wf(this.f389799a, jtVar, new ro1(bv0Var2, nt0Var.e(), wh1Var)), xfVar, u90Var, nt0Var, new nt(xfVar, t6Var, m4Var, wtVarC), hu0Var, ttVar);
    }
}

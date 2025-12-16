package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class q01 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC39377x0 f389042a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final er f389043b = new er();

    /* renamed from: c, reason: collision with root package name */
    private final int f389044c;

    public q01(@j.N InterfaceC39377x0 interfaceC39377x0, int i12) {
        this.f389042a = interfaceC39377x0;
        this.f389044c = i12;
    }

    @I41.h
    public final zq a(@j.N Context context, @j.N AdResponse adResponse, @j.N com.yandex.mobile.ads.nativeads.u uVar, @j.N C39362s0 c39362s0, @j.N k2 k2Var, @j.N o01 o01Var, @j.N f91 f91Var, @j.N qq qqVar, @I41.h vq vqVar) {
        com.yandex.div2.H0 h0A;
        try {
            this.f389043b.getClass();
            if (!er.a(context) || vqVar == null || (h0A = mq.a(vqVar)) == null) {
                return null;
            }
            return new zq(h0A, a(adResponse, uVar, c39362s0, k2Var, o01Var, f91Var), this.f389042a, qqVar, this.f389044c);
        } catch (Throwable unused) {
            return null;
        }
    }

    @j.N
    private static sk a(@j.N AdResponse adResponse, @j.N com.yandex.mobile.ads.nativeads.u uVar, @j.N C39362s0 c39362s0, @j.N k2 k2Var, @j.N o01 o01Var, @j.N f91 f91Var) {
        n91 n91Var = new n91();
        ck0 ck0Var = new ck0();
        om0 om0VarB = uVar.b();
        return new sk(new p01(adResponse, c39362s0, o01Var, ck0Var, om0VarB, f91Var), new ql(adResponse, c39362s0, k2Var, om0VarB, f91Var), new v01(c39362s0, n91Var, om0VarB, f91Var));
    }
}

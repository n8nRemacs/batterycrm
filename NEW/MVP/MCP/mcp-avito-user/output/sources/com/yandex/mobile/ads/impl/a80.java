package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class a80 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC39377x0 f383436a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final er f383437b = new er();

    /* renamed from: c, reason: collision with root package name */
    private final int f383438c;

    public a80(@j.N InterfaceC39377x0 interfaceC39377x0, int i12) {
        this.f383436a = interfaceC39377x0;
        this.f383438c = i12;
    }

    @I41.h
    public final zq a(@j.N Context context, @j.N AdResponse adResponse, @j.N com.yandex.mobile.ads.nativeads.u uVar, @j.N C39362s0 c39362s0, @j.N pl plVar, @j.N k2 k2Var, @j.N pn pnVar, @j.N qq qqVar, @j.N f91 f91Var, @I41.h vq vqVar) {
        com.yandex.div2.H0 h0A;
        try {
            this.f383437b.getClass();
            if (!er.a(context) || vqVar == null || (h0A = mq.a(vqVar)) == null) {
                return null;
            }
            return new zq(h0A, new sk(new ak(adResponse, c39362s0, new yj1(), plVar, new ck0(), pnVar, f91Var), new ql(adResponse, c39362s0, k2Var, uVar.b(), f91Var)), this.f383436a, qqVar, this.f383438c);
        } catch (Throwable unused) {
            return null;
        }
    }
}

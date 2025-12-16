package com.yandex.mobile.ads.impl;

import android.content.Context;
import d11.AbstractC39485b;
import d11.C39484a;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes8.dex */
final class n01 implements d11.c {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final WeakReference<rx<f01>> f388123a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private WeakReference<f01> f388124b = new WeakReference<>(null);

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ee0<AbstractC39485b, d11.c> f388125c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final m30 f388126d;

    public n01(@j.N rx<f01> rxVar, @j.N ee0<AbstractC39485b, d11.c> ee0Var) {
        this.f388123a = new WeakReference<>(rxVar);
        this.f388125c = ee0Var;
        this.f388126d = new m30(ee0Var);
    }

    public final void a(@j.N f01 f01Var) {
        this.f388124b = new WeakReference<>(f01Var);
    }

    public final void onAdImpression() {
        f01 f01Var;
        if (this.f388125c.b() || (f01Var = this.f388124b.get()) == null) {
            return;
        }
        Context contextB = f01Var.b();
        ee0<AbstractC39485b, d11.c> ee0Var = this.f388125c;
        ee0Var.getClass();
        ee0Var.b(contextB, new HashMap());
        f01Var.a(this.f388126d.a());
    }

    public final void onRewarded(@j.P C39484a c39484a) {
        f01 f01Var = this.f388124b.get();
        if (f01Var != null) {
            this.f388125c.a(f01Var.b(), f01Var.a());
            f01Var.p();
        }
    }

    public final void onRewardedAdClicked() {
        f01 f01Var = this.f388124b.get();
        if (f01Var != null) {
            Context contextB = f01Var.b();
            ee0<AbstractC39485b, d11.c> ee0Var = this.f388125c;
            ee0Var.getClass();
            ee0Var.a(contextB, new HashMap());
        }
    }

    public final void onRewardedAdDismissed() {
        f01 f01Var = this.f388124b.get();
        if (f01Var != null) {
            f01Var.n();
        }
    }

    public final void onRewardedAdFailedToLoad(@j.N com.monetization.ads.mediation.base.a aVar) {
        rx<f01> rxVar = this.f388123a.get();
        if (rxVar != null) {
            Context contextH = rxVar.h();
            aVar.getClass();
            this.f388125c.b(contextH, new w2(0, null, null), this);
        }
    }

    public final void onRewardedAdLeftApplication() {
        f01 f01Var = this.f388124b.get();
        if (f01Var != null) {
            f01Var.onLeftApplication();
        }
    }

    public final void onRewardedAdLoaded() {
        rx<f01> rxVar = this.f388123a.get();
        if (rxVar != null) {
            Context contextH = rxVar.h();
            ee0<AbstractC39485b, d11.c> ee0Var = this.f388125c;
            ee0Var.getClass();
            ee0Var.c(contextH, new HashMap());
            rxVar.b(new o7(this.f388125c).a());
            rxVar.p();
        }
    }

    public final void onRewardedAdShown() {
        f01 f01Var;
        f01 f01Var2 = this.f388124b.get();
        if (f01Var2 != null) {
            f01Var2.o();
            this.f388125c.c(f01Var2.b());
        }
        if (!this.f388125c.b() || (f01Var = this.f388124b.get()) == null) {
            return;
        }
        Context contextB = f01Var.b();
        ee0<AbstractC39485b, d11.c> ee0Var = this.f388125c;
        ee0Var.getClass();
        ee0Var.b(contextB, new HashMap());
        f01Var.a(this.f388126d.a());
    }
}

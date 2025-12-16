package com.yandex.mobile.ads.impl;

import android.content.Context;
import c11.AbstractC26922a;
import com.yandex.mobile.ads.impl.fy;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes8.dex */
final class z70<T extends fy<T>> implements AbstractC26922a.InterfaceC2026a {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final WeakReference<rx<T>> f392197a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private WeakReference<fy<T>> f392198b = new WeakReference<>(null);

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ee0<AbstractC26922a, AbstractC26922a.InterfaceC2026a> f392199c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final m30 f392200d;

    public z70(@j.N rx<T> rxVar, @j.N ee0<AbstractC26922a, AbstractC26922a.InterfaceC2026a> ee0Var) {
        this.f392197a = new WeakReference<>(rxVar);
        this.f392199c = ee0Var;
        this.f392200d = new m30(ee0Var);
    }

    public final void a(@j.N fy<T> fyVar) {
        this.f392198b = new WeakReference<>(fyVar);
    }

    public final void onAdImpression() {
        fy<T> fyVar;
        if (this.f392199c.b() || (fyVar = this.f392198b.get()) == null) {
            return;
        }
        Context contextB = fyVar.b();
        ee0<AbstractC26922a, AbstractC26922a.InterfaceC2026a> ee0Var = this.f392199c;
        ee0Var.getClass();
        ee0Var.b(contextB, new HashMap());
        fyVar.a(this.f392200d.a());
    }

    public final void onInterstitialClicked() {
        fy<T> fyVar = this.f392198b.get();
        if (fyVar != null) {
            Context contextB = fyVar.b();
            ee0<AbstractC26922a, AbstractC26922a.InterfaceC2026a> ee0Var = this.f392199c;
            ee0Var.getClass();
            ee0Var.a(contextB, new HashMap());
        }
    }

    public final void onInterstitialDismissed() {
        fy<T> fyVar = this.f392198b.get();
        if (fyVar != null) {
            fyVar.n();
        }
    }

    public final void onInterstitialFailedToLoad(@j.N com.monetization.ads.mediation.base.a aVar) {
        rx<T> rxVar = this.f392197a.get();
        if (rxVar != null) {
            Context contextH = rxVar.h();
            aVar.getClass();
            this.f392199c.b(contextH, new w2(0, null, null), this);
        }
    }

    public final void onInterstitialLeftApplication() {
        fy<T> fyVar = this.f392198b.get();
        if (fyVar != null) {
            fyVar.onLeftApplication();
        }
    }

    public final void onInterstitialLoaded() {
        rx<T> rxVar = this.f392197a.get();
        if (rxVar != null) {
            Context contextH = rxVar.h();
            ee0<AbstractC26922a, AbstractC26922a.InterfaceC2026a> ee0Var = this.f392199c;
            ee0Var.getClass();
            ee0Var.c(contextH, new HashMap());
            rxVar.b(new o7(this.f392199c).a());
            rxVar.p();
        }
    }

    public final void onInterstitialShown() {
        fy<T> fyVar;
        fy<T> fyVar2 = this.f392198b.get();
        if (fyVar2 != null) {
            fyVar2.o();
            this.f392199c.c(fyVar2.b());
        }
        if (!this.f392199c.b() || (fyVar = this.f392198b.get()) == null) {
            return;
        }
        Context contextB = fyVar.b();
        ee0<AbstractC26922a, AbstractC26922a.InterfaceC2026a> ee0Var = this.f392199c;
        ee0Var.getClass();
        ee0Var.b(contextB, new HashMap());
        fyVar.a(this.f392200d.a());
    }
}

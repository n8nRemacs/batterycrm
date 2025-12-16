package com.avito.android.wallet.page.topup.form.mvi.component;

import bP0.C25543d;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TopUpFormFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f328404a;

    /* renamed from: b, reason: collision with root package name */
    public final e f328405b;

    /* renamed from: c, reason: collision with root package name */
    public final n f328406c;

    /* renamed from: d, reason: collision with root package name */
    public final p f328407d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f328408e;

    public j(g gVar, e eVar, n nVar, p pVar, Provider provider) {
        this.f328404a = gVar;
        this.f328405b = eVar;
        this.f328406c = nVar;
        this.f328407d = pVar;
        this.f328408e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f328404a.get();
        b bVar = (b) this.f328405b.get();
        this.f328406c.getClass();
        m mVar = new m();
        o oVar = (o) this.f328407d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f328408e.get();
        C25543d.f57061e.getClass();
        return new i("TopUpForm", C25543d.f57062f, new h(fVar, bVar, screenPerformanceTracker, oVar, mVar));
    }
}

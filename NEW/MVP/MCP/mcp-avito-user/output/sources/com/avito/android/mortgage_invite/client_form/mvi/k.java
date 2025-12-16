package com.avito.android.mortgage_invite.client_form.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ApplicationClientFormFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f205262a;

    /* renamed from: b, reason: collision with root package name */
    public final f f205263b;

    /* renamed from: c, reason: collision with root package name */
    public final m f205264c;

    /* renamed from: d, reason: collision with root package name */
    public final o f205265d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f205266e;

    public k(h hVar, f fVar, m mVar, o oVar, Provider provider) {
        this.f205262a = hVar;
        this.f205263b = fVar;
        this.f205264c = mVar;
        this.f205265d = oVar;
        this.f205266e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f205262a.get();
        e eVar = (e) this.f205263b.get();
        this.f205264c.getClass();
        l lVar = new l();
        this.f205265d.getClass();
        n nVar = new n();
        ScreenPerformanceTracker screenPerformanceTracker = this.f205266e.get();
        U10.c.f16107e.getClass();
        return new j("ApplicationClientForm", U10.c.f16108f, new i(gVar, eVar, screenPerformanceTracker, nVar, lVar));
    }
}

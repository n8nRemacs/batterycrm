package com.avito.android.passport.profile_add.merge.select_business_vrf.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectBusinessVrfFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f213473a;

    /* renamed from: b, reason: collision with root package name */
    public final e f213474b;

    /* renamed from: c, reason: collision with root package name */
    public final o f213475c;

    /* renamed from: d, reason: collision with root package name */
    public final r f213476d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f213477e;

    public m(j jVar, e eVar, o oVar, r rVar, Provider provider) {
        this.f213473a = jVar;
        this.f213474b = eVar;
        this.f213475c = oVar;
        this.f213476d = rVar;
        this.f213477e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f213473a.get();
        a aVar = (a) this.f213474b.get();
        n nVar = (n) this.f213475c.get();
        this.f213476d.getClass();
        p pVar = new p();
        ScreenPerformanceTracker screenPerformanceTracker = this.f213477e.get();
        g60.c.f396298m.getClass();
        return new l("SelectBusinessVrf", g60.c.f396299n, new k(iVar, aVar, screenPerformanceTracker, pVar, nVar));
    }
}

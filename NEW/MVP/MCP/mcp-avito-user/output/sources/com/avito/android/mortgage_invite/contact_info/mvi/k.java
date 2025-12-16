package com.avito.android.mortgage_invite.contact_info.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ApplicationContactInfoFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f205739a;

    /* renamed from: b, reason: collision with root package name */
    public final o f205740b;

    /* renamed from: c, reason: collision with root package name */
    public final f f205741c;

    /* renamed from: d, reason: collision with root package name */
    public final m f205742d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f205743e;

    public k(h hVar, o oVar, f fVar, m mVar, Provider provider) {
        this.f205739a = hVar;
        this.f205740b = oVar;
        this.f205741c = fVar;
        this.f205742d = mVar;
        this.f205743e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f205739a.get();
        n nVar = (n) this.f205740b.get();
        e eVar = (e) this.f205741c.get();
        this.f205742d.getClass();
        l lVar = new l();
        ScreenPerformanceTracker screenPerformanceTracker = this.f205743e.get();
        b20.d.f56842g.getClass();
        return new j("ApplicationInviteContactInfo", b20.d.f56843h, new i(gVar, screenPerformanceTracker, nVar, eVar, lVar));
    }
}

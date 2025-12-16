package com.avito.android.referral_contacts.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReferralContactsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final g f252553a;

    /* renamed from: b, reason: collision with root package name */
    public final n f252554b;

    /* renamed from: c, reason: collision with root package name */
    public final i f252555c;

    /* renamed from: d, reason: collision with root package name */
    public final p f252556d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f252557e;

    public l(g gVar, n nVar, i iVar, p pVar, Provider provider) {
        this.f252553a = gVar;
        this.f252554b = nVar;
        this.f252555c = iVar;
        this.f252556d = pVar;
        this.f252557e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f252553a.get();
        this.f252554b.getClass();
        m mVar = new m();
        h hVar = (h) this.f252555c.get();
        this.f252556d.getClass();
        o oVar = new o();
        return new k("ReferralContactsScreen", new Ui0.f(null, null, null, null, null, null, null, null, null, 511, null), new j(fVar, mVar, hVar, this.f252557e.get(), oVar));
    }
}

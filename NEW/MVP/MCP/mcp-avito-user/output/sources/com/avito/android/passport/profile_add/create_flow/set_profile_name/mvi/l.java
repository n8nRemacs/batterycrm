package com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.entity.SetProfileNameState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SetProfileNameFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f212189a;

    /* renamed from: b, reason: collision with root package name */
    public final g f212190b;

    /* renamed from: c, reason: collision with root package name */
    public final n f212191c;

    /* renamed from: d, reason: collision with root package name */
    public final p f212192d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f212193e;

    public l(i iVar, g gVar, n nVar, p pVar, Provider provider) {
        this.f212189a = iVar;
        this.f212190b = gVar;
        this.f212191c = nVar;
        this.f212192d = pVar;
        this.f212193e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f212189a.get();
        e eVar = (e) this.f212190b.get();
        this.f212191c.getClass();
        m mVar = new m();
        o oVar = (o) this.f212192d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f212193e.get();
        SetProfileNameState.f212154h.getClass();
        return new k("SetProfileName", SetProfileNameState.f212155i, new j(hVar, eVar, screenPerformanceTracker, oVar, mVar));
    }
}

package com.avito.android.profile_phones.add_phone.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import nb0.C44373c;

/* compiled from: AddPhoneFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f226936a;

    /* renamed from: b, reason: collision with root package name */
    public final f f226937b;

    /* renamed from: c, reason: collision with root package name */
    public final m f226938c;

    /* renamed from: d, reason: collision with root package name */
    public final o f226939d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f226940e;

    public k(h hVar, f fVar, m mVar, o oVar, Provider provider) {
        this.f226936a = hVar;
        this.f226937b = fVar;
        this.f226938c = mVar;
        this.f226939d = oVar;
        this.f226940e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f226936a.get();
        e eVar = (e) this.f226937b.get();
        l lVar = (l) this.f226938c.get();
        this.f226939d.getClass();
        n nVar = new n();
        ScreenPerformanceTracker screenPerformanceTracker = this.f226940e.get();
        C44373c.f415212d.getClass();
        return new j("AddPhone", C44373c.f415213e, new i(gVar, eVar, screenPerformanceTracker, nVar, lVar));
    }
}

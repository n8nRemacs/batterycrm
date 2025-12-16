package com.avito.android.str_insurance.screen.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;

/* compiled from: StrInsuranceFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final C35129d f288749a;

    /* renamed from: b, reason: collision with root package name */
    public final C35127b f288750b;

    /* renamed from: c, reason: collision with root package name */
    public final u f288751c;

    /* renamed from: d, reason: collision with root package name */
    public final w f288752d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f288753e;

    public j(C35129d c35129d, C35127b c35127b, u uVar, w wVar, dagger.internal.u uVar2) {
        this.f288749a = c35129d;
        this.f288750b = c35127b;
        this.f288751c = uVar;
        this.f288752d = wVar;
        this.f288753e = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C35128c c35128c = (C35128c) this.f288749a.get();
        C35126a c35126a = (C35126a) this.f288750b.get();
        t tVar = (t) this.f288751c.get();
        v vVar = (v) this.f288752d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f288753e.get();
        Zy0.c.f20606g.getClass();
        return new i("StrInsurance", Zy0.c.f20607h, new h(c35128c, c35126a, screenPerformanceTracker, vVar, tVar));
    }
}

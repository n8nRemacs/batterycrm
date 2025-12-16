package com.avito.android.tariff.cpa.info.mvi;

import bB0.C25490c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpaInfoFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f294777a;

    /* renamed from: b, reason: collision with root package name */
    public final f f294778b;

    /* renamed from: c, reason: collision with root package name */
    public final m f294779c;

    /* renamed from: d, reason: collision with root package name */
    public final o f294780d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f294781e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f294782f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f294783g;

    public k(h hVar, f fVar, m mVar, o oVar, Provider provider, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f294777a = hVar;
        this.f294778b = fVar;
        this.f294779c = mVar;
        this.f294780d = oVar;
        this.f294781e = provider;
        this.f294782f = lVar;
        this.f294783g = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f294777a.get();
        c cVar = (c) this.f294778b.get();
        this.f294779c.getClass();
        l lVar = new l();
        n nVar = (n) this.f294780d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f294781e.get();
        boolean zBooleanValue = ((Boolean) this.f294782f.f393949a).booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.f294783g.f393949a).booleanValue();
        C25490c.f56996j.getClass();
        return new j("CpaInfo", C25490c.a(C25490c.f56997k, null, null, null, null, false, false, zBooleanValue, zBooleanValue2, 63), new i(gVar, cVar, screenPerformanceTracker, nVar, lVar));
    }
}

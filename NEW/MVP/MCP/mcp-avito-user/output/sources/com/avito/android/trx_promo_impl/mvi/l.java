package com.avito.android.trx_promo_impl.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f304362a;

    /* renamed from: b, reason: collision with root package name */
    public final g f304363b;

    /* renamed from: c, reason: collision with root package name */
    public final n f304364c;

    /* renamed from: d, reason: collision with root package name */
    public final p f304365d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f304366e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f304367f;

    public l(i iVar, g gVar, n nVar, p pVar, Provider provider, dagger.internal.l lVar) {
        this.f304362a = iVar;
        this.f304363b = gVar;
        this.f304364c = nVar;
        this.f304365d = pVar;
        this.f304366e = provider;
        this.f304367f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f304362a.get();
        f fVar = (f) this.f304363b.get();
        this.f304364c.getClass();
        m mVar = new m();
        o oVar = (o) this.f304365d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f304366e.get();
        boolean zBooleanValue = ((Boolean) this.f304367f.f393949a).booleanValue();
        ZF0.d.f20040m.getClass();
        return new k("TrxPromo", ZF0.d.a(ZF0.d.f20041n, zBooleanValue, false, null, null, null, null, false, null, 0, null, null, 2046), new j(hVar, fVar, screenPerformanceTracker, oVar, mVar));
    }
}

package com.avito.android.trx_promo_goods.screens.configure.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoGoodsConfigureFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f303609a;

    /* renamed from: b, reason: collision with root package name */
    public final h f303610b;

    /* renamed from: c, reason: collision with root package name */
    public final o f303611c;

    /* renamed from: d, reason: collision with root package name */
    public final q f303612d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f303613e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f303614f;

    public m(j jVar, h hVar, o oVar, q qVar, Provider provider, dagger.internal.l lVar) {
        this.f303609a = jVar;
        this.f303610b = hVar;
        this.f303611c = oVar;
        this.f303612d = qVar;
        this.f303613e = provider;
        this.f303614f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f303609a.get();
        f fVar = (f) this.f303610b.get();
        this.f303611c.getClass();
        n nVar = new n();
        p pVar = (p) this.f303612d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f303613e.get();
        boolean zBooleanValue = ((Boolean) this.f303614f.f393949a).booleanValue();
        MF0.d.f10510m.getClass();
        return new l("TrxPromoGoodsConfigure", MF0.d.a(MF0.d.f10511n, zBooleanValue, false, null, null, 0.0f, null, null, 0.0f, null, false, null, 2046), new k(iVar, fVar, screenPerformanceTracker, pVar, nVar));
    }
}

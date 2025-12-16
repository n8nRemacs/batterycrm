package com.avito.android.trx_promo_goods.screens.status.mvi;

import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.trx_promo_goods.screens.status.domain.TrxPromoGoodsStatus;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoGoodsStatusFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f303851a;

    /* renamed from: b, reason: collision with root package name */
    public final l f303852b;

    /* renamed from: c, reason: collision with root package name */
    public final d f303853c;

    /* renamed from: d, reason: collision with root package name */
    public final b f303854d;

    /* renamed from: e, reason: collision with root package name */
    public final i f303855e;

    /* renamed from: f, reason: collision with root package name */
    public final k f303856f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f303857g;

    public g(l lVar, l lVar2, d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f303851a = lVar;
        this.f303852b = lVar2;
        this.f303853c = dVar;
        this.f303854d = bVar;
        this.f303855e = iVar;
        this.f303856f = kVar;
        this.f303857g = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        boolean zBooleanValue = ((Boolean) this.f303851a.f393949a).booleanValue();
        TrxPromoGoodsStatus trxPromoGoodsStatus = (TrxPromoGoodsStatus) this.f303852b.f393949a;
        c cVar = (c) this.f303853c.get();
        a aVar = (a) this.f303854d.get();
        this.f303855e.getClass();
        h hVar = new h();
        this.f303856f.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f303857g.get();
        PF0.c.f12920k.getClass();
        return new f("TrxPromoGoodsStatus", PF0.c.a(PF0.c.f12921l, zBooleanValue, zBooleanValue ? R.drawable.ic_close_24 : R.drawable.ic_back_24, trxPromoGoodsStatus, null, null, null, null, null, false, 504), new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}

package com.avito.android.str_seller_orders.strsellerordersrange.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders.strsellerordersrange.mvi.entity.StrSellerOrdersRangeState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.collections.C42784z0;

/* compiled from: StrSellerOrdersRangeFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final e f290309a;

    /* renamed from: b, reason: collision with root package name */
    public final g f290310b;

    /* renamed from: c, reason: collision with root package name */
    public final l f290311c;

    /* renamed from: d, reason: collision with root package name */
    public final n f290312d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f290313e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f290314f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f290315g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f290316h;

    public j(e eVar, g gVar, l lVar, n nVar, Provider provider, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4) {
        this.f290309a = eVar;
        this.f290310b = gVar;
        this.f290311c = lVar;
        this.f290312d = nVar;
        this.f290313e = provider;
        this.f290314f = lVar2;
        this.f290315g = lVar3;
        this.f290316h = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f290309a.get();
        f fVar = (f) this.f290310b.get();
        this.f290311c.getClass();
        k kVar = new k();
        m mVar = (m) this.f290312d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f290313e.get();
        String str = (String) this.f290314f.f393949a;
        String str2 = (String) this.f290315g.f393949a;
        String str3 = (String) this.f290316h.f393949a;
        StrSellerOrdersRangeState.f290277j.getClass();
        return new i("StrSellerOrdersRange", new StrSellerOrdersRangeState(str, str2, str3, null, C42784z0.f406748b, null, null, StrSellerOrdersRangeState.LoadingState.f290286b), new h(dVar, fVar, kVar, screenPerformanceTracker, mVar));
    }
}

package com.avito.android.trx_promo_impl.status_screen.mvi;

import aG0.C19772c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.trx_promo_public.data.TrxPromoStatus;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoStatusFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f304467a;

    /* renamed from: b, reason: collision with root package name */
    public final l f304468b;

    /* renamed from: c, reason: collision with root package name */
    public final d f304469c;

    /* renamed from: d, reason: collision with root package name */
    public final b f304470d;

    /* renamed from: e, reason: collision with root package name */
    public final i f304471e;

    /* renamed from: f, reason: collision with root package name */
    public final k f304472f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f304473g;

    public g(l lVar, l lVar2, d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f304467a = lVar;
        this.f304468b = lVar2;
        this.f304469c = dVar;
        this.f304470d = bVar;
        this.f304471e = iVar;
        this.f304472f = kVar;
        this.f304473g = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        boolean zBooleanValue = ((Boolean) this.f304467a.f393949a).booleanValue();
        TrxPromoStatus trxPromoStatus = (TrxPromoStatus) this.f304468b.f393949a;
        c cVar = (c) this.f304469c.get();
        a aVar = (a) this.f304470d.get();
        this.f304471e.getClass();
        h hVar = new h();
        this.f304472f.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f304473g.get();
        C19772c.f20848j.getClass();
        return new f("TrxPromoStatus", C19772c.a(C19772c.f20849k, zBooleanValue, trxPromoStatus, null, null, null, null, null, false, 252), new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}

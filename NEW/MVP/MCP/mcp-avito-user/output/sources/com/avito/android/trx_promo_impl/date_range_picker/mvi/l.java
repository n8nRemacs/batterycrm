package com.avito.android.trx_promo_impl.date_range_picker.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoDateRangePickerFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f304059a;

    /* renamed from: b, reason: collision with root package name */
    public final g f304060b;

    /* renamed from: c, reason: collision with root package name */
    public final n f304061c;

    /* renamed from: d, reason: collision with root package name */
    public final p f304062d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f304063e;

    public l(i iVar, g gVar, n nVar, p pVar, Provider provider) {
        this.f304059a = iVar;
        this.f304060b = gVar;
        this.f304061c = nVar;
        this.f304062d = pVar;
        this.f304063e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f304059a.get();
        e eVar = (e) this.f304060b.get();
        this.f304061c.getClass();
        m mVar = new m();
        o oVar = (o) this.f304062d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f304063e.get();
        SF0.c.f14861n.getClass();
        return new k("TrxPromoDateRangePicker", SF0.c.f14862o, new j(hVar, eVar, screenPerformanceTracker, oVar, mVar));
    }
}

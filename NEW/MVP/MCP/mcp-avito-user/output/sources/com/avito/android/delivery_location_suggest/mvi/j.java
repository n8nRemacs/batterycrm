package com.avito.android.delivery_location_suggest.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.delivery_location_suggest.DeliveryLocationSuggestParams;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryLocationSuggestFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f135185a;

    /* renamed from: b, reason: collision with root package name */
    public final e f135186b;

    /* renamed from: c, reason: collision with root package name */
    public final l f135187c;

    /* renamed from: d, reason: collision with root package name */
    public final n f135188d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f135189e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f135190f;

    public j(g gVar, e eVar, l lVar, n nVar, Provider provider, dagger.internal.l lVar2) {
        this.f135185a = gVar;
        this.f135186b = eVar;
        this.f135187c = lVar;
        this.f135188d = nVar;
        this.f135189e = provider;
        this.f135190f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f135185a.get();
        a aVar = (a) this.f135186b.get();
        this.f135187c.getClass();
        k kVar = new k();
        this.f135188d.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = this.f135189e.get();
        String f135039c = ((DeliveryLocationSuggestParams) this.f135190f.f393949a).getF135039c();
        if (f135039c == null) {
            f135039c = "";
        }
        return new i("DeliveryLocationSuggest", new Gv.c(f135039c, null, 2, null), new h(fVar, aVar, screenPerformanceTracker, mVar, kVar));
    }
}

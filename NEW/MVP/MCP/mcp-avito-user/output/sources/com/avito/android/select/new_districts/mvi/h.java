package com.avito.android.select.new_districts.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.select.new_districts.mvi.entity.SelectDistrictState;
import com.avito.android.select.new_districts.mvi.entity.SelectDistrictViewState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FilterSelectDistrictFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f265850a;

    /* renamed from: b, reason: collision with root package name */
    public final b f265851b;

    /* renamed from: c, reason: collision with root package name */
    public final j f265852c;

    /* renamed from: d, reason: collision with root package name */
    public final l f265853d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f265854e;

    public h(d dVar, b bVar, j jVar, l lVar, Provider provider) {
        this.f265850a = dVar;
        this.f265851b = bVar;
        this.f265852c = jVar;
        this.f265853d = lVar;
        this.f265854e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f265850a.get();
        this.f265851b.getClass();
        a aVar = new a();
        this.f265852c.getClass();
        i iVar = new i();
        this.f265853d.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = this.f265854e.get();
        SelectDistrictState.f265817i.getClass();
        return new f("SelectDistrict", new SelectDistrictState(null, new SelectDistrictViewState(null, null, null, null, null, null, false, 127, null), null, null, null, null, false, 125, null), new e(cVar, aVar, screenPerformanceTracker, kVar, iVar));
    }
}

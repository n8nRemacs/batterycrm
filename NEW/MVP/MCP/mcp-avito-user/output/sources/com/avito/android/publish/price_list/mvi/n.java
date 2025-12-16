package com.avito.android.publish.price_list.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectPriceListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final k f238910a;

    /* renamed from: b, reason: collision with root package name */
    public final i f238911b;

    /* renamed from: c, reason: collision with root package name */
    public final p f238912c;

    /* renamed from: d, reason: collision with root package name */
    public final r f238913d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f238914e;

    public n(k kVar, i iVar, p pVar, r rVar, Provider provider) {
        this.f238910a = kVar;
        this.f238911b = iVar;
        this.f238912c = pVar;
        this.f238913d = rVar;
        this.f238914e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f238910a.get();
        h hVar = (h) this.f238911b.get();
        this.f238912c.getClass();
        o oVar = new o();
        q qVar = (q) this.f238913d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f238914e.get();
        com.avito.android.publish.price_list.mvi.entity.f.f238849l.getClass();
        return new m("SelectPriceList", com.avito.android.publish.price_list.mvi.entity.f.f238850m, new l(jVar, hVar, screenPerformanceTracker, qVar, oVar));
    }
}

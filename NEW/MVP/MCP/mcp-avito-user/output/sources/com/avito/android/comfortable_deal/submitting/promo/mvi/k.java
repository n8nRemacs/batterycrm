package com.avito.android.comfortable_deal.submitting.promo.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.submitting.promo.mvi.entity.PromoState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PromoFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final e f123202a;

    /* renamed from: b, reason: collision with root package name */
    public final m f123203b;

    /* renamed from: c, reason: collision with root package name */
    public final o f123204c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f123205d;

    /* renamed from: e, reason: collision with root package name */
    public final h f123206e;

    public k(e eVar, m mVar, o oVar, Provider provider, h hVar) {
        this.f123202a = eVar;
        this.f123203b = mVar;
        this.f123204c = oVar;
        this.f123205d = provider;
        this.f123206e = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f123202a.get();
        this.f123203b.getClass();
        l lVar = new l();
        this.f123204c.getClass();
        n nVar = new n();
        return new j("CDPromo", new PromoState(null, null, null, null, null, 31, null), new i(dVar, this.f123205d.get(), nVar, (g) this.f123206e.get(), lVar));
    }
}

package com.avito.android.review.report.mvi;

import cn0.C27230c;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.collections.C42784z0;

/* compiled from: ComfortableDealReviewsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f255420a;

    /* renamed from: b, reason: collision with root package name */
    public final l f255421b;

    /* renamed from: c, reason: collision with root package name */
    public final j f255422c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f255423d;

    /* renamed from: e, reason: collision with root package name */
    public final b f255424e;

    public h(e eVar, l lVar, j jVar, Provider provider, b bVar) {
        this.f255420a = eVar;
        this.f255421b = lVar;
        this.f255422c = jVar;
        this.f255423d = provider;
        this.f255424e = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f255420a.getClass();
        d dVar = new d();
        this.f255421b.getClass();
        k kVar = new k();
        this.f255422c.getClass();
        i iVar = new i();
        ScreenPerformanceTracker screenPerformanceTracker = this.f255423d.get();
        a aVar = (a) this.f255424e.get();
        C27230c.f58138d.getClass();
        return new g("ComfortableDealReviewsFeature", new C27230c(R.string.reviews_title, C42784z0.f406748b), new f(dVar, aVar, screenPerformanceTracker, kVar, iVar));
    }
}

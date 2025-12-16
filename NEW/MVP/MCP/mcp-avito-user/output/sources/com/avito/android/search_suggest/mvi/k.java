package com.avito.android.search_suggest.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.search_suggest.SearchSuggestArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchSuggestFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f264353a;

    /* renamed from: b, reason: collision with root package name */
    public final e f264354b;

    /* renamed from: c, reason: collision with root package name */
    public final m f264355c;

    /* renamed from: d, reason: collision with root package name */
    public final o f264356d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f264357e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f264358f;

    public k(g gVar, e eVar, m mVar, o oVar, Provider provider, dagger.internal.l lVar) {
        this.f264353a = gVar;
        this.f264354b = eVar;
        this.f264355c = mVar;
        this.f264356d = oVar;
        this.f264357e = provider;
        this.f264358f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f264353a.get();
        c cVar = (c) this.f264354b.get();
        this.f264355c.getClass();
        l lVar = new l();
        this.f264356d.getClass();
        n nVar = new n();
        ScreenPerformanceTracker screenPerformanceTracker = this.f264357e.get();
        SearchSuggestArguments searchSuggestArguments = (SearchSuggestArguments) this.f264358f.f393949a;
        Pp0.d.f13322h.getClass();
        return new i("SearchSuggest", new Pp0.d(searchSuggestArguments.f264105b, null, null, null, false, null, 62, null), new h(fVar, cVar, screenPerformanceTracker, nVar, lVar));
    }
}

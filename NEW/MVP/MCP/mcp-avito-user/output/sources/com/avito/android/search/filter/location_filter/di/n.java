package com.avito.android.search.filter.location_filter.di;

import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.remote.model.Category;
import com.avito.android.remote.model.SearchParameters;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.search.filter.location_filter.di.a;
import com.avito.android.util.C;
import com.avito.android.util.Kundle;
import com.avito.android.util.P2;
import dagger.internal.x;
import dagger.internal.y;
import java.util.List;
import javax.inject.Provider;
import kotlin.Q;

/* compiled from: LocationFiltersModule_ProvidePreloadingPromise$_avito_search_filter_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<com.avito.android.preloading.j<com.avito.android.search.filter.preloading.c, Q<List<Category>, P2<SearchParameters>>>> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.search.filter.preloading.i f263626a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f263627b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<PreloadingPromiseTestGroup> f263628c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f263629d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f263630e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f263631f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.search.filter.preloading.b f263632g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f263633h;

    public n(com.avito.android.search.filter.preloading.i iVar, Provider provider, Provider provider2, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, com.avito.android.search.filter.preloading.b bVar, dagger.internal.l lVar4) {
        this.f263626a = iVar;
        this.f263627b = provider;
        this.f263628c = provider2;
        this.f263629d = lVar;
        this.f263630e = lVar2;
        this.f263631f = lVar3;
        this.f263632g = bVar;
        this.f263633h = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.search.filter.preloading.g gVar = (com.avito.android.search.filter.preloading.g) this.f263626a.get();
        C c12 = (C) ((a.c.d) this.f263627b).get();
        PreloadingPromiseTestGroup preloadingPromiseTestGroupM6 = ((a.c.r) this.f263628c).f263587a.M6();
        Kundle kundle = (Kundle) this.f263629d.f393949a;
        String str = (String) this.f263630e.f393949a;
        Area area = (Area) this.f263631f.f393949a;
        this.f263632g.getClass();
        new com.avito.android.search.filter.preloading.a();
        SearchParams searchParams = (SearchParams) this.f263633h.f393949a;
        k.f263616a.getClass();
        return com.avito.android.search.filter.preloading.a.a(gVar, c12, preloadingPromiseTestGroupM6, kundle, str, area, searchParams);
    }
}

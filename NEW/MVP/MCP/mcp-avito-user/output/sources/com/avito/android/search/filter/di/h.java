package com.avito.android.search.filter.di;

import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.remote.model.Category;
import com.avito.android.remote.model.SearchParameters;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.search.filter.di.a;
import com.avito.android.util.C;
import com.avito.android.util.Kundle;
import com.avito.android.util.P2;
import java.util.List;
import javax.inject.Provider;
import kotlin.Q;

/* compiled from: FiltersCoreModule_ProvidePreloadingPromise$_avito_search_filter_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<com.avito.android.preloading.j<com.avito.android.search.filter.preloading.c, Q<List<Category>, P2<SearchParameters>>>> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.search.filter.preloading.i f263228a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f263229b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<PreloadingPromiseTestGroup> f263230c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f263231d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f263232e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f263233f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.search.filter.preloading.b f263234g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f263235h;

    public h(com.avito.android.search.filter.preloading.i iVar, Provider provider, Provider provider2, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, com.avito.android.search.filter.preloading.b bVar, dagger.internal.l lVar4) {
        this.f263228a = iVar;
        this.f263229b = provider;
        this.f263230c = provider2;
        this.f263231d = lVar;
        this.f263232e = lVar2;
        this.f263233f = lVar3;
        this.f263234g = bVar;
        this.f263235h = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.search.filter.preloading.g gVar = (com.avito.android.search.filter.preloading.g) this.f263228a.get();
        C c12 = (C) ((a.c.C34563i) this.f263229b).get();
        PreloadingPromiseTestGroup preloadingPromiseTestGroupM6 = ((a.c.B) this.f263230c).f263188a.M6();
        Kundle kundle = (Kundle) this.f263231d.f393949a;
        String str = (String) this.f263232e.f393949a;
        Area area = (Area) this.f263233f.f393949a;
        this.f263234g.getClass();
        new com.avito.android.search.filter.preloading.a();
        SearchParams searchParams = (SearchParams) this.f263235h.f393949a;
        f.f263225a.getClass();
        return com.avito.android.search.filter.preloading.a.a(gVar, c12, preloadingPromiseTestGroupM6, kundle, str, area, searchParams);
    }
}

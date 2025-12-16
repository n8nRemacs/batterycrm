package com.avito.android.developments_agency_search.screen.big_filters.di;

import android.content.res.Resources;
import com.avito.android.developments_agency_search.screen.big_filters.di.m;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BigFiltersModule_ProvideCategoryParametersElementConverterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<com.avito.android.developments_agency_search.screen.big_filters.converter.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<hJ.e> f136588a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<hJ.g> f136589b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f136590c;

    public e(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f136588a = provider;
        this.f136589b = provider2;
        this.f136590c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        hJ.e eVar = (hJ.e) ((m.b.h) this.f136588a).get();
        hJ.g gVar = (hJ.g) ((m.b.i) this.f136589b).get();
        Resources resources = (Resources) this.f136590c.f393949a;
        c.f136585a.getClass();
        return new com.avito.android.developments_agency_search.screen.big_filters.converter.e(gVar, eVar, resources);
    }
}

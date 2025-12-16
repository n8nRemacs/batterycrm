package com.avito.android.developments_agency_search.screen.location_group.di;

import android.content.res.Resources;
import com.avito.android.developments_agency_search.screen.location_group.di.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import hJ.g;
import javax.inject.Provider;

/* compiled from: LocationGroupDialogModule_ProvideCategoryParametersElementConverterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements h<com.avito.android.developments_agency_search.screen.big_filters.converter.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<hJ.e> f138114a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<g> f138115b;

    /* renamed from: c, reason: collision with root package name */
    public final l f138116c;

    public f(l lVar, Provider provider, Provider provider2) {
        this.f138114a = provider;
        this.f138115b = provider2;
        this.f138116c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        hJ.e eVar = (hJ.e) ((a.c.e) this.f138114a).get();
        g gVar = (g) ((a.c.f) this.f138115b).get();
        Resources resources = (Resources) this.f138116c.f393949a;
        d.f138113a.getClass();
        return new com.avito.android.developments_agency_search.screen.big_filters.converter.e(gVar, eVar, resources);
    }
}

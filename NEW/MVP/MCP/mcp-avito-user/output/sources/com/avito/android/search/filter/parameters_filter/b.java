package com.avito.android.search.filter.parameters_filter;

import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParamsConverter;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FiltersSelectRepositoryFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V0> f263753a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f263754b;

    public b(Provider<V0> provider, Provider<SearchParamsConverter> provider2) {
        this.f263753a = provider;
        this.f263754b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f263753a.get(), this.f263754b.get());
    }
}

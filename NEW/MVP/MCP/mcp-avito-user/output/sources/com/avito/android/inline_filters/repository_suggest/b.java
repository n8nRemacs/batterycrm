package com.avito.android.inline_filters.repository_suggest;

import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParamsConverter;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InlineFiltersSelectRepositoryFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V0> f172350a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f172351b;

    public b(Provider<V0> provider, Provider<SearchParamsConverter> provider2) {
        this.f172350a = provider;
        this.f172351b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(dagger.internal.g.b(this.f172350a), this.f172351b.get());
    }
}

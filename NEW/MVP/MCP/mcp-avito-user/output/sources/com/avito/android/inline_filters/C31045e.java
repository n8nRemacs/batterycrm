package com.avito.android.inline_filters;

import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParamsConverterImpl_Factory;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: GetCategoryTreeUseCaseImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.inline_filters.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31045e implements dagger.internal.h<C30997d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V0> f172294a;

    /* renamed from: b, reason: collision with root package name */
    public final SearchParamsConverterImpl_Factory f172295b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f172296c;

    public C31045e(Provider provider, SearchParamsConverterImpl_Factory searchParamsConverterImpl_Factory, Provider provider2) {
        this.f172294a = provider;
        this.f172295b = searchParamsConverterImpl_Factory;
        this.f172296c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30997d(dagger.internal.g.b(this.f172294a), this.f172295b.get(), this.f172296c.get());
    }
}

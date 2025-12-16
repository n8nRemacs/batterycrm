package com.avito.android.inline_filters;

import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: InlineFiltersGetCounterAndMapButtonsUseCaseImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.inline_filters.n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31054n implements dagger.internal.h<C31052l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V0> f172319a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f172320b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f172321c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InlineFiltersSource> f172322d;

    public C31054n(Provider<V0> provider, Provider<SearchParamsConverter> provider2, Provider<InterfaceC35745a5> provider3, Provider<InlineFiltersSource> provider4) {
        this.f172319a = provider;
        this.f172320b = provider2;
        this.f172321c = provider3;
        this.f172322d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C31052l(dagger.internal.g.b(this.f172319a), this.f172320b.get(), this.f172321c.get(), this.f172322d.get());
    }
}

package com.avito.android.inline_filters;

import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: InlineFiltersInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.inline_filters.q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31057q implements dagger.internal.h<C31056p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V0> f172337a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f172338b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC31047g> f172339c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<T> f172340d;

    /* renamed from: e, reason: collision with root package name */
    public final C31061v f172341e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f172342f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<SerpSpaceType> f172343g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InlineFiltersSource> f172344h;

    public C31057q(Provider provider, Provider provider2, Provider provider3, Provider provider4, C31061v c31061v, Provider provider5, Provider provider6, Provider provider7) {
        this.f172337a = provider;
        this.f172338b = provider2;
        this.f172339c = provider3;
        this.f172340d = provider4;
        this.f172341e = c31061v;
        this.f172342f = provider5;
        this.f172343g = provider6;
        this.f172344h = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f172337a);
        SearchParamsConverter searchParamsConverter = this.f172338b.get();
        InterfaceC31047g interfaceC31047g = this.f172339c.get();
        T t12 = this.f172340d.get();
        this.f172341e.getClass();
        return new C31056p(eVarB, searchParamsConverter, interfaceC31047g, t12, new C31060u(), this.f172342f.get(), this.f172343g.get(), this.f172344h.get());
    }
}

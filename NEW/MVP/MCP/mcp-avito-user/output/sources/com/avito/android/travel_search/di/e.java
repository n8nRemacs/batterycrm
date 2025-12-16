package com.avito.android.travel_search.di;

import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31047g;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.travel_search.di.a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sF0.InterfaceC48043a;

/* compiled from: TravelSearchFiltersModule_ProvideFiltersInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<InterfaceC30995b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48043a> f303060a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f303061b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC31047g> f303062c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f303063d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f303064e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f303065f;

    public e(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f303060a = provider;
        this.f303061b = provider2;
        this.f303062c = provider3;
        this.f303063d = uVar;
        this.f303064e = provider4;
        this.f303065f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC48043a interfaceC48043a = (InterfaceC48043a) ((a.c.f0) this.f303060a).get();
        SearchParamsConverter searchParamsConverter = this.f303061b.get();
        InterfaceC31047g interfaceC31047g = this.f303062c.get();
        com.avito.android.travel_search.domain.c cVar = (com.avito.android.travel_search.domain.c) this.f303063d.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((a.c.R) this.f303064e).get();
        R0 r02 = (R0) ((a.c.C35279s) this.f303065f).get();
        d.f303059a.getClass();
        return new com.avito.android.travel_search.domain.a(interfaceC48043a, searchParamsConverter, cVar, interfaceC31047g, interfaceC35745a5, r02);
    }
}

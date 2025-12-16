package com.avito.android.developments_agency_search.screen.realty_agency_search.di;

import com.avito.android.developments_agency_search.screen.realty_agency_search.di.a;
import com.avito.android.inline_filters.C31060u;
import com.avito.android.inline_filters.C31061v;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31047g;
import com.avito.android.inline_filters.T;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import fi0.InterfaceC40426a;
import javax.inject.Provider;

/* compiled from: InlineFiltersModule_ProvideFiltersInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<InterfaceC30995b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40426a> f138625a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f138626b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC31047g> f138627c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f138628d;

    /* renamed from: e, reason: collision with root package name */
    public final C31061v f138629e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f138630f;

    public j(Provider provider, Provider provider2, Provider provider3, dagger.internal.u uVar, C31061v c31061v, Provider provider4) {
        this.f138625a = provider;
        this.f138626b = provider2;
        this.f138627c = provider3;
        this.f138628d = uVar;
        this.f138629e = c31061v;
        this.f138630f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40426a interfaceC40426a = (InterfaceC40426a) ((a.c.o) this.f138625a).get();
        SearchParamsConverter searchParamsConverter = this.f138626b.get();
        InterfaceC31047g interfaceC31047g = this.f138627c.get();
        T t12 = (T) this.f138628d.get();
        this.f138629e.getClass();
        C31060u c31060u = new C31060u();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((a.c.y) this.f138630f).get();
        i.f138624a.getClass();
        return new com.avito.android.realty_agency.inline_filters.f(interfaceC40426a, searchParamsConverter, interfaceC31047g, t12, c31060u, interfaceC35745a5, false);
    }
}

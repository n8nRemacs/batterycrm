package com.avito.android.realty_agency.checkerboard.di;

import com.avito.android.inline_filters.C31060u;
import com.avito.android.inline_filters.C31061v;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31047g;
import com.avito.android.inline_filters.T;
import com.avito.android.realty_agency.checkerboard.di.g;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import fi0.InterfaceC40426a;
import javax.inject.Provider;

/* compiled from: CheckerboardModule_ProvideFiltersInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<InterfaceC30995b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40426a> f251112a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f251113b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC31047g> f251114c;

    /* renamed from: d, reason: collision with root package name */
    public final u f251115d;

    /* renamed from: e, reason: collision with root package name */
    public final C31061v f251116e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f251117f;

    public e(Provider provider, Provider provider2, Provider provider3, u uVar, C31061v c31061v, Provider provider4) {
        this.f251112a = provider;
        this.f251113b = provider2;
        this.f251114c = provider3;
        this.f251115d = uVar;
        this.f251116e = c31061v;
        this.f251117f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40426a interfaceC40426a = (InterfaceC40426a) ((g.b.m) this.f251112a).get();
        SearchParamsConverter searchParamsConverter = this.f251113b.get();
        InterfaceC31047g interfaceC31047g = this.f251114c.get();
        T t12 = (T) this.f251115d.get();
        this.f251116e.getClass();
        C31060u c31060u = new C31060u();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((g.b.u) this.f251117f).get();
        c.f251110a.getClass();
        return new com.avito.android.realty_agency.inline_filters.f(interfaceC40426a, searchParamsConverter, interfaceC31047g, t12, c31060u, interfaceC35745a5, true);
    }
}

package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments;
import javax.inject.Provider;
import ri0.InterfaceC47661a;

/* compiled from: RealtyAgencySearchBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class A implements dagger.internal.h<C29887w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47661a> f138688a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f138689b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f138690c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f138691d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f138692e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.realty_agency.use_case.d f138693f;

    public A(Provider provider, Provider provider2, dagger.internal.l lVar, Provider provider3, Provider provider4, com.avito.android.realty_agency.use_case.d dVar) {
        this.f138688a = provider;
        this.f138689b = provider2;
        this.f138690c = lVar;
        this.f138691d = provider3;
        this.f138692e = provider4;
        this.f138693f = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C29887w(this.f138688a.get(), this.f138689b.get(), (RealtyAgencySearchArguments) this.f138690c.f393949a, this.f138691d.get(), this.f138692e.get(), (com.avito.android.realty_agency.use_case.a) this.f138693f.get());
    }
}

package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Qw.InterfaceC14939a;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments;
import javax.inject.Provider;
import ri0.InterfaceC47661a;

/* compiled from: RealtyAgencySearchActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29886v implements dagger.internal.h<C29866a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f138963a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47661a> f138964b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Kw.e> f138965c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f138966d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC14939a> f138967e;

    /* renamed from: f, reason: collision with root package name */
    public final Mw.c f138968f;

    public C29886v(Provider provider, Provider provider2, Provider provider3, dagger.internal.l lVar, Provider provider4, Mw.c cVar) {
        this.f138963a = provider;
        this.f138964b = provider2;
        this.f138965c = provider3;
        this.f138966d = lVar;
        this.f138967e = provider4;
        this.f138968f = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C29866a(this.f138963a.get(), this.f138964b.get(), this.f138965c.get(), (RealtyAgencySearchArguments) this.f138966d.f393949a, this.f138967e.get(), (Mw.b) this.f138968f.get());
    }
}

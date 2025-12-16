package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Qw.InterfaceC14939a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import ri0.InterfaceC47661a;
import sw.InterfaceC48423a;

/* compiled from: RealtyAgencySearchInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class J implements dagger.internal.h<I> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48423a> f138750a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14939a> f138751b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f138752c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.developments_agency_search.screen.realty_agency_search.a> f138753d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.developments_agency_search.screen.shared.a> f138754e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f138755f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC47661a> f138756g;

    public J(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f138750a = provider;
        this.f138751b = provider2;
        this.f138752c = provider3;
        this.f138753d = provider4;
        this.f138754e = provider5;
        this.f138755f = uVar;
        this.f138756g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I(this.f138750a.get(), this.f138751b.get(), this.f138752c.get(), this.f138753d.get(), this.f138754e.get(), (Kw.e) this.f138755f.get(), this.f138756g.get());
    }
}

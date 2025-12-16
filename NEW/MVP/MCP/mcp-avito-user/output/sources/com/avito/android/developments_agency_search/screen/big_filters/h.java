package com.avito.android.developments_agency_search.screen.big_filters;

import Qw.InterfaceC14939a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sw.InterfaceC48423a;

/* compiled from: BigFiltersInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f136663a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC48423a> f136664b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC14939a> f136665c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f136663a = uVar;
        this.f136664b = provider;
        this.f136665c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.developments_agency_search.screen.shared.a) this.f136663a.get(), this.f136664b.get(), this.f136665c.get());
    }
}

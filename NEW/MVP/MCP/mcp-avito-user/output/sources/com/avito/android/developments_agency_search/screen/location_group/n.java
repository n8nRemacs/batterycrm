package com.avito.android.developments_agency_search.screen.location_group;

import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sw.InterfaceC48423a;

/* compiled from: LocationGroupInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final u f138218a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC48423a> f138219b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.geo_common.interactor.g> f138220c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f138221d;

    public n(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f138218a = uVar;
        this.f138219b = provider;
        this.f138220c = provider2;
        this.f138221d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((SearchParamsConverter) this.f138218a.get(), this.f138219b.get(), this.f138220c.get(), this.f138221d.get());
    }
}

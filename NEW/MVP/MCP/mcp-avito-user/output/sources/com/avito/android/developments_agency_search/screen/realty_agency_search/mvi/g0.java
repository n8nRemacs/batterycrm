package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import android.content.Context;
import javax.inject.Provider;

/* compiled from: RealtyAgencySearchViewStateAssembler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class g0 implements dagger.internal.h<e0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.developments_agency_search.screen.realty_agency_search.a> f138901a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.skeleton.c> f138902b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f138903c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Context> f138904d;

    public g0(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f138901a = provider;
        this.f138902b = provider2;
        this.f138903c = uVar;
        this.f138904d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e0(this.f138901a.get(), this.f138902b.get(), (com.avito.android.permissions.q) this.f138903c.get(), this.f138904d.get());
    }
}

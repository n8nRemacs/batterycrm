package com.avito.android.mortgage.landing.mvi;

import com.avito.android.mortgage.landing.analytics.InterfaceC32638c;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LandingReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.landing.mvi.builder.i f200290a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage.landing.mvi.builder.d f200291b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC32638c> f200292c;

    public q(com.avito.android.mortgage.landing.mvi.builder.i iVar, com.avito.android.mortgage.landing.mvi.builder.d dVar, Provider provider) {
        this.f200290a = iVar;
        this.f200291b = dVar;
        this.f200292c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mortgage.landing.mvi.builder.g gVar = (com.avito.android.mortgage.landing.mvi.builder.g) this.f200290a.get();
        this.f200291b.getClass();
        return new p(gVar, new com.avito.android.mortgage.landing.mvi.builder.c(), this.f200292c.get());
    }
}

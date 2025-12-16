package com.avito.android.analytics;

import javax.inject.Provider;
import yc.C50213a;

/* compiled from: ServicesAbnormalPriceTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class k0 implements dagger.internal.h<j0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f90225a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f90226b;

    public k0(Provider<InterfaceC28373a> provider, Provider<C50213a> provider2) {
        this.f90225a = provider;
        this.f90226b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j0(this.f90225a.get(), this.f90226b.get());
    }
}

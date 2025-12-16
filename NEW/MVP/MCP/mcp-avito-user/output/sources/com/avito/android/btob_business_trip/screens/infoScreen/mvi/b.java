package com.avito.android.btob_business_trip.screens.infoScreen.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rk.InterfaceC47669a;

/* compiled from: B2bBusinessTripInfoActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.btob_business_trip.screens.common.interactors.a> f107992a;

    /* renamed from: b, reason: collision with root package name */
    public final u f107993b;

    public b(u uVar, Provider provider) {
        this.f107992a = provider;
        this.f107993b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f107992a.get(), (InterfaceC47669a) this.f107993b.get());
    }
}

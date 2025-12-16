package com.avito.android.btob_business_trip.screens.selectItemScreen.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rk.InterfaceC47669a;

/* compiled from: B2bBusinessTripSelectActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.btob_business_trip.screens.common.interactors.a> f108198a;

    /* renamed from: b, reason: collision with root package name */
    public final u f108199b;

    public b(u uVar, Provider provider) {
        this.f108198a = provider;
        this.f108199b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f108198a.get(), (InterfaceC47669a) this.f108199b.get());
    }
}

package com.avito.android.mortgage.root.mvi;

import Y00.InterfaceC18243d;
import e10.InterfaceC39843a;
import javax.inject.Provider;

/* compiled from: MortgageRootReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC39843a> f202940a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f202941b;

    public E(dagger.internal.u uVar, Provider provider) {
        this.f202940a = provider;
        this.f202941b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new D(this.f202940a.get(), (InterfaceC18243d) this.f202941b.get());
    }
}

package com.avito.android.service_orders.mvi;

import javax.inject.Provider;

/* compiled from: ServiceOrdersListReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class F implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f279451a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_persistence.b> f279452b;

    public F(dagger.internal.u uVar, Provider provider) {
        this.f279451a = uVar;
        this.f279452b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new E((InterfaceC34931a) this.f279451a.get(), this.f279452b.get());
    }
}

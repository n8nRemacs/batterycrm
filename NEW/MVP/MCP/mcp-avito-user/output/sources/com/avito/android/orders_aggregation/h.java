package com.avito.android.orders_aggregation;

import c50.InterfaceC26944a;
import dagger.internal.A;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: OrdersAggregationInteractorImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC26944a> f210261a;

    /* renamed from: b, reason: collision with root package name */
    public final A f210262b;

    public h(A a12, Provider provider) {
        this.f210261a = provider;
        this.f210262b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f210261a.get(), (Set) this.f210262b.get());
    }
}

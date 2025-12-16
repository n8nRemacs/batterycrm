package com.avito.android.service_orders.mvi;

/* compiled from: ServiceOrdersListBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f279673a;

    public x(dagger.internal.u uVar) {
        this.f279673a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w((com.avito.android.service_orders.mvi.domain.d) this.f279673a.get());
    }
}

package com.avito.android.service_orders.list;

import com.avito.android.B2;
import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceOrdersListItemConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B2> f279375a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f279376b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_persistence.b> f279377c;

    public f(Provider<B2> provider, Provider<InterfaceC35863o4> provider2, Provider<com.avito.android.service_booking_persistence.b> provider3) {
        this.f279375a = provider;
        this.f279376b = provider2;
        this.f279377c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f279375a.get(), this.f279376b.get(), this.f279377c.get());
    }
}

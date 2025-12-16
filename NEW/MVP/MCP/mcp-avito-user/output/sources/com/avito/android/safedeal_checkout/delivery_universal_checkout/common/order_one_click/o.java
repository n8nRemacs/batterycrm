package com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click;

import com.avito.android.remote.E;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryOrderRealOneClickInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f256963a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f256964b;

    public o(Provider<E> provider, Provider<InterfaceC35745a5> provider2) {
        this.f256963a = provider;
        this.f256964b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f256964b.get(), dagger.internal.g.b(this.f256963a));
    }
}

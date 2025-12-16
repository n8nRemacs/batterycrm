package com.avito.android.safedeal_checkout.delivery_universal_checkout.common;

import com.avito.android.remote.E;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliverySavedAddressCheckInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f256928a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f256929b;

    public k(Provider<E> provider, Provider<InterfaceC35745a5> provider2) {
        this.f256928a = provider;
        this.f256929b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f256928a.get(), this.f256929b.get());
    }
}

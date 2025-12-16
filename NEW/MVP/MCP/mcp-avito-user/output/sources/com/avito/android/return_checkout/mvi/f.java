package com.avito.android.return_checkout.mvi;

import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: DeliveryReturnCheckoutBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f255341a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.return_checkout.a> f255342b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.return_checkout.domain.b f255343c;

    public f(Provider provider, Provider provider2, com.avito.android.return_checkout.domain.b bVar) {
        this.f255341a = provider;
        this.f255342b = provider2;
        this.f255343c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f255341a.get(), this.f255342b.get(), (com.avito.android.return_checkout.domain.a) this.f255343c.get());
    }
}

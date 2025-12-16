package com.avito.android.return_checkout;

import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: DeliveryReturnCheckoutViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f255360a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.return_checkout.mvi.i f255361b;

    public p(Provider provider, com.avito.android.return_checkout.mvi.i iVar) {
        this.f255360a = provider;
        this.f255361b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f255360a.get(), (com.avito.android.return_checkout.mvi.h) this.f255361b.get());
    }
}

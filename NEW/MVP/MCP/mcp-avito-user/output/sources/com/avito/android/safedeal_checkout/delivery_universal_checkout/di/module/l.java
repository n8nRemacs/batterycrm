package com.avito.android.safedeal_checkout.delivery_universal_checkout.di.module;

import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: DeliveryUniversalCheckoutModule_ProvideComponentsFormsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<com.avito.android.safedeal_checkout.delivery_universal_checkout.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f257041a;

    public l(Provider<InterfaceC40691b> provider) {
        this.f257041a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40691b interfaceC40691b = this.f257041a.get();
        j.f257036a.getClass();
        return new com.avito.android.safedeal_checkout.delivery_universal_checkout.a(interfaceC40691b.j(), interfaceC40691b.j(), interfaceC40691b.j());
    }
}

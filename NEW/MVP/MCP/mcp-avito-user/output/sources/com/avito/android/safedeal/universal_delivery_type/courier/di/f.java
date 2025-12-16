package com.avito.android.safedeal.universal_delivery_type.courier.di;

import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypeCourierModule_ProvideComponentsFormsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<com.avito.android.safedeal.universal_delivery_type.courier.f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f256497a;

    public f(Provider<InterfaceC40691b> provider) {
        this.f256497a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40691b interfaceC40691b = this.f256497a.get();
        d.f256492a.getClass();
        return new com.avito.android.safedeal.universal_delivery_type.courier.f(interfaceC40691b.j(), interfaceC40691b.j());
    }
}

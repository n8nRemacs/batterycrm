package com.avito.android.safedeal.universal_delivery_type.di;

import Zi.InterfaceC19564a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalDeliveryTypeModule_ProvideBeduinDeliveryMethodSelectTabActionHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<com.avito.android.safedeal.universal_delivery_type.beduin.a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f256610a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f256611b;

    public o(k kVar, dagger.internal.u uVar) {
        this.f256610a = kVar;
        this.f256611b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC19564a interfaceC19564a = (InterfaceC19564a) this.f256611b.get();
        this.f256610a.getClass();
        return new com.avito.android.safedeal.universal_delivery_type.beduin.a(interfaceC19564a);
    }
}

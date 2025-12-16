package com.avito.android.safedeal.universal_delivery_type.di;

import Zi.InterfaceC19564a;
import Zi.InterfaceC19565b;
import com.avito.android.safedeal.universal_delivery_type.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypeModule_ProvideActionsStoreFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<InterfaceC19564a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f256600a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC19565b> f256601b;

    public l(k kVar, Provider<InterfaceC19565b> provider) {
        this.f256600a = kVar;
        this.f256601b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC19565b interfaceC19565b = (InterfaceC19565b) ((a.c.b) this.f256601b).get();
        this.f256600a.getClass();
        return interfaceC19565b.create();
    }
}

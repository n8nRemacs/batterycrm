package com.avito.android.safedeal.universal_delivery_type.courier.mvi;

import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypeCourierBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f256540a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f256541b;

    /* renamed from: c, reason: collision with root package name */
    public final u f256542c;

    public g(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f256540a = lVar;
        this.f256541b = provider;
        this.f256542c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((UniversalDeliveryTypeContent.Tab.Courier) this.f256540a.f393949a, this.f256541b.get(), (com.avito.android.safedeal.universal_delivery_type.courier.f) this.f256542c.get());
    }
}

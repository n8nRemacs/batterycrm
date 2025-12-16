package com.avito.android.safedeal.universal_delivery_type.courier;

import com.avito.android.safedeal.universal_delivery_type.courier.mvi.i;
import com.avito.android.safedeal.universal_delivery_type.courier.mvi.j;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypeCourierViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f256503a;

    /* renamed from: b, reason: collision with root package name */
    public final j f256504b;

    public h(Provider provider, j jVar) {
        this.f256503a = provider;
        this.f256504b = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f256503a.get(), (i) this.f256504b.get());
    }
}

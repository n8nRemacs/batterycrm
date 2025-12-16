package com.avito.android.safedeal_checkout.delivery_universal_checkout.di.module;

import com.avito.android.deep_linking.links.DeliveryOrderRealOneClickLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DeliveryOrderOneClickDeepLinkHandlerModule_ProvideDeliveryOrderOneClickDeepLinkHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final a f257023a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click.l f257024b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click.i f257025c;

    public b(a aVar, com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click.l lVar, com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click.i iVar) {
        this.f257023a = aVar;
        this.f257024b = lVar;
        this.f257025c = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f257024b.getClass();
        com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click.k kVar = new com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click.k();
        this.f257023a.getClass();
        return new C43834a(DeliveryOrderRealOneClickLink.class, kVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DeliveryOrderRealOneClickLink.class), this.f257025c));
    }
}

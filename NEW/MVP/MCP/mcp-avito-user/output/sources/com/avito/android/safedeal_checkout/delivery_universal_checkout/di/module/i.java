package com.avito.android.safedeal_checkout.delivery_universal_checkout.di.module;

import com.avito.android.deep_linking.links.DeliveryUniversalCheckoutLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DeliveryUniversalCheckoutDeepLinkHandlerModule_ProvideUniversalDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f257034a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safedeal_checkout.delivery_universal_checkout.deeplink_handler.c f257035b;

    public i(e eVar, com.avito.android.safedeal_checkout.delivery_universal_checkout.deeplink_handler.c cVar) {
        this.f257034a = eVar;
        this.f257035b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.safedeal_checkout.delivery_universal_checkout.deeplink_handler.c cVar = this.f257035b;
        this.f257034a.getClass();
        return new C43834a(DeliveryUniversalCheckoutLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DeliveryUniversalCheckoutLink.class), cVar));
    }
}

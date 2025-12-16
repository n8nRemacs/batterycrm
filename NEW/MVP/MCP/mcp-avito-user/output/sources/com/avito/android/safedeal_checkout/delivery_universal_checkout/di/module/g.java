package com.avito.android.safedeal_checkout.delivery_universal_checkout.di.module;

import com.avito.android.deep_linking.links.DeliveryUniversalPayDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DeliveryUniversalCheckoutDeepLinkHandlerModule_ProvideDeliveryUniversalPayDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f257030a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safedeal_checkout.delivery_universal_checkout.deeplink_handler.g f257031b;

    public g(e eVar, com.avito.android.safedeal_checkout.delivery_universal_checkout.deeplink_handler.g gVar) {
        this.f257030a = eVar;
        this.f257031b = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.safedeal_checkout.delivery_universal_checkout.deeplink_handler.g gVar = this.f257031b;
        this.f257030a.getClass();
        return new C43834a(DeliveryUniversalPayDeepLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DeliveryUniversalPayDeepLink.class), gVar));
    }
}

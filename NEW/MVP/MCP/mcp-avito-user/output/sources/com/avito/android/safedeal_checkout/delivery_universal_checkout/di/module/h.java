package com.avito.android.safedeal_checkout.delivery_universal_checkout.di.module;

import com.avito.android.deep_linking.links.DeliveryUniversalCheckoutPvzDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DeliveryUniversalCheckoutDeepLinkHandlerModule_ProvidePvzDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f257032a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safedeal_checkout.delivery_universal_checkout.n f257033b;

    public h(e eVar, com.avito.android.safedeal_checkout.delivery_universal_checkout.n nVar) {
        this.f257032a = eVar;
        this.f257033b = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.safedeal_checkout.delivery_universal_checkout.n nVar = this.f257033b;
        this.f257032a.getClass();
        return new C43834a(DeliveryUniversalCheckoutPvzDeepLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DeliveryUniversalCheckoutPvzDeepLink.class), nVar));
    }
}

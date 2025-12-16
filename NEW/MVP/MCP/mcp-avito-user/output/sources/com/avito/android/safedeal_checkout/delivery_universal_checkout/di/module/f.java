package com.avito.android.safedeal_checkout.delivery_universal_checkout.di.module;

import com.avito.android.deep_linking.links.DeliveryUniversalCheckoutCourierDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DeliveryUniversalCheckoutDeepLinkHandlerModule_ProvideCourierDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f257028a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safedeal_checkout.delivery_universal_checkout.d f257029b;

    public f(e eVar, com.avito.android.safedeal_checkout.delivery_universal_checkout.d dVar) {
        this.f257028a = eVar;
        this.f257029b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.safedeal_checkout.delivery_universal_checkout.d dVar = this.f257029b;
        this.f257028a.getClass();
        return new C43834a(DeliveryUniversalCheckoutCourierDeepLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DeliveryUniversalCheckoutCourierDeepLink.class), dVar));
    }
}

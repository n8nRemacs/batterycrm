package com.avito.android.return_checkout.di.module;

import com.avito.android.deep_linking.links.DeliveryReturnCheckoutLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DeliveryReturnCheckoutDeepLinkHandlerModule_ProvideReturnCheckoutDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final a f255278a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.return_checkout.deeplink_handler.c f255279b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.return_checkout.deeplink_handler.f f255280c;

    public b(a aVar, com.avito.android.return_checkout.deeplink_handler.c cVar, com.avito.android.return_checkout.deeplink_handler.f fVar) {
        this.f255278a = aVar;
        this.f255279b = cVar;
        this.f255280c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f255280c.getClass();
        com.avito.android.return_checkout.deeplink_handler.e eVar = new com.avito.android.return_checkout.deeplink_handler.e();
        com.avito.android.return_checkout.deeplink_handler.c cVar = this.f255279b;
        this.f255278a.getClass();
        return new C43834a(DeliveryReturnCheckoutLink.class, eVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DeliveryReturnCheckoutLink.class), cVar));
    }
}

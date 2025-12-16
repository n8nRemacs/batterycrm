package com.avito.android.safedeal.delivery.order_cancellation.deeplink_handler;

import com.avito.android.deep_linking.links.DeliveryOrderCancelLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DeliveryOrderCancelDeeplinkMappingModule_ProvideDeliveryOrderCancelDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final i f256141a;

    public k(i iVar) {
        this.f256141a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = this.f256141a;
        j.f256140a.getClass();
        return new C43834a(DeliveryOrderCancelLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DeliveryOrderCancelLink.class), iVar));
    }
}

package com.avito.android.order.deeplink;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: OrderDeeplinkHandlerModule_ProvideRedesignedOrderLinkDeeplinkHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.order.deeplink.v2.b f209460a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.order.deeplink.v2.d f209461b;

    public c(com.avito.android.order.deeplink.v2.b bVar, com.avito.android.order.deeplink.v2.d dVar) {
        this.f209460a = bVar;
        this.f209461b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f209461b.getClass();
        com.avito.android.order.deeplink.v2.c cVar = new com.avito.android.order.deeplink.v2.c();
        com.avito.android.order.deeplink.v2.b bVar = this.f209460a;
        a.f209457a.getClass();
        return new C43834a(RedesignedOrderLink.class, cVar, new C43834a.b.C11809b(bVar));
    }
}

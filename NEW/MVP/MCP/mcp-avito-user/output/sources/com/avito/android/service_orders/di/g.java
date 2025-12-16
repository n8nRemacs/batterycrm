package com.avito.android.service_orders.di;

import com.avito.android.service_orders.link.ShowServiceOrdersLink;
import lv.C43834a;

/* compiled from: ServiceOrdersLinkHandlerModule_ProvideServiceOrdersLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_orders.link.c f279137a;

    public g(com.avito.android.service_orders.link.c cVar) {
        this.f279137a = cVar;
    }

    public static C43834a a(com.avito.android.service_orders.link.c cVar) {
        f.f279136a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ShowServiceOrdersLink.class, new com.avito.android.service_orders.link.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ShowServiceOrdersLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f279137a);
    }
}

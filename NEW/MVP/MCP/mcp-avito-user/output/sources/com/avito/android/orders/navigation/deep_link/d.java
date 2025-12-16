package com.avito.android.orders.navigation.deep_link;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.orders_aggregation.OrdersAggregationIntentFactory;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OrdersLinkDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.orders_aggregation.d f210181a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f210182b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.navigation.c f210183c;

    public d(com.avito.android.orders_aggregation.d dVar, dv.b bVar, com.avito.android.navigation.c cVar) {
        this.f210181a = dVar;
        this.f210182b = bVar;
        this.f210183c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((OrdersAggregationIntentFactory) this.f210181a.get(), (a.InterfaceC4053a) this.f210182b.get(), (com.avito.android.navigation.a) this.f210183c.get());
    }
}

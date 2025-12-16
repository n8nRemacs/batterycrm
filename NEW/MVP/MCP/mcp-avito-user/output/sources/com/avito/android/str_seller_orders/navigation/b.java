package com.avito.android.str_seller_orders.navigation;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersIntentFactory;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrOrdersBuyerDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.str_seller_orders.strsellerorders.h f288810a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f288811b;

    public b(com.avito.android.str_seller_orders.strsellerorders.h hVar, dv.b bVar) {
        this.f288810a = hVar;
        this.f288811b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((StrSellerOrdersIntentFactory) this.f288810a.get(), (a.InterfaceC4053a) this.f288811b.get());
    }
}

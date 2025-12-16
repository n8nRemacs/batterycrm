package com.avito.android.str_seller_orders.navigation;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersIntentFactory;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrOrdersSellerDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.str_seller_orders.strsellerorders.h f288819a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f288820b;

    public h(com.avito.android.str_seller_orders.strsellerorders.h hVar, dv.b bVar) {
        this.f288819a = hVar;
        this.f288820b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((StrSellerOrdersIntentFactory) this.f288819a.get(), (a.InterfaceC4053a) this.f288820b.get());
    }
}

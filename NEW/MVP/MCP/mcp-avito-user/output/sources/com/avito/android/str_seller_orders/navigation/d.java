package com.avito.android.str_seller_orders.navigation;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrOrdersRangeDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Ez0.c f288814a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f288815b;

    public d(Ez0.c cVar, dv.b bVar) {
        this.f288814a = cVar;
        this.f288815b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Ez0.b) this.f288814a.get(), (a.InterfaceC4053a) this.f288815b.get());
    }
}
